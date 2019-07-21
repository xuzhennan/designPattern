package com.xuzn.designpattern.singletonpattern;

/**
 * 饿汉单例模式
 */
public class HungryInstance {


    private static HungryInstance hungryInstance = new HungryInstance();

    private HungryInstance() {
    }

    public static HungryInstance getHungryInstance() {
        return hungryInstance;
    }

    public static void main(String[] args) {
        HungryInstance hungryInstance1 = HungryInstance.getHungryInstance();
        HungryInstance hungryInstance2 = HungryInstance.getHungryInstance();

        System.out.println(hungryInstance1.hashCode());
        System.out.println(hungryInstance2.hashCode());

    }


}
