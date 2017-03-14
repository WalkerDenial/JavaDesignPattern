package com.walker.pattern.creational.factory.abstracts;

/**
 * ${DESCRIPTION}
 *
 * @Author Walker Denial
 * @Email WalkerDenial@gmail.com
 * @Time Created at 2017/3/14 14:51.
 */
public abstract class AbsProduct {

    protected void initConfig(){
        System.out.println("Init config");
    }

    abstract void printLog();

}
