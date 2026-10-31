package com.spring_beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.spring_beans.car.Car;
import com.spring_beans.car.Car2;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("constructorBeanContext.xml");
        Car myCar = (Car) context.getBean("myCar");
        Car2 myCar2 = (Car2) context.getBean("myCar2");

        myCar.displayCarDetails();

        myCar2.displayCarDetails();
    }
}