package com.walker.pattern.creational.builder;

/**
 * ${DESCRIPTION}
 *
 * @Author Walker Denial
 * @Email WalkerDenial@gmail.com
 * @Time Created at 2017/3/14 19:23.
 */
public abstract class ActorBuilder {

    protected Actor actor = new Actor();

    private String type;

    private String sex;

    private String face;

    abstract void buildType();

    abstract void buildSex();

    abstract void buildFace();

    public Actor createActor() {
        actor.setType(type);
        actor.setSex(sex);
        actor.setFace(face);
        return actor;
    }

}
