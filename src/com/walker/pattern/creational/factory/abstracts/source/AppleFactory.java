package com.walker.pattern.creational.factory.abstracts.source;

import com.walker.pattern.creational.factory.simple.source.Apple;
import com.walker.pattern.creational.factory.simple.source.Fruit;

/**
 * 苹果抽象工厂类
 *
 * @Author Walker Denial
 * @Email WalkerDenial@gmail.com
 * @Time Created at 2017/3/14 14:53.
 */
public class AppleFactory extends AbsFruit {

    @Override
    public Fruit getFruit() {
        return new Apple();
    }

}
