package com.walker.pattern.creational.builder.source;

/**
 * 创建恶魔角色
 *
 * @Author Walker Denial
 * @Email WalkerDenial@gmail.com
 * @Time Created at 2017/3/14 19:27.
 */
public class DevilBuilder extends ActorBuilder {

    @Override
    public void buildType() {
        type = "devil";
    }

    @Override
    public void buildSex() {
        sex = "male";
    }

    @Override
    public void buildFace() {
        face = "round";
    }

}
