package com.godtrue.singleton;

/**
 * @description： 通过使用枚举的方式来构建单例对象，这是最好的一种方式，因为代码简洁安全可靠
 * @author：qianyingjie1
 * @create：2019-11-07
 */
public enum SingletonEnum {
    INSTANCE;

    int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public static void main(String[] args) {

    }
}

/*

// class version 49.0 (49)
// access flags 0x4031
// signature Ljava/lang/Enum<Lcom/godtrue/singleton/SingletonEnum;>;
// declaration: com/godtrue/singleton/SingletonEnum extends java.lang.Enum<com.godtrue.singleton.SingletonEnum>
public final enum com/godtrue/singleton/SingletonEnum extends java/lang/Enum  {

  // compiled from: SingletonEnum.java

  // access flags 0x4019
  public final static enum Lcom/godtrue/singleton/SingletonEnum; INSTANCE

  // access flags 0x0
  I value

  // access flags 0x101A
  private final static synthetic [Lcom/godtrue/singleton/SingletonEnum; $VALUES

  // access flags 0x9
  public static values()[Lcom/godtrue/singleton/SingletonEnum;
   L0
    LINENUMBER 8 L0
    GETSTATIC com/godtrue/singleton/SingletonEnum.$VALUES : [Lcom/godtrue/singleton/SingletonEnum;
    INVOKEVIRTUAL [Lcom/godtrue/singleton/SingletonEnum;.clone ()Ljava/lang/Object;
    CHECKCAST [Lcom/godtrue/singleton/SingletonEnum;
    ARETURN
    MAXSTACK = 1
    MAXLOCALS = 0

  // access flags 0x9
  public static valueOf(Ljava/lang/String;)Lcom/godtrue/singleton/SingletonEnum;
   L0
    LINENUMBER 8 L0
    LDC Lcom/godtrue/singleton/SingletonEnum;.class
    ALOAD 0
    INVOKESTATIC java/lang/Enum.valueOf (Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;
    CHECKCAST com/godtrue/singleton/SingletonEnum
    ARETURN
   L1
    LOCALVARIABLE name Ljava/lang/String; L0 L1 0
    MAXSTACK = 2
    MAXLOCALS = 1

  // access flags 0x2
  // signature ()V
  // declaration: void <init>()
  private <init>(Ljava/lang/String;I)V
   L0
    LINENUMBER 8 L0
    ALOAD 0
    ALOAD 1
    ILOAD 2
    INVOKESPECIAL java/lang/Enum.<init> (Ljava/lang/String;I)V
    RETURN
   L1
    LOCALVARIABLE this Lcom/godtrue/singleton/SingletonEnum; L0 L1 0
    MAXSTACK = 3
    MAXLOCALS = 3

  // access flags 0x1
  public getValue()I
   L0
    LINENUMBER 14 L0
    ALOAD 0
    GETFIELD com/godtrue/singleton/SingletonEnum.value : I
    IRETURN
   L1
    LOCALVARIABLE this Lcom/godtrue/singleton/SingletonEnum; L0 L1 0
    MAXSTACK = 1
    MAXLOCALS = 1

  // access flags 0x1
  public setValue(I)V
   L0
    LINENUMBER 18 L0
    ALOAD 0
    ILOAD 1
    PUTFIELD com/godtrue/singleton/SingletonEnum.value : I
   L1
    LINENUMBER 19 L1
    RETURN
   L2
    LOCALVARIABLE this Lcom/godtrue/singleton/SingletonEnum; L0 L2 0
    LOCALVARIABLE value I L0 L2 1
    MAXSTACK = 2
    MAXLOCALS = 2

  // access flags 0x9
  public static main([Ljava/lang/String;)V
   L0
    LINENUMBER 23 L0
    RETURN
   L1
    LOCALVARIABLE args [Ljava/lang/String; L0 L1 0
    MAXSTACK = 0
    MAXLOCALS = 1

  // access flags 0x8
  static <clinit>()V
   L0
    LINENUMBER 9 L0
    NEW com/godtrue/singleton/SingletonEnum
    DUP
    LDC "INSTANCE"
    ICONST_0
    INVOKESPECIAL com/godtrue/singleton/SingletonEnum.<init> (Ljava/lang/String;I)V
    PUTSTATIC com/godtrue/singleton/SingletonEnum.INSTANCE : Lcom/godtrue/singleton/SingletonEnum;
   L1
    LINENUMBER 8 L1
    ICONST_1
    ANEWARRAY com/godtrue/singleton/SingletonEnum
    DUP
    ICONST_0
    GETSTATIC com/godtrue/singleton/SingletonEnum.INSTANCE : Lcom/godtrue/singleton/SingletonEnum;
    AASTORE
    PUTSTATIC com/godtrue/singleton/SingletonEnum.$VALUES : [Lcom/godtrue/singleton/SingletonEnum;
    RETURN
    MAXSTACK = 4
    MAXLOCALS = 0
}


 */