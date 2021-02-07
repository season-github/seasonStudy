package com.season.seasonStudy.thread;

import java.util.concurrent.atomic.AtomicInteger;

public class VolatileTestC {

    public static void main(String[] args) {
        AtomicInteger a = new AtomicInteger(1);
        new Thread(() -> {
            try {
                // 保证先让主线程读到A的值后再写入
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            a.set(3);
            System.out.println("child-thread: read variable A - " + a);
        }).start();
        System.out.println("main-thread: read variable A - " + a);
        // 如果无法感知，主线程一直循环
        while (a.get() == 1) {
            try {
                //                Thread.sleep(10);
            } catch (Exception e) {

            }
            //            System.out.println("123");
        }
        System.out.println("main-thread: read variable A - " + a);
    }


}