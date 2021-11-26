package com.xqm;

import java.io.Serializable;

/**
 * @Author：小球某
 * @Date：2021/11/16/23:56
 * 懒汉式
 * 反序列化攻击：ok
 * 反射攻击：不能完全防御，反射代码如果先执行就会有问题
 */
public class LazySingleton implements Serializable {

    private LazySingleton(){
        if(SINGLETEN!=null)
            throw new RuntimeException("单例构造器 禁止反射破坏");
    };

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

    /**
     * 防止反序列化
     * @return
     */
    private Object readResolve(){
        return SINGLETEN;
    }
}
