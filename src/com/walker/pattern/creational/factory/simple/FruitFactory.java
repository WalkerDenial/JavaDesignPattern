package com.walker.pattern.creational.factory.simple;

import com.walker.pattern.creational.factory.simple.source.Apple;
import com.walker.pattern.creational.factory.simple.source.Fruit;
import com.walker.pattern.creational.factory.simple.source.Orange;

/**
 * 水果工厂
 */
public class FruitFactory {

    public static final int TYPE_APPLE = 1;
    public static final int TYPE_ORANGE = 2;

    private static Apple apple;
    private static Orange orange;

    /**
     * 获取水果
     *
     * @param type
     * @return
     */
    public static Fruit getFruit(int type) {
        if (type == TYPE_APPLE) {
            if (apple == null) apple = new Apple();
            return apple;
        } else if (type == TYPE_ORANGE) {
            if (orange == null) orange = new Orange();
            return orange;
        } else return null;
    }

}
