package com.stillwalking.concurrencyArt.cp4;

public interface ThreadPool<Job extends Runnable> {

    // 执行一个job，这个job需要实现runnable
    void execute(Job job);
    // 关闭线程池
    void shutDown();
    // 增加工作者线程
    void addWorkers(int num);
    // 减少工作者线程
    void removeWorker(int num);
    // 得到正在等待的执行任务的数量
    int getJobSize();

}
