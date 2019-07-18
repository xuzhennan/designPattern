package com.xuzn.designPattern.singletonPattern.attack;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectSingleton {

    private static boolean flag = false;

    private ReflectSingleton() {
    }

    private static class SingletonHolder {
        private static final ReflectSingleton REFLECT_SINGLETON = new ReflectSingleton();
    }

    public static ReflectSingleton getInstance() {
        return SingletonHolder.REFLECT_SINGLETON;
    }

    public void doSomethingElse() {
        System.out.println("something else!");
    }


    /**
     * 反射攻击单例模式，使单例模式失效
     *
     * @param args
     * @throws InstantiationException
     * @throws IllegalAccessException
     * @throws IllegalArgumentException
     * @throws InvocationTargetException
     * @throws NoSuchMethodException
     * @throws SecurityException
     */
    public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
        Class<?> classType = ReflectSingleton.class;
        Constructor<?> c = classType.getDeclaredConstructor(null);
        c.setAccessible(true);
        ReflectSingleton e1 = (ReflectSingleton) c.newInstance();
        ReflectSingleton e2 = ReflectSingleton.getInstance();
        System.out.println(e1 == e2); //false  单例模式不起作用
    }

}
