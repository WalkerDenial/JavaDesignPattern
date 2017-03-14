package com.walker.pattern.structural.bridge;

/**
 * ${DESCRIPTION}
 *
 * @Author Walker Denial
 * @Email WalkerDenial@gmail.com
 * @Time Created at 2017/3/14 20:50.
 */
public abstract class Image {

    protected ImageImp imp;

    public void setImageImp(ImageImp imp) {
        this.imp = imp;
    }

    abstract void parseFile(String fileName);

}
