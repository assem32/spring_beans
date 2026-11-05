package com.spring_beans.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component 
public class Manger {
    
    @Autowired 
    private Employee employee;

    public void displayEmployeeDetails() {
        System.out.println("Employee First Name: " + employee.getFirstName());
        System.out.println("Employee Last Name: " + employee.getLastName());
        System.out.println("Employee Salary: " + employee.getSalary());
    }

}
