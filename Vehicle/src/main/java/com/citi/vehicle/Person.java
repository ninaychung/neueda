package com.citi.vehicle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class Person{
    @Autowired
    private Car car;
    public Person(Car c) {
        this.car = c;
    }
    public Person(){}
    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }




}
