package com.walker.pattern.structural.flyweight;

import com.sun.istack.internal.NotNull;

import java.util.ArrayList;
import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @Author Walker Denial
 * @Email WalkerDenial@gmail.com
 * @Time Created at 2017/3/14 21:54.
 */
public class CompositeConcreteFlyweight implements Flyweight {

    private List<Flyweight> flyweights = new ArrayList<>();

    @Override
    public void operation(String state) {

    }

    public void add(@NotNull Flyweight fw) {
        flyweights.add(fw);
    }

    public void remove(@NotNull Flyweight fw) {
        flyweights.remove(fw);
    }

}
