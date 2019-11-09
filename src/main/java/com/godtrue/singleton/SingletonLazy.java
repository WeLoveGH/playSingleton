package com.godtrue.singleton;

/**
 * @description： 懒汉模式
 *                使用时才进行实例的初始化，提供一个公共的静态方法出去
 *                注意：此方法是非线程安全的
 * @author：qianyingjie1
 * @create：2019-11-08
 */
public class SingletonLazy {

    private static SingletonLazy INSTANCE = null;

    private SingletonLazy(){
    }

    public static SingletonLazy getInstance(){
        if(INSTANCE == null){
            INSTANCE = new SingletonLazy();
        }
        return INSTANCE;
    }
}
