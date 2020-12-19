package com.walker.pattern.creational.factory.abstracts;

import com.walker.pattern.creational.factory.abstracts.source.AbsProduct;
import com.walker.pattern.creational.factory.abstracts.source.AbsProductA;
import com.walker.pattern.creational.factory.abstracts.source.AbsProductB;

public class FactoryTest {

    /**
     * 通过抽象约束的工厂主要特征及行为，又因为是抽象，提供了无限的可扩展性，既符合单一职责原则，又符合开闭原则
     * @param args
     */
    public static void main(String[] args) {
        AbsProduct product;

        // 商品 A 信息
        product = new AbsProductA();
        product.printLog();

        // 商品 B 信息
        product = new AbsProductB();
        product.printLog();
    }

}
