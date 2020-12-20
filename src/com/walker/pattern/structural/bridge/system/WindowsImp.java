package com.walker.pattern.structural.bridge.system;

import com.walker.pattern.structural.bridge.image.ImageImp;

/**
 * ${DESCRIPTION}
 *
 * @Author Walker Denial
 * @Email WalkerDenial@gmail.com
 * @Time Created at 2017/3/14 21:00.
 */
public class WindowsImp implements ImageImp {
    @Override
    public void doPaint(Matrix m) {
        System.out.println("paint windows impl");
    }
}
