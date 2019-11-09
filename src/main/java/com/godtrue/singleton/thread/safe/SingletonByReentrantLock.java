package com.godtrue.singleton.thread.safe;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @description： 懒汉模式，通过 ReentrantLock 可重入锁实现
 * @author：qianyingjie1
 * @create：2019-11-08
 */
public class SingletonByReentrantLock {
    private volatile static SingletonByReentrantLock instance;

    private SingletonByReentrantLock(){
    }

    private static final ReentrantLock lock = new ReentrantLock();

    public static SingletonByReentrantLock getInstance(){
        try {
            lock.lock();
            if(instance == null){
                instance = new SingletonByReentrantLock();
            }
            return instance;
        }finally {
            lock.unlock();
        }
    }
}
