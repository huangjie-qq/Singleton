package com.xqm;

import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author：小球某
 * @Date：2021/11/17/1:54
 * 容器实现法
 */
public class ContainerSingleton {
    private ContainerSingleton(){};

    private static ConcurrentHashMap<String, ContainerSingleton> map=new ConcurrentHashMap();

    private static String KEY="singleten";

    public static ContainerSingleton getInstance(){
        ContainerSingleton singleten = map.get(KEY);
        return singleten!=null?singleten:map.computeIfAbsent(KEY,s-> new ContainerSingleton());
    }

}
