package com.xuzn.designpattern.factorypattern.abstractfactory;

public class Test {

    //抽象工厂模式
    public static void main(String[] args) {
        ConcreteFactory1 concreteFactory1 = new ConcreteFactory1();

        concreteFactory1.createProductA().sayMyName();
        concreteFactory1.createProductB().sayMyName();

        ConcreteFactory2 concreteFactory2 = new ConcreteFactory2();

        concreteFactory2.createProductA().sayMyName();
        concreteFactory2.createProductB().sayMyName();


    }
}
