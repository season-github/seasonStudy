package com.season.seasonStudy.pattern.singleton;

/**
 * 03-饿汉式-双重锁
 * 锁1.在获取实例时，判断实例是否存在
 * 生成实例的代码，进行同步synchronized
 * 锁2.在生成实例时，判断实例是否存在
 */
public class SynchronizedSingleton {
    private static SynchronizedSingleton instance;
    private SynchronizedSingleton(){}
    public static SynchronizedSingleton getInstance(){
        if (null == instance){
            synchronized (SynchronizedSingleton.class){
                if (null == instance){
                    instance = new SynchronizedSingleton();
                }
            }
        }
        return instance;
    }
}
