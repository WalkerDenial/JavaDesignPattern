package com.walker.pattern.behavioral.chainOfResponsibility;

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
    void processRequest(PurchaseRequest request) {
        if(request.getAmount() < 2){
            // TODO: 2017/3/15
        } else {
            if (successor != null) {
                successor.processRequest(request);
            }
        }
    }

}
