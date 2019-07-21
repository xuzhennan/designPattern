package com.xuzn.designpattern.factorypattern.simplefactory;

public class Test {

    //简单静态工厂模式
    public static void main(String[] args) {
        Product product1 = SimpleFactory.createProductByType(1);
        product1.sayMyName();
        Product product2 = SimpleFactory.createProductByType(2);
        product2.sayMyName();
    }
}
