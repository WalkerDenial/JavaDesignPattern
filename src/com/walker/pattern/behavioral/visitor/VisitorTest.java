package com.walker.pattern.behavioral.visitor;

import com.walker.pattern.behavioral.visitor.source.*;

public class VisitorTest {

    public static void main(String[] args) {
        EmployeeList list = new EmployeeList();

        Department department = new HRDDepartment();

        Employee employee = new FullTimeEmployee("1", 1, 1);
        employee.accept(department);
        employee = new FullTimeEmployee("2", 2, 2);
        employee.accept(department);
        employee = new PartTimeEmployee("3", 3, 3);
        employee.accept(department);

        list.accept(department);
    }

}
