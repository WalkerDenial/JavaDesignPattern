package com.walker.pattern.behavioral.chainOfResponsibility;

/**
 * ${DESCRIPTION}
 *
 * @Author Walker Denial
 * @Email WalkerDenial@gmail.com
 * @Time Created at 2017/3/15 18:52.
 */
public abstract class Approver {

    protected Approver successor;

    protected String name;

    public Approver(String name) {
        this.name = name;
    }

    public void setSuccessor(Approver successor) {
        this.successor = successor;
    }

    abstract void processRequest(PurchaseRequest request);

}
