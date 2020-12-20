package com.walker.pattern.creational.singleton.source;

/**
 * ${DESCRIPTION}
 *
 * @Author Walker Denial
 * @Email WalkerDenial@gmail.com
 * @Time Created at 2017/3/13 21:53.
 */
public class EagerSingleton {

    /**
     * 饿汉式，提前创建好，使用时直接调用就好了
     * 缺点：如果未使用这个类，但是这个对象已创建，会导致内存开销
     */
    private static final EagerSingleton instance = new EagerSingleton();

    /**
     * 构造函数私有化
     */
    private EagerSingleton() {
        
    }

    public static EagerSingleton getInstance() {
        return instance;
    }
    
}
