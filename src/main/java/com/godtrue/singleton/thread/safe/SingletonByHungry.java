package com.godtrue.singleton.thread.safe;

/**
 * @description： 饿汉模式
 * @author：qianyingjie1
 * @create：2019-11-08
 */
public class SingletonByHungry {
    private static final SingletonByHungry instance = new SingletonByHungry();

    private SingletonByHungry(){
    }

    public static SingletonByHungry getInstance(){
        return instance;
    }
}
