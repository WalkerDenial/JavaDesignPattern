package com.walker.pattern.structural.decorator.source;

import com.walker.pattern.structural.decorator.source.document.Document;

/**
 * ${DESCRIPTION}
 *
 * @Author Walker Denial
 * @Email WalkerDenial@gmail.com
 * @Time Created at 2017/3/14 21:30.
 */
public class Approver extends Decorator {

    public Approver(Document document) {
        super(document);
    }

    @Override
    public void display() {
        System.out.println("approve Decorator");
        display();
    }
}
