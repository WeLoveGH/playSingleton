package com.godtrue.singleton.test;

import com.godtrue.singleton.SingletonLazy_1;

/**
 * @description：
 * @author：qianyingjie1
 * @create：2019-11-08
 */
public class TestSingletonLazy_1 {
    public static void main(String[] args) {
        SingletonLazy_1 singleton = SingletonLazy_1.getInstance();
        System.out.println(singleton);
    }
}
