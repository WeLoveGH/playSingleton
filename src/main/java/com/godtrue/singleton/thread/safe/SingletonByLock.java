package com.godtrue.singleton.thread.safe;

/**
 * @description： 懒汉模式，通过同步代码块的方式实现
 * @author：qianyingjie1
 * @create：2019-11-08
 */
public class SingletonByLock {
    private static SingletonByLock instance;

    private SingletonByLock(){
    }

    private static final Object lock = new Object();

    public static SingletonByLock getInstance(){
        synchronized (lock){
            if(instance == null){
                instance = new SingletonByLock();
            }
        }
        return instance;
    }
}
