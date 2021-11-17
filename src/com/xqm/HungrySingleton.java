package com.xqm;

/**
 * @Author：小球某
 * @Date：2021/11/16/23:47
 * 饿汉式
 */
public class HungrySingleton {
    private HungrySingleton(){};

    private static final HungrySingleton SINGLETON=new HungrySingleton();

    public static HungrySingleton getInstance(){
       return SINGLETON;
    }
}
