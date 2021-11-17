package com.xqm;

/**
 * @Author：小球某
 * @Date：2021/11/16/23:56
 * 懒汉式
 */
public class LazySingleton {
    private LazySingleton(){};

    private static volatile LazySingleton SINGLETEN;

    public static LazySingleton getInstance(){
        if(SINGLETEN==null){//语句1
            synchronized (LazySingleton.class){//语句2
                if(SINGLETEN==null){
                    SINGLETEN=new LazySingleton();
                }
            }
        }
        return SINGLETEN;
    }

}
