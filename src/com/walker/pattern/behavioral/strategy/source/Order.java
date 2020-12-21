package com.walker.pattern.behavioral.strategy.source;

/**
 * ${DESCRIPTION}
 *
 * @Author Walker Denial
 * @Email WalkerDenial@gmail.com
 * @Time Created at 2017/3/16 14:29.
 */
public class Order {

    private IOrderStrategy orderStrategy;

    /**
     * 加载策略
     * @return
     */
    public IOrderStrategy loadStrategy() {
        return orderStrategy;
    }

    /**
     * 设置策略
     * @param orderStrategy
     */
    public void setOrderStrategy(IOrderStrategy orderStrategy) {
        this.orderStrategy = orderStrategy;
    }

}
