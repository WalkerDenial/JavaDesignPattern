package com.walker.pattern.creational.singleton;

/**
 * ${DESCRIPTION}
 *
 * @Author Walker Denial
 * @Email WalkerDenial@gmail.com
 * @Time Created at 2017/3/13 21:58.
 */
public class IoDHSingleton {

    private IoDHSingleton() {

    }

    private static class HoldClass {
        private final static IoDHSingleton instance = new IoDHSingleton();
    }

    public static IoDHSingleton getInstance() {
        return HoldClass.instance;
    }

}
