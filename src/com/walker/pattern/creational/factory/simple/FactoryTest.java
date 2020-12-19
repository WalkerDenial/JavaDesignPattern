package com.walker.pattern.creational.factory.simple;

import com.walker.pattern.creational.factory.simple.source.Apple;
import com.walker.pattern.creational.factory.simple.source.Fruit;

public class FactoryTest {

    /**
     * 测试场景，吃水果
     *
     * @param args
     */
    public static void main(String[] args) {
        normalEat();
        factoryEat();
    }

    /**
     * 没有使用工厂模式
     */
    private static void normalEat() {
        // Jack 吃苹果
        Apple jackApple = new Apple(); // Step.1 创建苹果
        jackApple.eatFruit(); // Step.2 吃苹果

        // Tom 吃苹果
        Apple tomApple = new Apple(); // Step.1 创建苹果
        tomApple.eatFruit(); // Step.2 吃苹果

        // Anna 吃苹果
        Apple annaApple = new Apple(); // Step.1 创建苹果
        annaApple.eatFruit(); // Step.2 吃苹果

        /**
         * 有没有发现问题？
         * 1. 要吃个水果还要自己种水果;
         * 2. 其他人不知道有没有苹果这类水果，自己也会去新建一个，那么就会出现重复；
         * 3. 如果水果获取或打开的时候过于复杂，比如椰子，那不是要疯了；
         * 4. 写成单例能解决重复的问题，但是别人由于不知情，破坏掉了对象呢？维护成本很大；
         */
    }

    /**
     * 使用工厂模式
     */
    private static void factoryEat() {
        /**
         * 1。告诉工厂我需要什么水果就行了，而不需要自己创建一个果树
         * 2. 不需要维护水果树，由工厂统一管理
         * 3. 哪怕创建对象很复杂，也不需要关系，由工厂负责处理，降低使用成本
         */
        Fruit jackApple = FruitFactory.getFruit(FruitFactory.TYPE_APPLE);
        jackApple.eatFruit();

        Fruit tomApple = FruitFactory.getFruit(FruitFactory.TYPE_APPLE);
        tomApple.eatFruit();

        Fruit annaApple = FruitFactory.getFruit(FruitFactory.TYPE_APPLE);
        annaApple.eatFruit();
    }

}
