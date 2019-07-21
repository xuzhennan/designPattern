package com.xuzn.designpattern.factorypattern.nomalfactory;

public class ConcreteFactory2 implements AbstractFactory{

    @Override
    public Product createProduct() {
        return new ConcreteProduct2();
    }
}
