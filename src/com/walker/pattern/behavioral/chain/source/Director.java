package com.walker.pattern.behavioral.chain.source;

/**
 * 主管
 *
 * @Author Walker Denial
 * @Email WalkerDenial@gmail.com
 * @Time Created at 2017/3/15 18:54.
 */
public class Director extends Approver {

    public Director(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() <= 1) {
            System.out.println("Director agree");
        } else super.processRequest(request);
    }

}
