package com.godtrue.singleton.test;

import com.godtrue.singleton.SingletonField;

/**
 * @description：
 * @author：qianyingjie1
 * @create：2019-11-08
 */
public class TestSingletonField {
    public static void main(String[] args) {
        SingletonField singleton = SingletonField.INSTANCE;
        System.out.println(singleton);
    }
}
