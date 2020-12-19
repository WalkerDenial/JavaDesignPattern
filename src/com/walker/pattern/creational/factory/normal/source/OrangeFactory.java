package com.walker.pattern.creational.factory.normal.source;

import com.walker.pattern.creational.factory.simple.source.Fruit;
import com.walker.pattern.creational.factory.simple.source.Orange;

/**
 * 橘子工厂类
 *
 * @Author Walker Denial
 * @Email WalkerDenial@gmail.com
 * @Time Created at 2017/3/14 14:46.
 */
public class OrangeFactory implements BaseFruitFactory {

    @Override
    public Fruit getFruit() {
        return new Orange();
    }

}
