package com.xqm;

import java.io.*;
import java.lang.reflect.Constructor;

/**
 * @Author：小球某
 * @Date：2021/11/25/23:31
 */
public class Main {
    public static void main(String[] args) throws Exception{
        //反射先执行
        Class<EnumSingleton> aClass = EnumSingleton.class;
        Constructor<EnumSingleton> constructor = aClass.getDeclaredConstructor();
        constructor.setAccessible(true);
        EnumSingleton newInstance = constructor.newInstance(null);

        EnumSingleton instance = EnumSingleton.getInstance();
        System.out.println(instance);
        System.out.println(newInstance);
        System.out.println(instance==newInstance);

    }
}
