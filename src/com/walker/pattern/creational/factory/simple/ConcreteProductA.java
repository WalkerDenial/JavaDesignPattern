package com.walker.pattern.creational.factory.simple;

/**
 * ${DESCRIPTION}
 *
 * @Author Walker Denial
 * @Email WalkerDenial@gmail.com
 * @Time Created at 2017/3/14 14:26.
 */
public class ConcreteProductA extends Product {

    @Override
    public Product factoryMethod(String arg) {
        return this;
    }
}
