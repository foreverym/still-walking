package com.stillwalking.concurrencyArt.cp4;

import java.util.concurrent.*;

/**
 * @Description:
 * @Author wyb
 * @Date 2022年12月04日 20:41  
 */
public class ThreadPoolClient {

    public static void main(String[] args) {
        DefaultThreadPool<Runnable> runnableDefaultThreadPool = new DefaultThreadPool<>();
        runnableDefaultThreadPool.execute(new Runnable() {
            @Override
            public void run() {
                System.out.println(Thread.currentThread() + "开始运行");
            }
        });
    }
}
