package com.season.seasonStudy.pattern.singleton;

/**
 * 02-饿汉式-获取的方法同步
 * 性能消耗较大，但是能解决线程安全的问题
 */
public class BadSynchronizedSingleton {

    private static BadSynchronizedSingleton instance;

    private BadSynchronizedSingleton(){}

    public synchronized static BadSynchronizedSingleton getInstance(){
        if (instance==null){
            instance = new BadSynchronizedSingleton();
        }
        return instance;
    }

}
