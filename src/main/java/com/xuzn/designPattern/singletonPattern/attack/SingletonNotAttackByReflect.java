package com.xuzn.designPattern.singletonPattern.attack;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class SingletonNotAttackByReflect {
    private static boolean flag = false;
    private static final SingletonNotAttackByReflect INSTANCE = new SingletonNotAttackByReflect();

    //保证其不被java反射攻击
    private SingletonNotAttackByReflect() {
        synchronized (SingletonNotAttackByReflect.class) {
            if (false == flag) {
                flag = !flag;
            } else {
                throw new RuntimeException("单例模式正在被攻击");
            }

        }
    }

    public static SingletonNotAttackByReflect getInstance() {
        return INSTANCE;
    }

    public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchMethodException, SecurityException {
        try {
            Class<SingletonNotAttackByReflect> classType = SingletonNotAttackByReflect.class;
            Constructor<SingletonNotAttackByReflect> constructor = classType.getDeclaredConstructor(null);
            constructor.setAccessible(true);
            SingletonNotAttackByReflect singleton = (SingletonNotAttackByReflect) constructor.newInstance();
            SingletonNotAttackByReflect singleton2 = SingletonNotAttackByReflect.getInstance();

            System.out.println(singleton == singleton2);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
