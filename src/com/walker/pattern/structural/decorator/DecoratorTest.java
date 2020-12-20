package com.walker.pattern.structural.decorator;

import com.walker.pattern.structural.decorator.source.Decorator;
import com.walker.pattern.structural.decorator.source.Deleter;
import com.walker.pattern.structural.decorator.source.document.Document;
import com.walker.pattern.structural.decorator.source.document.LeaveRequest;

public class DecoratorTest {

    public static void main(String[] args) {
        Document document = new LeaveRequest();
        Decorator decorator = new Deleter(document);
        decorator.display();
    }

}
