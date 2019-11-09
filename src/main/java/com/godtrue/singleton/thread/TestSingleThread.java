package com.godtrue.singleton.thread;

import com.godtrue.singleton.thread.safe.*;
import com.godtrue.singleton.thread.unsafe.SingletonByLazy;

/**
 * @description： 单线程的方式来测试，这种方式很难测试出线程不安全的单例模式的问题
 * @author：qianyingjie1
 * @create：2019-11-08
 */
public class TestSingleThread {
    public static void main(String[] args) {
        test0();
        test1();
        test2();
        test3();
        test4();
        test5();
        test6();
        test7();
        test8();
        test9();
        test10();
    }

    private static void test0(){
        SingletonByEnum singleton1 = SingletonByEnum.INSTANCE;
        SingletonByEnum singleton2 = SingletonByEnum.INSTANCE;
        if(singleton1 == singleton2){
            System.out.println(singleton1 + " = " + singleton2);
        }else {
            System.out.println(singleton1 + " != " + singleton2);
        }
    }

    private static void test1(){
        SingletonByLazy singleton1 = SingletonByLazy.getInstance();
        SingletonByLazy singleton2 = SingletonByLazy.getInstance();
        if(singleton1 == singleton2){
            System.out.println(singleton1 + " = " + singleton2);
        }else {
            System.out.println(singleton1 + " != " + singleton2);
        }
    }

    private static void test2(){
        SingletonByDoubleCheckLock singleton1 = SingletonByDoubleCheckLock.getInstance();
        SingletonByDoubleCheckLock singleton2 = SingletonByDoubleCheckLock.getInstance();
        if(singleton1 == singleton2){
            System.out.println(singleton1 + " = " + singleton2);
        }else {
            System.out.println(singleton1 + " != " + singleton2);
        }
    }

    private static void test3(){
        SingletonByDoubleCheckLock_1 singleton1 = SingletonByDoubleCheckLock_1.getInstance();
        SingletonByDoubleCheckLock_1 singleton2 = SingletonByDoubleCheckLock_1.getInstance();
        if(singleton1 == singleton2){
            System.out.println(singleton1 + " = " + singleton2);
        }else {
            System.out.println(singleton1 + " != " + singleton2);
        }
    }

    private static void test4(){
        SingletonByHungry singleton1 = SingletonByHungry.getInstance();
        SingletonByHungry singleton2 = SingletonByHungry.getInstance();
        if(singleton1 == singleton2){
            System.out.println(singleton1 + " = " + singleton2);
        }else {
            System.out.println(singleton1 + " != " + singleton2);
        }
    }

    private static void test5(){
        SingletonByInnerClass singleton1 = SingletonByInnerClass.getInstance();
        SingletonByInnerClass singleton2 = SingletonByInnerClass.getInstance();
        if(singleton1 == singleton2){
            System.out.println(singleton1 + " = " + singleton2);
        }else {
            System.out.println(singleton1 + " != " + singleton2);
        }
    }

    private static void test6(){
        SingletonByLock singleton1 = SingletonByLock.getInstance();
        SingletonByLock singleton2 = SingletonByLock.getInstance();
        if(singleton1 == singleton2){
            System.out.println(singleton1 + " = " + singleton2);
        }else {
            System.out.println(singleton1 + " != " + singleton2);
        }
    }

    private static void test7(){
        SingletonByReentrantLock singleton1 = SingletonByReentrantLock.getInstance();
        SingletonByReentrantLock singleton2 = SingletonByReentrantLock.getInstance();
        if(singleton1 == singleton2){
            System.out.println(singleton1 + " = " + singleton2);
        }else {
            System.out.println(singleton1 + " != " + singleton2);
        }
    }

    private static void test8(){
        SingletonBySynchronized singleton1 = SingletonBySynchronized.getInstance();
        SingletonBySynchronized singleton2 = SingletonBySynchronized.getInstance();
        if(singleton1 == singleton2){
            System.out.println(singleton1 + " = " + singleton2);
        }else {
            System.out.println(singleton1 + " != " + singleton2);
        }
    }

    private static void test9(){
        SingletonBySynchronizedBlock singleton1 = SingletonBySynchronizedBlock.getInstance();
        SingletonBySynchronizedBlock singleton2 = SingletonBySynchronizedBlock.getInstance();
        if(singleton1 == singleton2){
            System.out.println(singleton1 + " = " + singleton2);
        }else {
            System.out.println(singleton1 + " != " + singleton2);
        }
    }

    private static void test10(){
        SingletonByThreadLocal singleton1 = SingletonByThreadLocal.getInstance();
        SingletonByThreadLocal singleton2 = SingletonByThreadLocal.getInstance();
        if(singleton1 == singleton2){
            System.out.println(singleton1 + " = " + singleton2);
        }else {
            System.out.println(singleton1 + " != " + singleton2);
        }
    }
}
