package com.walker.pattern.creational.factory.abstracts;

import com.walker.pattern.creational.factory.abstracts.source.AbsFruit;
import com.walker.pattern.creational.factory.abstracts.source.AppleFactory;
import com.walker.pattern.creational.factory.abstracts.source.OrangeFactory;
import com.walker.pattern.creational.factory.simple.source.Fruit;

public class FactoryTest {

    /**
     * 通过抽象约束的工厂主要特征及行为，又因为是抽象，提供了无限的可扩展性，既符合单一职责原则，又符合开闭原则
     *
     * @param args
     */
    public static void main(String[] args) {
        AbsFruit factory;
        Fruit fruit;

        // 商品 A 信息
        factory = new AppleFactory();
        fruit = factory.getFruit();
        fruit.eatFruit();


        // 商品 B 信息
        factory = new OrangeFactory();
        fruit = factory.getFruit();
        fruit.eatFruit();
    }

}
