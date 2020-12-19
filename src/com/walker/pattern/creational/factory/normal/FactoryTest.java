package com.walker.pattern.creational.factory.normal;

import com.walker.pattern.creational.factory.normal.source.AppleFactory;
import com.walker.pattern.creational.factory.normal.source.OrangeFactory;
import com.walker.pattern.creational.factory.simple.source.Fruit;

public class FactoryTest {

    /**
     * 每次获取对象时，从对应的工厂类获取即可，符合开闭原则、单一职责原则
     * 缺点：品类过多时，工厂类过多，维护麻烦
     * @param args
     */
    public static void main(String[] args) {
        AppleFactory appleFactory = new AppleFactory();
        Fruit apple = appleFactory.getFruit();
        apple.eatFruit();

        OrangeFactory orangeFactory = new OrangeFactory();
        Fruit orange = orangeFactory.getFruit();
        orange.eatFruit();
    }


}
