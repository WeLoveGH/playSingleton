package com.godtrue.singleton.thread;

import com.godtrue.singleton.thread.unsafe.SingletonByLazy;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @description： 多线程环境下测试，这种测试方式还是比较容易测试出线程不安全的现象的
 * @author：qianyingjie1
 * @create：2019-11-08
 */
public class TestMultiThread {

    private static final int MAX_THREAD = 10;

    private static final Map<Object,Object> map = new ConcurrentHashMap<Object,Object>();

    public static void main(String[] args) throws Exception{
        TestThread[] testThreads = new TestThread[MAX_THREAD];

        for (int i = 0; i < testThreads.length; i++) {
            testThreads[i] = new TestThread();
        }

        for (int i = 0; i < testThreads.length; i++) {
            testThreads[i].start();
        }
    }
}

class TestThread extends Thread{

    public void run(){
        Object o = SingletonByLazy.getInstance();
        System.out.println(o);
    }
}

/*



com.godtrue.singleton.thread.unsafe.SingletonByLazy@677dadda —— 其他实例
com.godtrue.singleton.thread.unsafe.SingletonByLazy@338f7170
com.godtrue.singleton.thread.unsafe.SingletonByLazy@338f7170
com.godtrue.singleton.thread.unsafe.SingletonByLazy@338f7170
com.godtrue.singleton.thread.unsafe.SingletonByLazy@338f7170
com.godtrue.singleton.thread.unsafe.SingletonByLazy@338f7170
com.godtrue.singleton.thread.unsafe.SingletonByLazy@338f7170
com.godtrue.singleton.thread.unsafe.SingletonByLazy@338f7170
com.godtrue.singleton.thread.unsafe.SingletonByLazy@338f7170
com.godtrue.singleton.thread.unsafe.SingletonByLazy@338f7170



com.godtrue.singleton.thread.unsafe.SingletonByLazy@371adbca —— 其他实例
com.godtrue.singleton.thread.unsafe.SingletonByLazy@5102a646
com.godtrue.singleton.thread.unsafe.SingletonByLazy@5102a646
com.godtrue.singleton.thread.unsafe.SingletonByLazy@5102a646
com.godtrue.singleton.thread.unsafe.SingletonByLazy@5102a646
com.godtrue.singleton.thread.unsafe.SingletonByLazy@5102a646
com.godtrue.singleton.thread.unsafe.SingletonByLazy@5102a646
com.godtrue.singleton.thread.unsafe.SingletonByLazy@5102a646
com.godtrue.singleton.thread.unsafe.SingletonByLazy@528ff726 —— 其他实例
com.godtrue.singleton.thread.unsafe.SingletonByLazy@5102a646
 */