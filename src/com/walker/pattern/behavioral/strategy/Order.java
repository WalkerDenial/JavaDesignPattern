package com.walker.pattern.behavioral.strategy;

/**
 * ${DESCRIPTION}
 *
 * @Author Walker Denial
 * @Email WalkerDenial@gmail.com
 * @Time Created at 2017/3/16 14:29.
 */
public class Order {

    private IOrderStrategy orderStrategy;

    public IOrderStrategy loadStrategy(){
        return orderStrategy;
    }

}
