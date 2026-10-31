package com.spring_beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring_beans.car.MyBean;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationBeanContext.xml");

        MyBean myBean = (MyBean) context.getBean("myBean");

        System.out.println("MyBean name: " + myBean.getMessage());
    }
}