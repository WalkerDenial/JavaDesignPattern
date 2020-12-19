package com.walker.pattern.creational.prototype;

/**
 * ${DESCRIPTION}
 *
 * @Author Walker Denial
 * @Email WalkerDenial@gmail.com
 * @Time Created at 2017/3/14 17:05.
 */
public class FAR implements OfficialDocument {

    @Override
    public OfficialDocument clone() {
        return this;
    }

    @Override
    public void display() {
        System.out.println("FAR display");
    }

}
