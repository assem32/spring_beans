package com.spring_beans.employee;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component 
public class Employee {
    private int id;
    @Value("Assem")
    private String firstName;
    private String lastName;
    private double salary;

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

}
