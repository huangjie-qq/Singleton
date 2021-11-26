package com.xqm;

import java.io.Serializable;

/**
 * @Author：小球某
 * @Date：2021/11/16/23:47
 * 饿汉式
 * 反序列化攻击：ok
 * 反射攻击：ok
 */
public class HungrySingleton implements Serializable {

    private HungrySingleton(){
        if(SINGLETON!=null)
            throw new RuntimeException("单例构造器 禁止反射破坏");
    };

    private static final HungrySingleton SINGLETON=new HungrySingleton();

    public static HungrySingleton getInstance(){
       return SINGLETON;
    }

    /**
     * 防止反序列化
     * @return
     */
    private Object readResolve(){
        return SINGLETON;
    }
}
