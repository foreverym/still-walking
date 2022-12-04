package com.stillwalking.concurrencyArt.cp1;

/**
 * @Description:
 * @Author wyb
 * @Date 2022年11月30日 21:51  
 */
public class ConcurrencyTest {

    private static final long count = 100000000L;


    /***
     * @Description:join的作用是等线程运行结束后再运行后续的动作
     * @Author: wyb
     * @Date: 2022/11/30 23:51
     * @return: void
     */

    private static void concurrency() throws InterruptedException {
        long start = System.currentTimeMillis();
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                int a = 0;
                for (long i = 0; i < count; i++) {
                    a += 5;
                }
            }
        });

        thread.start();
        int b = 0;
        for (long i = 0; i < count; i++) {
            b--;
        }
        thread.join();
        long time = System.currentTimeMillis() - start;
        System.out.println("concurrency:" + time + "ms,b=," + b);

    }

    private static void serial() {
        long start = System.currentTimeMillis();
        int a = 0;
        for (long i = 0; i < count; i++) {
            a += 5;
        }
        int b = 0;
        for (long i = 0; i < count; i++) {
            b--;
        }
        long time = System.currentTimeMillis() - start;
        System.out.println("serial:" + time + "ms,b=," + b);
    }

    public static void main(String[] args) throws InterruptedException {
        concurrency();
        serial();
    }


}
