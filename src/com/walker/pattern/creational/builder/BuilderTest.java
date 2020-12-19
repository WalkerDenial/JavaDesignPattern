package com.walker.pattern.creational.builder;

import com.walker.pattern.creational.builder.source.Actor;
import com.walker.pattern.creational.builder.source.ActorBuilder;
import com.walker.pattern.creational.builder.source.DevilBuilder;
import com.walker.pattern.creational.builder.source.HeroBuilder;

public class BuilderTest {

    /**
     * 根据角色不同，构建的内容也不同，如果需要构建的细腻度越高，则构建内容越多，采用建造者模式进行差异化配置更好
     *
     * @param args
     */
    public static void main(String[] args) {
        Actor actor;
        ActorBuilder builder;

        // build devil
        builder = new DevilBuilder();
        builder.buildType();
        builder.buildSex();
        builder.buildFace();
        actor = builder.createActor();
        System.out.println(actor.toString());

        // build heroR
        builder = new HeroBuilder();
        builder.buildType();
        builder.buildSex();
        builder.buildFace();
        actor = builder.createActor();
        System.out.println(actor.toString());
    }

}
