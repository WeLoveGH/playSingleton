package com.godtrue.singleton.test;

import com.godtrue.singleton.SingletonLazy;

/**
 * @description：
 * @author：qianyingjie1
 * @create：2019-11-08
 */
public class TestSingletonLazy {
    public static void main(String[] args) {
        SingletonLazy singleton = SingletonLazy.getInstance();
        System.out.println(singleton);
    }
}
