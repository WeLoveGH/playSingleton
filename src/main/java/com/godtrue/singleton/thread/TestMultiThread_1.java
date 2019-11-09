package com.godtrue.singleton.thread;

import com.godtrue.singleton.thread.unsafe.SingletonByLazy;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @description： 多线程环境下的测试，这种测试方式可以比较灵活的控制跑多少次
 * @author：qianyingjie1
 * @create：2019-11-08
 */
public class TestMultiThread_1 {

    private static final int MAX_THREAD = 10;

    private static final int ONE = 1;

    private static final int MAX_LOOP = 1;

    private static final Map<Object,Object> map = new ConcurrentHashMap<Object,Object>();

    public static void main(String[] args) throws Exception{
        for (int i = 0; i < MAX_LOOP; i++) {
            TestRunnable testRunnable = new TestRunnable(map);
            test(testRunnable);
        }
    }

    public static void test(Runnable runnable) throws InterruptedException{

        Thread[] testThreads = new Thread[MAX_THREAD];

        for (int i = 0; i < testThreads.length; i++) {
            testThreads[i] = new Thread(runnable);
        }

        for (int i = 0; i < testThreads.length; i++) {
            testThreads[i].start();
        }

        for (int i = 0; i < testThreads.length; i++) {
            testThreads[i].join();
        }

        if(ONE < map.size()){
            System.out.println("the singleton is unsafe , the size should be : " + ONE + " , the real size is : " +map.size());
        }
    }
}

class TestRunnable implements Runnable{
    private Map map;

    public TestRunnable(Map map){
        this.map = map;
    }
    public void run (){
        SingletonByLazy singleton = SingletonByLazy.getInstance();
        map.put(singleton,singleton);
        //System.out.println(singleton);
    }
}

/*

the singleton is unsafe , the size should be : 10 , the real size is : 2

Process finished with exit code 0

 */