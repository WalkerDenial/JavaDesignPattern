package com.walker.pattern.behavioral.chain.source;

/**
 * ${DESCRIPTION}
 *
 * @Author Walker Denial
 * @Email WalkerDenial@gmail.com
 * @Time Created at 2017/3/15 18:54.
 */
public class Congress extends Approver {

    public Congress(String name) {
        super(name);
    }

    @Override
    public void processRequest(PurchaseRequest request) {
        if(request.getAmount() <= 2){
            System.out.println("Congress agree");
        } else super.processRequest(request);
    }

}
