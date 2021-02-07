package com.season.seasonStudy.pattern.singleton;

/**
 * 01-饿汉式-最简单的单例
 * 单线程的实现
 * 在多线程中，会出现多个实例，线程不安全
 */
public class Singleton {
    private static Singleton singleton;

    private Singleton() {}

    public static Singleton getInstance() {
        if (singleton == null) {
            singleton = new Singleton();
        }
        return singleton;
    }

}
