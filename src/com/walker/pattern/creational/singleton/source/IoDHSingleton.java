package com.walker.pattern.creational.singleton.source;

/**
 * ${DESCRIPTION}
 *
 * @Author Walker Denial
 * @Email WalkerDenial@gmail.com
 * @Time Created at 2017/3/13 21:58.
 */
public class IoDHSingleton {

    /**
     * 构造函数私有化
     */
    private IoDHSingleton() {

    }

    /**
     * 新建静态内部类，内部生产 final 类型的静态对象，实现单例
     */
    private static class HoldClass {
        private final static IoDHSingleton instance = new IoDHSingleton();
    }

    public static IoDHSingleton getInstance() {
        return HoldClass.instance;
    }

}
