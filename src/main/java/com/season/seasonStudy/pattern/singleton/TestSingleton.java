package com.season.seasonStudy.pattern.singleton;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import lombok.SneakyThrows;

/**
 * 普通单例的测试方法
 * TODO 会出现一个问题，线程在不断执行，会卡住，有2个解决方案，但是我不知道为什么
 * 解决方案
 * 1.在for循环中进行sleep
 * 2.lock -> volatile lock
 */
public class TestSingleton {

//    private volatile boolean lock;
    private boolean lock;

    public boolean isLock() {
        return lock;
    }

    public void setLock(boolean lock) {
        this.lock = lock;
    }

    public static void main(String[] args) throws InterruptedException {
        final Set<String> instanceSet = Collections.synchronizedSet(new HashSet<String>());
        final TestSingleton lock = new TestSingleton();
        lock.setLock(true);
        ExecutorService executorService = Executors.newCachedThreadPool();
        for (int i = 0; i < 10; i++) {
            executorService.execute(new Runnable() {

                @SneakyThrows
                public void run() {
                    while (true) {
//                        Thread.sleep(10); // 不知道是不是因为一直for循环，卡住了
                        if (!lock.isLock()) {
                            Singleton singleton = Singleton.getInstance();
                            instanceSet.add(singleton.toString());
                            break;
                        }
                    }
                }
            });
        }
        Thread.sleep(5000);
        lock.setLock(false);
        Thread.sleep(5000);
        System.out.println("------并发情况下我们取到的实例------");
        for (String instance : instanceSet) {
            System.out.println(instance);
        }
        executorService.shutdown();
    }

}
