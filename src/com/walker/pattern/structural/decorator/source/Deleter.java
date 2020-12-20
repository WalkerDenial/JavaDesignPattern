package com.walker.pattern.structural.decorator.source;

import com.walker.pattern.structural.decorator.source.document.Document;

/**
 * ${DESCRIPTION}
 *
 * @Author Walker Denial
 * @Email WalkerDenial@gmail.com
 * @Time Created at 2017/3/14 21:30.
 */
public class Deleter extends Decorator {

    public Deleter(Document document) {
        super(document);
    }

    public void delete() {
        System.out.println("delete Decorator");
        display();
    }

}
