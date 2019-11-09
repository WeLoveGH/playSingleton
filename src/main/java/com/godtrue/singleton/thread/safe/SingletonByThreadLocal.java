package com.godtrue.singleton.thread.safe;

/**
 * @description： 懒汉模式，通过 ThreadLocal 实现
 * @author：qianyingjie1
 * @create：2019-11-08
 */
public class SingletonByThreadLocal {
    private static ThreadLocal<SingletonByThreadLocal> singletonByThreadLocalThreadLocal = new ThreadLocal<SingletonByThreadLocal>();

    private static SingletonByThreadLocal instance;

    public static SingletonByThreadLocal getInstance(){
        if(singletonByThreadLocalThreadLocal.get() == null){
            synchronized (SingletonByThreadLocal.class){
                if(instance == null){
                    instance = new SingletonByThreadLocal();
                }
            }
            singletonByThreadLocalThreadLocal.set(instance);
        }
        return singletonByThreadLocalThreadLocal.get();
    }
}
