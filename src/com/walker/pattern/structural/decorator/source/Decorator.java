package com.walker.pattern.structural.decorator.source;

import com.walker.pattern.structural.decorator.source.document.Document;

/**
 * ${DESCRIPTION}
 *
 * @Author Walker Denial
 * @Email WalkerDenial@gmail.com
 * @Time Created at 2017/3/14 21:29.
 */
public class Decorator implements Document {

    private Document document;

    public Decorator(Document document) {
        this.document = document;
    }

    public void approve() {
        System.out.println("Decorator");
    }

    @Override
    public void display() {
        System.out.println("Decorator display");
        approve();
    }

}
