package com.xuzn.designpattern.factorypattern.nomalfactory;

public class Test {

    //普通工厂模式
    public static void main(String[] args) {
        ConcreteFactory1 concreteFactory1 = new ConcreteFactory1();
        concreteFactory1.createProduct().sayMyName();
        ConcreteFactory2 concreteFactory2 = new ConcreteFactory2();
        concreteFactory2.createProduct().sayMyName();
    }
}
