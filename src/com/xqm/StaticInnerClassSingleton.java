package com.xqm;

import java.io.Serializable;

/**
 * @Author：球某
 * @Date：2021/11/17/1:44
 * 静态内部类
 * 反序列化攻击：ok
 * 反射攻击：ok
 */
public class StaticInnerClassSingleton implements Serializable {

    private StaticInnerClassSingleton(){
        if(InnerClass.singleton!=null)
            throw new RuntimeException("单例构造器 禁止反射破坏");
    }

    private static class InnerClass{
       private static StaticInnerClassSingleton singleton=new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance(){
        return InnerClass.singleton;
    }

    /**
     * 防止反序列化
     * @return
     */
    private Object readResolve(){
        return InnerClass.singleton;
    }
}
