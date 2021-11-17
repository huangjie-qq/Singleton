package com.xqm;

/**
 * @Author：球某
 * @Date：2021/11/17/1:44
 * 静态内部类
 */
public class StaticInnerClassSingleton {

    private StaticInnerClassSingleton(){}

    private static class InnerClass{
       private static StaticInnerClassSingleton singleton=new StaticInnerClassSingleton();
    }

    public static StaticInnerClassSingleton getInstance(){
        return InnerClass.singleton;
    }

}
