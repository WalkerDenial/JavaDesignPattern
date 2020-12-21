package com.walker.pattern.behavioral.strategy.source;

/**
 * 同步策略
 *
 * @Author Walker Denial
 * @Email WalkerDenial@gmail.com
 * @Time Created at 2017/3/16 14:28.
 */
public class OrderSynchronous implements  IOrderStrategy {
    @Override
    public void insert(OrderInfo order) {
        System.out.println("OrderSynchronous insert");
    }
}
