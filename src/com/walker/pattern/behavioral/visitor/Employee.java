package com.walker.pattern.behavioral.visitor;

/**
 * ${DESCRIPTION}
 *
 * @Author Walker Denial
 * @Email WalkerDenial@gmail.com
 * @Time Created at 2017/3/16 14:52.
 */
public interface Employee {

    void accept(Department handler);

}
