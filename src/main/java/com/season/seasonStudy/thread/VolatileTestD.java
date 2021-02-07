package com.season.seasonStudy.thread;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class VolatileTestD {
    static int num = 0;
    static List<Integer> list = new ArrayList<>();

    public static void main(String[] args) throws InterruptedException {
        ExecutorService threadPool = Executors.newCachedThreadPool();
        for (int i = 0; i < 100; i++) {
            threadPool.execute(VolatileTestD::run);
        }
        long begin = new Date().getTime();

        while (num < 10000){
            long end = new Date().getTime();
            int aa = (int)(end-begin);
            int a = num; // 这个值是0，主线程的num，未read内存中的数据
            boolean check = aa > 10000;
            if (check){
                System.out.println(a);
                System.out.println(num);
                System.out.println(Thread.activeCount());
            }
        }
        System.out.println("-----------------");
        System.out.println(num);
        System.out.println(list);
    }

    private static void run() {
        try {
            Thread.sleep(1000);
            List<Integer> ll = new ArrayList<>();
            for (int i = 0; i < 100_000; i++){
               ll.add(++num);
            }
            System.out.println(ll);
            list.add(num);
        } catch (Exception e) {

        }
    }
}
