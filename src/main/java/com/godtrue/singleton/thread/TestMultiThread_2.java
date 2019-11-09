package com.godtrue.singleton.thread;

import com.godtrue.singleton.thread.safe.*;
import com.godtrue.singleton.thread.unsafe.SingletonByLazy;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @description： 多线程环境下的测试，这种测试方式可以比较灵活的控制跑多少次
 * @author：qianyingjie1
 * @create：2019-11-08
 */
public class TestMultiThread_2 {

    private static final int MAX_THREAD = 10;

    private static final int ONE = 1;

    private static final int MAX_LOOP = 1;

    public static void main(String[] args) throws Exception{
        for (int i = 0; i < MAX_LOOP; i++) {

            List<Runnable> runnableList = new ArrayList<Runnable>();

            runnableList.add(new TestRunnable_2_0(new ConcurrentHashMap<Object,Object>()));
            runnableList.add(new TestRunnable_2_1(new ConcurrentHashMap<Object,Object>()));
            runnableList.add(new TestRunnable_2_2(new ConcurrentHashMap<Object,Object>()));
            runnableList.add(new TestRunnable_2_3(new ConcurrentHashMap<Object,Object>()));
            runnableList.add(new TestRunnable_2_4(new ConcurrentHashMap<Object,Object>()));
            runnableList.add(new TestRunnable_2_5(new ConcurrentHashMap<Object,Object>()));
            runnableList.add(new TestRunnable_2_6(new ConcurrentHashMap<Object,Object>()));
            runnableList.add(new TestRunnable_2_7(new ConcurrentHashMap<Object,Object>()));
            runnableList.add(new TestRunnable_2_8(new ConcurrentHashMap<Object,Object>()));
            runnableList.add(new TestRunnable_2_9(new ConcurrentHashMap<Object,Object>()));
            runnableList.add(new TestRunnable_2_10(new ConcurrentHashMap<Object,Object>()));

            test(runnableList);
        }
    }

    public static void test(List<Runnable> runnableList) throws InterruptedException{

        for (Runnable runnable : runnableList){

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

            if(runnable instanceof RunnableParent){
                RunnableParent runnableParent = (RunnableParent)runnable;
                int mapSize = runnableParent.getMap().size();

                System.out.println("the runnable is : " + runnable +" , the mapSize is : " + mapSize);

                if(ONE < mapSize){
                    System.out.println("the singleton is unsafe , the size should be : " + ONE + " , the real size is : " + mapSize);
                }
            }
        }
    }
}

class TestRunnable_2_0 extends RunnableParent implements Runnable{

    public TestRunnable_2_0(Map map){
        this.map = map;
    }

    public void run (){
        SingletonByLazy singleton = SingletonByLazy.getInstance();
        map.put(singleton,singleton);
        //System.out.println(singleton);
    }
}

class TestRunnable_2_1 extends RunnableParent implements Runnable{

    public TestRunnable_2_1(Map map){
        this.map = map;
    }

    public void run (){
        SingletonByDoubleCheckLock singleton = SingletonByDoubleCheckLock.getInstance();
        map.put(singleton,singleton);
        //System.out.println(singleton);
    }
}

class TestRunnable_2_2 extends RunnableParent implements Runnable{

    public TestRunnable_2_2(Map map){
        this.map = map;
    }

    public void run (){
        SingletonByDoubleCheckLock_1 singleton = SingletonByDoubleCheckLock_1.getInstance();
        map.put(singleton,singleton);
        //System.out.println(singleton);
    }
}

class TestRunnable_2_3 extends RunnableParent implements Runnable{

    public TestRunnable_2_3(Map map){
        this.map = map;
    }

    public void run (){
        SingletonByEnum singleton = SingletonByEnum.INSTANCE;
        map.put(singleton,singleton);
        //System.out.println(singleton);
    }
}

class TestRunnable_2_4 extends RunnableParent implements Runnable{

    public TestRunnable_2_4(Map map){
        this.map = map;
    }

    public void run (){
        SingletonByHungry singleton = SingletonByHungry.getInstance();
        map.put(singleton,singleton);
        //System.out.println(singleton);
    }
}

class TestRunnable_2_5 extends RunnableParent implements Runnable{

    public TestRunnable_2_5(Map map){
        this.map = map;
    }

    public void run (){
        SingletonByInnerClass singleton = SingletonByInnerClass.getInstance();
        map.put(singleton,singleton);
        //System.out.println(singleton);
    }
}

class TestRunnable_2_6 extends RunnableParent implements Runnable{

    public TestRunnable_2_6(Map map){
        this.map = map;
    }

    public void run (){
        SingletonByLock singleton = SingletonByLock.getInstance();
        map.put(singleton,singleton);
        //System.out.println(singleton);
    }
}

class TestRunnable_2_7 extends RunnableParent implements Runnable{

    public TestRunnable_2_7(Map map){
        this.map = map;
    }

    public void run (){
        SingletonByReentrantLock singleton = SingletonByReentrantLock.getInstance();
        map.put(singleton,singleton);
        //System.out.println(singleton);
    }
}

class TestRunnable_2_8 extends RunnableParent implements Runnable{

    public TestRunnable_2_8(Map map){
        this.map = map;
    }

    public void run (){
        SingletonBySynchronized singleton = SingletonBySynchronized.getInstance();
        map.put(singleton,singleton);
        //System.out.println(singleton);
    }
}

class TestRunnable_2_9 extends RunnableParent implements Runnable{

    public TestRunnable_2_9(Map map){
        this.map = map;
    }

    public void run (){
        SingletonBySynchronizedBlock singleton = SingletonBySynchronizedBlock.getInstance();
        map.put(singleton,singleton);
        //System.out.println(singleton);
    }
}

class TestRunnable_2_10 extends RunnableParent implements Runnable{

    public TestRunnable_2_10(Map map){
        this.map = map;
    }

    public void run (){
        SingletonByThreadLocal singleton = SingletonByThreadLocal.getInstance();
        map.put(singleton,singleton);
        //System.out.println(singleton);
    }
}

class RunnableParent{
    Map map;

    public Map getMap() {
        return map;
    }

    public void setMap(Map map) {
        this.map = map;
    }
}


/*

the runnable is : com.godtrue.singleton.thread.TestRunnable_2_0@1540e19d , the mapSize is : 2
the singleton is unsafe , the size should be : 1 , the real size is : 2
the runnable is : com.godtrue.singleton.thread.TestRunnable_2_1@677327b6 , the mapSize is : 1
the runnable is : com.godtrue.singleton.thread.TestRunnable_2_2@14ae5a5 , the mapSize is : 1
the runnable is : com.godtrue.singleton.thread.TestRunnable_2_3@7f31245a , the mapSize is : 1
the runnable is : com.godtrue.singleton.thread.TestRunnable_2_4@6d6f6e28 , the mapSize is : 1
the runnable is : com.godtrue.singleton.thread.TestRunnable_2_5@135fbaa4 , the mapSize is : 1
the runnable is : com.godtrue.singleton.thread.TestRunnable_2_6@45ee12a7 , the mapSize is : 1
the runnable is : com.godtrue.singleton.thread.TestRunnable_2_7@330bedb4 , the mapSize is : 1
the runnable is : com.godtrue.singleton.thread.TestRunnable_2_8@2503dbd3 , the mapSize is : 1
the runnable is : com.godtrue.singleton.thread.TestRunnable_2_9@4b67cf4d , the mapSize is : 1
the runnable is : com.godtrue.singleton.thread.TestRunnable_2_10@7ea987ac , the mapSize is : 1

Process finished with exit code 0

 */