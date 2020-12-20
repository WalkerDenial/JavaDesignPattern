package com.walker.pattern.creational.builder.source;

/**
 * ${DESCRIPTION}
 *
 * @Author Walker Denial
 * @Email WalkerDenial@gmail.com
 * @Time Created at 2017/3/14 19:23.
 */
public abstract class ActorBuilder {

    protected Actor actor = new Actor();

    protected String type;

    protected String sex;

    protected String face;

    /**
     * 构建演员类别
     */
    public abstract void buildType();

    /**
     * 构建性别
     */
    public abstract void buildSex();

    /**
     * 构建脸型
     */
    public abstract void buildFace();

    /**
     * 创建演员，根据不同的 type、sex、face，可以细化出不同的演员
     * @return
     */
    public Actor createActor() {
        actor.setType(type);
        actor.setSex(sex);
        actor.setFace(face);
        return actor;
    }

}
