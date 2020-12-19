package com.walker.pattern.creational.factory.abstracts.source;

/**
 * ${DESCRIPTION}
 *
 * @Author Walker Denial
 * @Email WalkerDenial@gmail.com
 * @Time Created at 2017/3/14 14:51.
 */
public abstract class AbsProduct {

    /**
     * 抽象工厂自定义基类方法，提供公共服务
     */
    protected void initConfig(){
        System.out.println("Init config");
    }

    /**
     * 差异化服务，提供接口描述，但是不提供实现
     */
    public abstract void printLog();

}
