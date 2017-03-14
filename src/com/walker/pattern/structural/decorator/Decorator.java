package com.walker.pattern.structural.decorator;

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

    @Override
    public void display() {

    }

}
