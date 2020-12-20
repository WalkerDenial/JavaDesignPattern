package com.walker.pattern.structural.adapter.source.target;

/**
 * Linux 目标类
 */
public class LinuxTarget implements Target {

    @Override
    public void request() {
        System.out.println("linux target");
    }

}
