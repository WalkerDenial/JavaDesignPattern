package com.walker.pattern.structural.adapter.source.target;

/**
 * Window 目标类
 */
public class WindowTarget implements Target {

    @Override
    public void request() {
        System.out.println("window target");
    }

}
