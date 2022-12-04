package com.stillwalking.concurrencyArt.cp4;

import java.sql.Connection;
import java.util.LinkedList;

/**
 * @Description: 连接池示例
 * @Author wyb
 * @Date 2022年12月03日 13:48  
 */
public class ConnectionPool {

    /**
     * @Description:
     * @Author: wyb
     * @Date: 2022/12/3 13:49
     * @param null:
     * @return: null
     */
    private LinkedList<Connection> pool = new LinkedList<>();

    public ConnectionPool(int initialSize) {
        if (initialSize > 0) {
            for (int i = 0; i < initialSize; i++) {
                pool.addLast(ConnectionDriver.createConnection());
            }
        }
    }

    public void releaseConnection(Connection connection) {
        if (connection != null) {
            synchronized (pool) {
                // 连接池释放以后需要进行通知，这样其他消费者就能感知到连接池中已经归还了一个连接
                pool.addLast(connection);
                pool.notifyAll();
            }
        }
    }

    // 在mills内无法获得连接，将会返回null
    public Connection fetchConnection(long mills) throws InterruptedException {
        synchronized (pool) {
            if (mills <= 0) {
                while (pool.isEmpty()) {
                    pool.wait();
                }
                // removeFirst方法首先判断头节点是否为空，若不为空，则将该节点的next节点设为头，并返回该节点。
                return pool.removeFirst();
            } else {
                long future = System.currentTimeMillis() + mills;
                long remaining = mills;
                // 当remaining小于或者等于0的时候表示已经超时
                // 次数只设置了一处等待超时，是否可以将这一次时间进行拆分多次获取连接
                while (pool.isEmpty() && remaining > 0) {
                    // 线程进入等待状态直到它被通知或者经过指定的时间(wait会释放锁，进入等待池中）如果当前线程不是锁的持有者会报IllegalMonitorStateException
                    pool.wait(remaining);
                    remaining = future - System.currentTimeMillis();
                }
                Connection result = null;
                if (!pool.isEmpty()) {
                    result = pool.removeFirst();
                }
                return result;
            }
        }
    }
}
