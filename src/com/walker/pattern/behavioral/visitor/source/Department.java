package com.walker.pattern.behavioral.visitor.source;

/**
 * ${DESCRIPTION}
 *
 * @Author Walker Denial
 * @Email WalkerDenial@gmail.com
 * @Time Created at 2017/3/16 14:52.
 */
public abstract class Department {

    public abstract void visit(FullTimeEmployee employee);
    public abstract void visit(PartTimeEmployee employee);
    public abstract void visit(Employee employee);

}
