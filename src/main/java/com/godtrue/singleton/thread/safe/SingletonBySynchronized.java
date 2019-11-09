package com.godtrue.singleton.thread.safe;

/**
 * @description： 懒汉模式，通过 synchronized 同步锁实现
 * @author：qianyingjie1
 * @create：2019-11-08
 */
public class SingletonBySynchronized {

    private static SingletonBySynchronized instance;

    private SingletonBySynchronized(){
    }

    public synchronized static SingletonBySynchronized getInstance(){
        if(instance == null){
            instance = new SingletonBySynchronized();
        }
        return instance;
    }
}
