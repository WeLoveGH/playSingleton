package com.godtrue.singleton;

/**
 * @description： 饿汉模式
 *                1：加载类的时候，就实例化私有的静态常量实例
 *                2：仅仅提供一个私有的无参构造函数
 *                3：提供一个公共的静态方法，用户获取对象的实例
 *
 *                注意，这种实现存在两个问题
 *                1：在类加载的时候，就实例化对象，会多占用一些堆内存空间
 *                2：不能防止通过反序列化构造多个此类的实例
 * @author：qianyingjie1
 * @create：2019-11-07
 */
public class SingletonFactory {

    private static final SingletonFactory INSTANCE = new SingletonFactory();

    private SingletonFactory(){
    }

    public static SingletonFactory getInstance(){
        return INSTANCE;
    }

    public static void main(String[] args) {

    }
}

/*

// class version 49.0 (49)
// access flags 0x21
public class com/godtrue/singleton/SingletonFactory {

  // compiled from: SingletonFactory.java

  // access flags 0x1A
  private final static Lcom/godtrue/singleton/SingletonFactory; INSTANCE

  // access flags 0x2
  private <init>()V
   L0
    LINENUMBER 19 L0
    ALOAD 0
    INVOKESPECIAL java/lang/Object.<init> ()V
   L1
    LINENUMBER 20 L1
    RETURN
   L2
    LOCALVARIABLE this Lcom/godtrue/singleton/SingletonFactory; L0 L2 0
    MAXSTACK = 1
    MAXLOCALS = 1

  // access flags 0x9
  public static getInstance()Lcom/godtrue/singleton/SingletonFactory;
   L0
    LINENUMBER 23 L0
    GETSTATIC com/godtrue/singleton/SingletonFactory.INSTANCE : Lcom/godtrue/singleton/SingletonFactory;
    ARETURN
    MAXSTACK = 1
    MAXLOCALS = 0

  // access flags 0x9
  public static main([Ljava/lang/String;)V
   L0
    LINENUMBER 28 L0
    RETURN
   L1
    LOCALVARIABLE args [Ljava/lang/String; L0 L1 0
    MAXSTACK = 0
    MAXLOCALS = 1

  // access flags 0x8
  static <clinit>()V
   L0
    LINENUMBER 17 L0
    NEW com/godtrue/singleton/SingletonFactory
    DUP
    INVOKESPECIAL com/godtrue/singleton/SingletonFactory.<init> ()V
    PUTSTATIC com/godtrue/singleton/SingletonFactory.INSTANCE : Lcom/godtrue/singleton/SingletonFactory;
    RETURN
    MAXSTACK = 2
    MAXLOCALS = 0
}


 */