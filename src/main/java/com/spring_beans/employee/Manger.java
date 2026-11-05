package com.spring_beans.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component 
public class Manger {
    
    @Autowired
    // qualifier is used to specify which bean to inject when there are multiple beans of the same type.
    @Qualifier("employee")
    private Employee employee;

    public void displayEmployeeDetails() {
        System.out.println("Employee First Name: " + employee.getFirstName());
        System.out.println("Employee Last Name: " + employee.getLastName());
        System.out.println("Employee Salary: " + employee.getSalary());
    }

}
