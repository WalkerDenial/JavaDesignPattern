package com.walker.pattern.structural.bridge.image;

import com.walker.pattern.structural.bridge.system.Matrix;

/**
 * ${DESCRIPTION}
 *
 * @Author Walker Denial
 * @Email WalkerDenial@gmail.com
 * @Time Created at 2017/3/14 21:03.
 */
public class PNGImage extends Image {
    @Override
    public void parseFile(String fileName) {
        imp.doPaint(new Matrix());
        System.out.println("parse png file");
    }
}
