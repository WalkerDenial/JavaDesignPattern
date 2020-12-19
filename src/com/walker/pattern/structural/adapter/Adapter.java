package com.walker.pattern.structural.adapter;

/**
 * ${DESCRIPTION}
 *
 * @Author Walker Denial
 * @Email WalkerDenial@gmail.com
 * @Time Created at 2017/3/14 20:23.
 */
public class Adapter implements Target {

    private Adapted adapted = new Adapted();

    @Override
    public void request() {
        adapted.specificRequest();
    }

}
