package com.xqm;

import java.io.Serializable;

/**
 * @Author：球某
 * @Date：2021/11/17/1:59
 * 枚举单例
 * 反序列化攻击：ok
 * 反射攻击：ok
 */
public enum EnumSingleton  {
    INSTANCE;
    private Object data;

    private EnumSingleton(){
        data=new Object();
    }

    public static EnumSingleton getInstance(){
        return INSTANCE;
    }

    public Object getData(){
        return data;
    }

}
