package com.walker.pattern.structural.decorator.source.document;

/**
 * ${DESCRIPTION}
 *
 * @Author Walker Denial
 * @Email WalkerDenial@gmail.com
 * @Time Created at 2017/3/14 21:29.
 */
public class PurchaseRequest implements Document {
    @Override
    public void display() {
        System.out.println("purchase request");
    }
}
