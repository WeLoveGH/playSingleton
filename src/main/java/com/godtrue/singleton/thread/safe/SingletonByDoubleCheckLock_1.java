package com.godtrue.singleton.thread.safe;

import java.util.concurrent.locks.ReentrantLock;

/**
 * @description： 懒汉模式，通过双重检查的方式实现，ReentrantLock 可重入锁实现
 * @author：qianyingjie1
 * @create：2019-11-08
 */
public class SingletonByDoubleCheckLock_1 {
    private volatile static SingletonByDoubleCheckLock_1 instance;

    private SingletonByDoubleCheckLock_1(){
    }

    private static final ReentrantLock lock = new ReentrantLock();

    public static SingletonByDoubleCheckLock_1 getInstance(){
        if(instance == null){
            lock.lock();
            try {
                if(instance == null){
                    instance = new SingletonByDoubleCheckLock_1();
                }
            }finally {
                lock.unlock();
            }
        }
        return instance;
    }
}
