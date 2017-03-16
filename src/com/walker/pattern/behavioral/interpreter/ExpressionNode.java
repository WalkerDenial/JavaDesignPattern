package com.walker.pattern.behavioral.interpreter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @Author Walker Denial
 * @Email WalkerDenial@gmail.com
 * @Time Created at 2017/3/16 12:34.
 */
public class ExpressionNode extends Node {

    private List<Node> list = new ArrayList<>();

    @Override
    public void interpret(Context context) {
        // TODO: 2017/3/16
    }

    @Override
    public void execute() {
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            ((Node) iterator.next()).execute();
        }
    }

}
