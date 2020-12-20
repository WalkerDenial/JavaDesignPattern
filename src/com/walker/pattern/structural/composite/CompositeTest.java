package com.walker.pattern.structural.composite;

import com.walker.pattern.structural.composite.source.Component;
import com.walker.pattern.structural.composite.source.Composite;
import com.walker.pattern.structural.composite.source.Leaf;

public class CompositeTest {

    public static void main(String[] args) {
        Component component = new Composite();
        component.operation();

        component = new Leaf();
        component.operation();
    }

}
