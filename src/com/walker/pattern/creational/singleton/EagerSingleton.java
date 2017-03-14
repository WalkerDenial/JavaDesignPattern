package com.walker.pattern.creational.singleton;

/**
 * ${DESCRIPTION}
 *
 * @Author Walker Denial
 * @Email WalkerDenial@gmail.com
 * @Time Created at 2017/3/13 21:53.
 */
public class EagerSingleton {
    
    private static final EagerSingleton instance = new EagerSingleton();
    
    private EagerSingleton() {
        
    }

    public static EagerSingleton getInstance() {
        return instance;
    }
    
}
