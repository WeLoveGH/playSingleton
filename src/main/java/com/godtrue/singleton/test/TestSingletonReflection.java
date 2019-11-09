package com.godtrue.singleton.test;

import com.godtrue.singleton.SingletonField;

import java.lang.reflect.Constructor;

/**
 * @description： 演示私有的构造方法不能保证反序列化安全的示例
 * @author：qianyingjie1
 * @create：2019-11-08
 */
public class TestSingletonReflection {
    public static void main(String[] args) throws Exception{
        SingletonField singleton = SingletonField.INSTANCE;

        Constructor constructor = singleton.getClass().getDeclaredConstructor(new Class[0]);
        constructor.setAccessible(true);

        SingletonField singleton2 = (SingletonField) constructor.newInstance();

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

The two objects are not same
1
2


 */