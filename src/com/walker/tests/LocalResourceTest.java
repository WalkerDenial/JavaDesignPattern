package com.walker.tests;

import com.walker.utils.resource.LocalResourceManager;

/**
 * ${DESCRIPTION}
 *
 * @Author Walker Denial
 * @Email WalkerDenial@gmail.com
 * @Time Created at 2017/3/8 15:16.
 */
public class LocalResourceTest {

    public static void main(String[] args) {
        System.out.println(LocalResourceManager.getInstance().getValue().toString());
    }

}