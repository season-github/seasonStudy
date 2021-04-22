package com.season.seasonStudy.thread;

/**
 * TODO 如果一个属性没被volatile修饰，多线程情况下，什么时候将缓存同步到内存中
 * 测试中100个线程没有发现内存一致
 */
public class VolatileTest {
    public static void main(String[] args) {
        try {

        int count =0;
        Child.setA(1);
        for (int i=0; i<100; i++){ // 100个线程
            new Thread(() -> {
                try {
                    // 保证先让主线程读到A的值后再写入
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Child.setA(3);
                System.out.println("child-thread"+Thread.currentThread().getName()+": read variable A - " + Child.A);
            }).start();
        }
        System.out.println("main-thread: read variable A - " + Child.A);
        // 如果无法感知，主线程一直循环
        while (Child.A == 1) {
            count++;
            //  Thread.sleep(10); // 线程sleep，完成内存一致
            //  System.out.println("123"); // synchronized，内存一致
        }
        System.out.println("main-thread: read variable A - " + Child.A);
        } catch (Exception e){
            e.printStackTrace();
        }
    }

    static class Child {
        static int A = 0;
        //        static volatile int A = 0;

        public static void setA(int a) {
            A = a;
        }
    }
}
