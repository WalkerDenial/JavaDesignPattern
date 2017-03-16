package com.walker.pattern.behavioral.iterator;

import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @Author Walker Denial
 * @Email WalkerDenial@gmail.com
 * @Time Created at 2017/3/16 13:05.
 */
public class ProductIterator implements AbstractIterator {

    private ProductList productList;

    private List<Object> products;

    private int cursor1;

    private int cursor2;

    @Override
    public void next() {

    }

    @Override
    public boolean isLast() {
        return false;
    }

    @Override
    public void previous() {

    }

    @Override
    public boolean isFirst() {
        return false;
    }

    @Override
    public Object getNextItem() {
        return null;
    }

    @Override
    public Object getPreviousItem() {
        return null;
    }

}
