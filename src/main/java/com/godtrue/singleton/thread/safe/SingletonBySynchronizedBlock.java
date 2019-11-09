package com.godtrue.singleton.thread.safe;

/**
 * @description： 懒汉模式，通过 synchronized 同步锁实现
 * @author：qianyingjie1
 * @create：2019-11-08
 */
public class SingletonBySynchronizedBlock {
    private static SingletonBySynchronizedBlock instance;

    private SingletonBySynchronizedBlock(){
    }

    public static SingletonBySynchronizedBlock getInstance(){
        synchronized (SingletonBySynchronizedBlock.class){
            if(instance == null){
                instance = new SingletonBySynchronizedBlock();
            }
        }
        return instance;
    }
}
