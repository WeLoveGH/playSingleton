package com.godtrue.singleton.test;

import com.godtrue.singleton.SingletonLazy_2;

/**
 * @description：
 * @author：qianyingjie1
 * @create：2019-11-08
 */
public class TestSingletonLazy_2 {
    public static void main(String[] args) {
        SingletonLazy_2 singleton = SingletonLazy_2.getInstance();
        System.out.println(singleton);
    }
}
