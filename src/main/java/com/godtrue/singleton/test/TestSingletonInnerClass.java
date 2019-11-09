package com.godtrue.singleton.test;

import com.godtrue.singleton.SingletonInnerClass;

/**
 * @description：
 * @author：qianyingjie1
 * @create：2019-11-08
 */
public class TestSingletonInnerClass {
    public static void main(String[] args) {
        SingletonInnerClass singleton = SingletonInnerClass.Singleton.getInstance();
        System.out.println(singleton);
    }
}
