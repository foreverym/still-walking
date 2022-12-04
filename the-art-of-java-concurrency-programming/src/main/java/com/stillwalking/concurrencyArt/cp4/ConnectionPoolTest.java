package com.stillwalking.concurrencyArt.cp4;

import java.sql.Connection;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @Description: 测试类
 * @Author wyb
 * @Date 2022年12月03日 23:09  
 */
public class ConnectionPoolTest {

    static ConnectionPool pool = new ConnectionPool(10);
    // 保证所有的ConnectionRunner能够同时开始
    static CountDownLatch start = new CountDownLatch(1);
    // main线程会等待所有的ConnectionRunner结束后才能继续执行
    static CountDownLatch end;

    public static void main(String[] args) throws Exception {


//        synchronized (pool) {
//            pool.wait(2000);
//            System.out.println(">>>等待结束");
//        }
//        synchronized (pool) {
//            pool.wait();
//            System.out.println(">>>等待结束");
//        }
        // 线程数量，可以修改线程数量进行观察
        int threadCount = 40;
        end = new CountDownLatch(threadCount);
        int count = 20;
        AtomicInteger got = new AtomicInteger();
        AtomicInteger notGot = new AtomicInteger();
        for (int i = 0; i < threadCount; i++) {
            Thread thread = new Thread(new ConnectionRunner(count, got, notGot), "ConnectionRunnerThread");
            thread.start();
        }

        // latch里维护了一个状态值，countDown会使这个状态值减1，await会一直阻塞到这个状态值为0时执行主线程
        start.countDown();
        end.await();
        System.out.println("total invoke: " + (threadCount * count));
        System.out.println("got connection " + got);
        System.out.println("not got connection " + notGot);
    }


    static class ConnectionRunner implements Runnable {

        int count;
        AtomicInteger got;
        AtomicInteger notGot;

        public ConnectionRunner(int count, AtomicInteger got, AtomicInteger notGot) {
            this.count = count;
            this.got = got;
            this.notGot = notGot;
        }

        @Override
        public void run() {
            try {
                // 会一直阻塞到所有线程都启动完
                start.await();
            } catch (Exception ex) {

            }
            while (count > 0) {
                try {
                    // 从线程池中获取连接，如果1000ms内无法获取到，将会返回null
                    // 分别统计连接获取的数量got和为获取到的数量notgot
                    Connection connection = pool.fetchConnection(1000);
                    if (connection != null) {
                        try {
                            connection.createStatement();
                            // 通过代理的方式在执行commit的时候等待100ms,为了更好复现释放连接取连接超时的这种情况
                            connection.commit();
                        } finally {
                            pool.releaseConnection(connection);
                            got.incrementAndGet();
                        }
                    } else {
                        notGot.incrementAndGet();
                    }
                } catch (Exception exception) {

                } finally {
                    count--;
                }
            }
            end.countDown();
        }
    }

}
