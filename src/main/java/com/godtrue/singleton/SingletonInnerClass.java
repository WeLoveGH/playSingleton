package com.godtrue.singleton;

/**
 * @description： 懒汉模式的另外一种实现，使用静态内部类的方式实现
 * @author：qianyingjie1
 * @create：2019-11-08
 */
public class SingletonInnerClass {

    private static SingletonInnerClass INSTANCE;

    private SingletonInnerClass (){
    }

    public static class Singleton {
        public static SingletonInnerClass getInstance(){
            if(INSTANCE == null){
                INSTANCE = new SingletonInnerClass();
            }
            return INSTANCE;
        }
    }
}
