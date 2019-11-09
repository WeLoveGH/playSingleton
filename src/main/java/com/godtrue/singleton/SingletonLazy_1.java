package com.godtrue.singleton;

/**
 * @description： 饿汉模式的另外一种实现，是线程安全的，不过，由于在获取实例的静态方法上加了同步锁，所以，性能不好
 * @author：qianyingjie1
 * @create：2019-11-08
 */
public class SingletonLazy_1 {

    private static SingletonLazy_1 INSTANCE = null;

    private SingletonLazy_1(){
    }

    public static synchronized SingletonLazy_1 getInstance(){
        if(INSTANCE == null){
            INSTANCE = new SingletonLazy_1();
        }
        return INSTANCE;
    }
}
