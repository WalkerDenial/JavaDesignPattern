package com.walker.pattern.creational.singleton.source;

/**
 * 懒汉式单例
 *
 * @Author Walker Denial
 * @Email WalkerDenial@gmail.com
 * @Time Created at 2017/3/13 21:53.
 */
public class LazySingleton {

    private volatile static LazySingleton instance = null;

    /**
     * 构造函数私有化
     */
    private LazySingleton() {

    }

    /**
     * Type 0
     * 不加锁，判断为空就创建
     * 缺点：如果创建较耗时，会存在多次创建的问题
     *
     * @return
     */
    public static LazySingleton getInstance0() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

    /**
     * Type 1
     * 方法加锁，判断为空就创建
     * 缺点：对象只需要创建一次，但是每次获取对象都要同步，性能有些降低
     *
     * @return
     */
    synchronized public static LazySingleton getInstance1() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }

    /**
     * Type 2
     * 创建对象时加锁
     * 缺点：当一瞬间多个请求获取时会处于队列中，当对象创建完后，队列中执行继续创建，会导致多次创建及信息丢失
     * @return
     */
    public static LazySingleton getInstance2() {
        if (instance == null) {
            synchronized (LazySingleton.class) {
                instance = new LazySingleton();
            }
        }
        return instance;
    }

    /**
     * Type 3
     * 双重同步锁方式
     * step 1. 判断为空时，加锁执行创建
     * step 2. 进入锁体后，再次判断是否为空，如果为空才创建，哪怕队列有很多请求，也不会多次创建对象
     * @return
     */
    public static LazySingleton getInstance3() {
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
