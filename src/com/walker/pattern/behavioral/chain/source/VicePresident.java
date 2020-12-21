package com.walker.pattern.behavioral.chain.source;

/**
 * ${DESCRIPTION}
 *
 * @Author Walker Denial
 * @Email WalkerDenial@gmail.com
 * @Time Created at 2017/3/15 18:54.
 */
public class VicePresident extends Approver {

    public VicePresident(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if (request.getAmount() <= 3) {
            System.out.println("VicePresident agree");
        } else super.processRequest(request);
    }

}
