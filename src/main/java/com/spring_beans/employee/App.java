package com.spring_beans.employee;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("componentScanDemo.xml");

        Employee employee = (Employee) context.getBean("employee",Employee.class);

        Manger manager = (Manger) context.getBean("manger",Manger.class);

        System.out.println("Employee First Name: " + employee.getFirstName());

        manager.displayEmployeeDetails();
    }
}
