package com.walker.pattern.creational.factory.normal.source;

import com.walker.pattern.creational.factory.simple.source.Apple;
import com.walker.pattern.creational.factory.simple.source.Fruit;

/**
 * 苹果工厂类
 *
 * @Author Walker Denial
 * @Email WalkerDenial@gmail.com
 * @Time Created at 2017/3/14 14:46.
 */
public class AppleFactory implements BaseFruitFactory {

    @Override
    public Fruit getFruit() {
        return new Apple();
    }

}
