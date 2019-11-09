package com.godtrue.singleton.test;

import com.godtrue.singleton.SingletonEnum;

import java.lang.reflect.Constructor;

/**
 * @description： 演示使用枚举的方式可以避免反序列化的安全的问题
 * @author：qianyingjie1
 * @create：2019-11-08
 */
public class TestSingletonReflection_1 {
    public static void main(String[] args) throws Exception{
        SingletonEnum singleton = SingletonEnum.INSTANCE;

        Constructor constructor = singleton.getClass().getDeclaredConstructor(new Class[0]);
        constructor.setAccessible(true);

        SingletonEnum singleton2 = (SingletonEnum) constructor.newInstance();

        if(singleton == singleton2){
            System.out.println("The two objects are same");
        }else {
            System.out.println("The two objects are not same");
        }

        singleton.setValue(1);
        singleton2.setValue(2);

        System.out.println(singleton.getValue());
        System.out.println(singleton2.getValue());
    }
}

/*

Exception in thread "main" java.lang.NoSuchMethodException: com.godtrue.singleton.SingletonEnum.<init>()
	at java.lang.Class.getConstructor0(Class.java:3082)
	at java.lang.Class.getDeclaredConstructor(Class.java:2178)
	at com.godtrue.singleton.test.TestSingletonReflection_1.main(TestSingletonReflection_1.java:16)

 */