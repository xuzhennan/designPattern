package com.xuzn.designPattern.singletonPattern;

/**
 * DCL（double - check - Locking） 双重检查法
 */
public class DCLInstance {

    /**
     * 记得将变量申明为 volatile 变量
     */
    private volatile static DCLInstance dclInstance;


    private DCLInstance() {
    }


    public static DCLInstance getDclInstance() {
        if (dclInstance == null) {
            synchronized (DCLInstance.class) {
                if (dclInstance == null) {
                    dclInstance = new DCLInstance();
                }
            }
        }

        return dclInstance;
    }

}
