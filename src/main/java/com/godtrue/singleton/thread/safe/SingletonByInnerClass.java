package com.godtrue.singleton.thread.safe;

/**
 * @description： 内部类实现
 * @author：qianyingjie1
 * @create：2019-11-08
 */
public class SingletonByInnerClass {
    private static class InnerClass{
        private final static SingletonByInnerClass instance = new SingletonByInnerClass();
    }

    private SingletonByInnerClass(){
    }

    public static SingletonByInnerClass getInstance(){
        return InnerClass.instance;
    }
}
