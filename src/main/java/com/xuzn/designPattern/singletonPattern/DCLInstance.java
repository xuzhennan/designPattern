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

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                DCLInstance dclInstance = DCLInstance.getDclInstance();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(dclInstance.hashCode());
            }).start();
        }
    }

}
