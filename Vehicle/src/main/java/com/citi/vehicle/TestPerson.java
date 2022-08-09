package com.citi.vehicle;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestPerson {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(PersonConfiguration.class);
        context.getBean(Person.class).getCar().drive();
    }
}