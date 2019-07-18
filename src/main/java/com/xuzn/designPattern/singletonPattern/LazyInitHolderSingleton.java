package com.xuzn.designPattern.singletonPattern;

public class LazyInitHolderSingleton {

    private LazyInitHolderSingleton() {
    }

    private static class SingletonHolder {
        private static final LazyInitHolderSingleton instance = new LazyInitHolderSingleton();
    }


    public LazyInitHolderSingleton getInstance() {
        return SingletonHolder.instance;
    }

}
