package com.xqm;

/**
 * @Author：球某
 * @Date：2021/11/17/1:59
 * 枚举法
 */
public enum EnumSingleton {
    INSTANCE;
    private DbConnect dbConnect;

    private EnumSingleton(){
        dbConnect=new DbConnect();
    }

    public static DbConnect getInstance(){
        return INSTANCE.dbConnect;
    }

    private class DbConnect{}
}
