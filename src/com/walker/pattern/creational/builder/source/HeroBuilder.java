package com.walker.pattern.creational.builder.source;

/**
 * 创建英雄角色
 *
 * @Author Walker Denial
 * @Email WalkerDenial@gmail.com
 * @Time Created at 2017/3/14 19:27.
 */
public class HeroBuilder extends ActorBuilder {

    @Override
    public void buildType() {
        type = "hero";
    }

    @Override
    public void buildSex() {
        sex = "female";
    }

    @Override
    public void buildFace() {
        face = "shark";
    }

}
