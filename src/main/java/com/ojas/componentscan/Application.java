package com.ojas.componentscan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Application {
    public static void main(String[] args) {
        ApplicationContext context =
                new ClassPathXmlApplicationContext("componentScan.xml");

        Employee employee = context.getBean("employee", Employee.class);
        System.out.println(employee.toString());
    }
}
