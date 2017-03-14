package com.walker.pattern.creational.singleton;

/**
 * ${DESCRIPTION}
 *
 * @Author Walker Denial
 * @Email WalkerDenial@gmail.com
 * @Time Created at 2017/3/13 21:53.
 */
public class LazySingleton {

    private volatile static LazySingleton instance = null;

    private LazySingleton() {

    }

    /**
     * Type 1
     *
     * @return
     */
    //    synchronized public static LazySingleton getInstance() {
    //        if (instance == null) {
    //            instance = new LazySingleton();
    //        }
    //        return instance;
    //    }

    /**
     * Type 2
     *
     * @return
     */
    //    public static LazySingleton getInstance() {
    //        if (instance == null) {
    //            synchronized (LazySingleton.class) {
    //                instance = new LazySingleton();
    //            }
    //        }
    //        return instance;
    //    }

    /**
     * Type 3
     *
     * @return
     */
    public static LazySingleton getInstance() {
        if (instance == null) {
            synchronized (LazySingleton.class) {
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }

}
