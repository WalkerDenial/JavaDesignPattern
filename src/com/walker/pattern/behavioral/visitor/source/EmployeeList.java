package com.walker.pattern.behavioral.visitor.source;

import java.util.ArrayList;
import java.util.List;

/**
 * ${DESCRIPTION}
 *
 * @Author Walker Denial
 * @Email WalkerDenial@gmail.com
 * @Time Created at 2017/3/16 14:58.
 */
public class EmployeeList {

    private List<Employee> list = new ArrayList<>();

    public void addEmployee(Employee employee) {
        list.add(employee);
    }

    public void accept(Department department) {
        for (Employee item : list) department.visit(item);
    }

}
