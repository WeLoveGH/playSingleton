package com.godtrue.singleton.test;

import com.godtrue.singleton.SingletonFactory;

/**
 * @description：
 * @author：qianyingjie1
 * @create：2019-11-08
 */
public class TestSingletonFactory {
    public static void main(String[] args) {
        SingletonFactory singleton = SingletonFactory.getInstance();
        System.out.println(singleton);
    }
}
