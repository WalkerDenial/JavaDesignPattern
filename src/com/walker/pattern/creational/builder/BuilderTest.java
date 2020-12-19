package com.walker.pattern.creational.builder;

import com.walker.pattern.creational.builder.source.Actor;
import com.walker.pattern.creational.builder.source.ActorBuilder;
import com.walker.pattern.creational.builder.source.DevilBuilder;
import com.walker.pattern.creational.builder.source.HeroBuilder;

public class BuilderTest {

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
