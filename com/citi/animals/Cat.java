package com.citi.animals;

public class Cat extends Animal implements Pet {
    @Override
    public void eat() {
        System.out.println("cat eats");
    }

    @Override
    public void feed() {
        // TODO Auto-generated method stub
        System.out.println("feed cat");
    }

    public void purr() {

    }
}
