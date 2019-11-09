package com.godtrue.singleton;

/**
 * @description： 饿汉模式的另外一种实现，使用了双重检查的方式来保证线程的安全性和性能
 *                不过也存在一点小问题，又有构建一个对象不是原子操作，在高并发的场景下，可能存在判断对象不为空，但是对象没有进行初始化的情况
 *
 *                一个对象的创建过程大概如下：
 *                首先：为实例变量赋予对象分配的堆内存空间的地址
 *                第一步：为新生对象分配堆内存空间
 *                第二步：将分配到的内存空间都赋予默认值，JVM针对每个属性都有一个对应的默认值
 *                第三步：对分配到的内存空间都赋予指定的值，程序员指定的值
 * @author：qianyingjie1
 * @create：2019-11-08
 */
public class SingletonLazy_2 {

    private static SingletonLazy_2 INSTANCE = null;

    private SingletonLazy_2(){
    }

    public static SingletonLazy_2 getInstance(){
        if(INSTANCE == null){
            synchronized (SingletonLazy_2.class){
                if(INSTANCE == null){
                    INSTANCE = new SingletonLazy_2();
                }
            }
        }
        return INSTANCE;
    }
}
