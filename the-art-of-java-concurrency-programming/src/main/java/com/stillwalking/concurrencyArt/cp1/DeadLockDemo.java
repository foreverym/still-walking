package com.stillwalking.concurrencyArt.cp1;

/**
 * @Description: 死锁
 * @Author wyb
 * @Date 2022年12月01日 0:25  
 */
public class DeadLockDemo {

    private static String A = "A";
    private static String B = "B";

    public static void main(String[] args) {

        new DeadLockDemo().deadLock();

    }

    private void deadLock() {
        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (A) {
                    try {
                        System.out.println(">>>>>>>>>A");
                        Thread.currentThread().sleep(2000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    synchronized (B) {
                        System.out.println("1");
                    }
                }
            }
        });


        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                synchronized (B) {
                    System.out.println(">>>>>>>>>B");
                    synchronized (A) {
                        System.out.println("2");
                    }
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}
