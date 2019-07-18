package com.xuzn.designPattern.singletonPattern;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 枚举值单例模式
 */
public enum EnumInstance {
    INSTANCE;

    private String name;

    public void test() {
        System.out.println("The Test!");
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getName() {

        return name;
    }

    /*public static void main(String[] args) {

        EnumInstance one = EnumInstance.INSTANCE;
        EnumInstance two = EnumInstance.INSTANCE;


        one.test();
        one.setName("I am a SingletonClass Instance");
        System.out.println(one.getName());

        if (one == two) {

            System.out.println("There are same");
        }
    }*/

    public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
        Class<?> classType = EnumInstance.class;
        Constructor<?> c = classType.getDeclaredConstructor(null);
        c.setAccessible(true);
        EnumInstance e1 = (EnumInstance) c.newInstance();
        EnumInstance e2 = EnumInstance.INSTANCE;
        System.out.println(e1 == e2); // 枚举单例模式防止反射攻击
    }
}
