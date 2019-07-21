package com.xuzn.designpattern.singletonpattern;

/**
 * 懒汉单例线程安全实现
 */
public class LazyInstance {


    private static LazyInstance lazyInstance;

    private LazyInstance() {
    }

    public static synchronized LazyInstance getLazyInstance() {
        if (lazyInstance == null) {
            lazyInstance = new LazyInstance();
        }
        return lazyInstance;
    }

    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            new Thread(() -> {
                LazyInstance lazyInstance = LazyInstance.getLazyInstance();
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(lazyInstance.hashCode());
            }).start();
        }


    }

}
