package com.xuzn.designPattern.singletonPattern;

/**
 * 饿汉单例模式
 */
public class HungryInstance {


    private static HungryInstance hungryInstance = new HungryInstance();

    private HungryInstance(){}

    public static HungryInstance getHungryInstance(){
        return hungryInstance;
    }



}
