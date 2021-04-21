package com.season.seasonStudy.thread;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.LongAdder;

/**
 * season: 创建10000个线程，求和
 */
public class VolatileTestE {
    static LongAdder longAdder = new LongAdder();
    volatile static Long num = 0L;

    static class TestRunnable implements Runnable{
        @Override
        public void run() {
            num++;
            longAdder.increment();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ExecutorService threadPool = Executors.newFixedThreadPool(20); // 重复使用？
        for (int i = 0; i < 10000; i++) {
            threadPool.execute(new TestRunnable());
        }
        threadPool.shutdown();

//        Thread.sleep(5000); // 等待线程执行完成

        while(!threadPool.isShutdown() || !threadPool.isTerminated()){}

            System.out.println("num = " + num);
            System.out.println("longAdder = " + longAdder);
    }
}
