package com.walker.pattern.behavioral.iterator;

/**
 * ${DESCRIPTION}
 *
 * @Author Walker Denial
 * @Email WalkerDenial@gmail.com
 * @Time Created at 2017/3/16 12:59.
 */
public interface AbstractIterator {

    void next();

    boolean isLast();

    void previous();

    boolean isFirst();

    Object getNextItem();

    Object getPreviousItem();

}
