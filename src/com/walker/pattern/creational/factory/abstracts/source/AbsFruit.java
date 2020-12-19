package com.walker.pattern.creational.factory.abstracts.source;

import com.walker.pattern.creational.factory.simple.source.Fruit;

/**
 * ${DESCRIPTION}
 *
 * @Author Walker Denial
 * @Email WalkerDenial@gmail.com
 * @Time Created at 2017/3/14 14:51.
 */
public abstract class AbsFruit {

    public AbsFruit() {
        initConfig();
    }

    /**
     * 抽象工厂自定义基类方法，提供公共服务
     */
    protected void initConfig() {
        System.out.println("园丁浇水");
        System.out.println("园丁修剪枝叶");
        System.out.println("工人打包水果");
    }

    /**
     * 差异化服务，提供接口描述，但是不提供实现
     */
    public abstract Fruit getFruit();

}
