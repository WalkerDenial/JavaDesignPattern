package com.walker.utils.resource.exception;

/**
 * ${DESCRIPTION}
 *
 * @Author Walker Denial
 * @Email WalkerDenial@gmail.com
 * @Time Created at 2017/3/3 16:50.
 */
public class NullKeyException extends Exception {

    @Override
    public void printStackTrace() {
        System.err.println("Key can't be null");
    }

}
