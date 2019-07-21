package com.xuzn.designpattern.factorypattern.nomalfactory;

public class ConcreteFactory1 implements AbstractFactory{

    @Override
    public Product createProduct() {
        return new ConcreteProduct1();
    }
}
