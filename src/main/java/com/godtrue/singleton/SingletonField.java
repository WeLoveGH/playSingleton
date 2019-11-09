package com.godtrue.singleton;

/**
 * @description： 饿汉模式的另一种实现，在加载类的时候就实例化此类的对象，同样存在饿汉模式的两个问题
 * @author：qianyingjie1
 * @create：2019-11-07
 */
public class SingletonField {

    public static final SingletonField INSTANCE = new SingletonField();

    private SingletonField(){
    }

    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}
