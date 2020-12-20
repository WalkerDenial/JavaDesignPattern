package com.walker.pattern.structural.proxy.source;

/**
 * ${DESCRIPTION}
 *
 * @Author Walker Denial
 * @Email WalkerDenial@gmail.com
 * @Time Created at 2017/3/14 22:09.
 */
public class AccessValidator {
    
    public boolean validate(String id){
        System.out.println("AccessValidator validate " + id);
        return true;
    }
    
}
