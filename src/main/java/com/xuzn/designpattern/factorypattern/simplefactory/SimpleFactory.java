package com.xuzn.designpattern.factorypattern.simplefactory;

public class SimpleFactory {


    public static Product createProductByType(int type) {

        Product product = null;

        if (type == 1) {
            product = new ConcreteProduct1();
        } else if (type == 2) {
            product = new ConcreteProduct2();
        }

        return product;
    }


}
