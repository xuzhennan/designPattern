package com.xuzn.designPattern.singletonPattern;

/**
 * 懒汉单例线程安全实现
 */
public class LazyInstance {


    private static LazyInstance lazyInstance;

    private LazyInstance(){}

    public static synchronized LazyInstance getLazyInstance(){
            if(lazyInstance == null){
                lazyInstance = new LazyInstance();
            }
            return lazyInstance;
    }

}
