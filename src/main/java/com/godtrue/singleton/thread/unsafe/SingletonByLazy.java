package com.godtrue.singleton.thread.unsafe;

/**
 * @description： 懒汉模式，非线程安全
 * @author：qianyingjie1
 * @create：2019-11-08
 */
public class SingletonByLazy {
    private static SingletonByLazy instance;

    private SingletonByLazy(){
    }

    public static SingletonByLazy getInstance(){
        if(instance == null){
            instance = new SingletonByLazy();
        }
        return instance;
    }
}
