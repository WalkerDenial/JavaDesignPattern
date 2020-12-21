package com.walker.pattern.behavioral.chain;

import com.walker.pattern.behavioral.chain.source.*;

public class ChainTest {

    public static void main(String[] args) {
        Approver director = new Director("");
        Approver congress = new Congress("");
        director.setSuccessor(congress);
        Approver vicePresident = new VicePresident("");
        congress.setSuccessor(vicePresident);
        Approver president = new President("");
        vicePresident.setSuccessor(president);

        PurchaseRequest request = new PurchaseRequest(1,2,"");
        director.processRequest(request);

        request.setAmount(2);
        director.processRequest(request);

        request.setAmount(3);
        director.processRequest(request);

        request.setAmount(4);
        director.processRequest(request);

        request.setAmount(5);
        director.processRequest(request);
    }

}
