package com.godtrue.singleton.test;

import com.godtrue.singleton.SingletonEnum;

/**
 * @description：
 * @author：qianyingjie1
 * @create：2019-11-08
 */
public class TestSingletonEnum {
    public static void main(String[] args) {

        SingletonEnum singleton = SingletonEnum.INSTANCE;

        System.out.println(singleton.getValue());

        singleton.setValue(2);

        System.out.println(singleton.getValue());
    }
}
