package com.walker.pattern.creational.factory.abstracts.source;

import com.walker.pattern.creational.factory.simple.source.Fruit;
import com.walker.pattern.creational.factory.simple.source.Orange;

/**
 * 橘子抽象工厂类
 *
 * @Author Walker Denial
 * @Email WalkerDenial@gmail.com
 * @Time Created at 2017/3/14 14:53.
 */
public class OrangeFactory extends AbsFruit {

    @Override
    public Fruit getFruit() {
        return new Orange();
    }

}
