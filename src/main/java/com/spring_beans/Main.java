package com.spring_beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.spring_beans.car.Car;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("constructorBeanContext.xml");
        Car myCar = (Car) context.getBean("myCar");

        myCar.displayCarDetails();
    }
}