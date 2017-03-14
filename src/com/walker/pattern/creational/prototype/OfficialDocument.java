package com.walker.pattern.creational.prototype;

/**
 * ${DESCRIPTION}
 *
 * @Author Walker Denial
 * @Email WalkerDenial@gmail.com
 * @Time Created at 2017/3/14 17:04.
 */
public interface OfficialDocument extends Cloneable {

    OfficialDocument clone();

    void display();

}
