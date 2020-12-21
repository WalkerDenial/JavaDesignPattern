package com.walker.pattern.behavioral.strategy.source;

/**
 * ${DESCRIPTION}
 *
 * @Author Walker Denial
 * @Email WalkerDenial@gmail.com
 * @Time Created at 2017/3/16 14:27.
 */
public interface IOrderStrategy {

    /**
     * 订单入库
     *
     * @param order
     */
    void insert(OrderInfo order);

}
