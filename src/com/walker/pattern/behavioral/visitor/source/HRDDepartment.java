package com.walker.pattern.behavioral.visitor.source;

/**
 * ${DESCRIPTION}
 *
 * @Author Walker Denial
 * @Email WalkerDenial@gmail.com
 * @Time Created at 2017/3/16 14:57.
 */
public class HRDDepartment extends Department {

    @Override
    public void visit(FullTimeEmployee employee) {
        System.out.println("HRDDepartment visit FullTimeEmployee");
    }

    @Override
    public void visit(PartTimeEmployee employee) {
        System.out.println("HRDDepartment visit PartTimeEmployee");
    }

    @Override
    public void visit(Employee employee) {
        System.out.println("HRDDepartment visit Employee");
    }

}
