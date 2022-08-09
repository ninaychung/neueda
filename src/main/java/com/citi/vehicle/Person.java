package com.citi.vehicle;

public class Person{
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
