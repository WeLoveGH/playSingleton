package com.godtrue.singleton.thread.safe;

/**
 * @description： 懒汉模式，通过双重检查的方式实现，synchronized 同步锁实现
 * @author：qianyingjie1
 * @create：2019-11-08
 */
public class SingletonByDoubleCheckLock {
    private volatile static SingletonByDoubleCheckLock instance;

    private SingletonByDoubleCheckLock(){
    }

    public static SingletonByDoubleCheckLock getInstance(){
        if(instance == null){
            synchronized (SingletonByDoubleCheckLock.class){
                if(instance == null){
                    instance = new SingletonByDoubleCheckLock();
                }
            }
        }
        return instance;
    }
}
