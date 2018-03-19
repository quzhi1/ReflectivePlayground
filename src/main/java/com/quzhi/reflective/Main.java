package com.quzhi.reflective;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Main {

    public static void main(String[] args) throws Exception {
        Class<?> clz = Class.forName("com.quzhi.reflective.DynamicClass");
        Method method = clz.getMethod("getMyField");
        Constructor constructor = clz.getConstructor(int.class);
        Object obj = constructor.newInstance(41);
        int output = (Integer) method.invoke(obj);
        System.out.println(output);
    }
}
