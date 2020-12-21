package com.walker.pattern.behavioral.visitor;

import com.walker.pattern.behavioral.visitor.source.EmployeeList;
import com.walker.pattern.behavioral.visitor.source.FullTimeEmployee;
import com.walker.pattern.behavioral.visitor.source.HRDDepartment;
import com.walker.pattern.behavioral.visitor.source.PartTimeEmployee;

public class VisitorTest {

    public static void main(String[] args) {
        EmployeeList list = new EmployeeList();
        list.addEmployee(new FullTimeEmployee("1", 1,1));
        list.addEmployee(new FullTimeEmployee("2", 2,2));
        list.addEmployee(new PartTimeEmployee("3", 3,3));

        list.accept(new HRDDepartment());
    }

}
