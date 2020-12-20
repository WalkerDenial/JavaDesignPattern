package com.walker.pattern.structural.bridge;

import com.walker.pattern.structural.bridge.image.Image;
import com.walker.pattern.structural.bridge.image.JPGImage;
import com.walker.pattern.structural.bridge.system.LinuxImp;

public class BridgeTest {

    public static void main(String[] args) {
        Image image = new JPGImage();
        image.setImageImp(new LinuxImp());
        image.parseFile(null);
    }

}
