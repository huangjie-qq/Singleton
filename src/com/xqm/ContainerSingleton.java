package com.xqm;

import java.io.Serializable;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author：小球某
 * @Date：2021/11/17/1:54
 * 容器实现法
 * 反序列化攻击：ok
 * 反射攻击：不能完全防御，反射代码如果先执行就会有问题
 */
public class ContainerSingleton  implements Serializable {
    private ContainerSingleton(){
        if(map.get(KEY)!=null)
            throw new RuntimeException("单例构造器 禁止反射破坏");
    };

    private static ConcurrentHashMap<String, ContainerSingleton> map=new ConcurrentHashMap();

    private static String KEY="singleten";

    public static ContainerSingleton getInstance(){
        ContainerSingleton singleten = map.get(KEY);
        return singleten!=null?singleten:map.computeIfAbsent(KEY,s-> new ContainerSingleton());
    }

    /**
     * 防止反序列化
     * @return
     */
    private Object readResolve(){
        return map.get(KEY);
    }
}
