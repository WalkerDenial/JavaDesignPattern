package com.walker.pattern.creational.singleton;

import com.walker.pattern.creational.singleton.source.EagerSingleton;
import com.walker.pattern.creational.singleton.source.IoDHSingleton;
import com.walker.pattern.creational.singleton.source.LazySingleton;

public class SingletonTest {

    /**
     * 判断内存指向是否相同
     * @param args
     */
    public static void main(String[] args) {
        EagerSingleton eagerSingleton1 = EagerSingleton.getInstance();
        EagerSingleton eagerSingleton2 = EagerSingleton.getInstance();
        System.out.println(eagerSingleton1.hashCode() == eagerSingleton2.hashCode());

        IoDHSingleton ioDHSingleton1 = IoDHSingleton.getInstance();
        IoDHSingleton ioDHSingleton2 = IoDHSingleton.getInstance();
        System.out.println(ioDHSingleton1.hashCode() == ioDHSingleton2.hashCode());

        LazySingleton lazySingleton0 = LazySingleton.getInstance0();
        LazySingleton lazySingleton1 = LazySingleton.getInstance1();
        LazySingleton lazySingleton2 = LazySingleton.getInstance2();
        LazySingleton lazySingleton3 = LazySingleton.getInstance3();
        System.out.println(lazySingleton0.hashCode() == lazySingleton1.hashCode());
        System.out.println(lazySingleton0.hashCode() == lazySingleton2.hashCode());
        System.out.println(lazySingleton0.hashCode() == lazySingleton3.hashCode());
    }

}
