package com.citi.animals;

public class Alligator extends Animal {
    @Override
    public void eat() {
        System.out.println("Alligator eat");
    }

    @Override
    public void excrete() {

    }
}

// you can have multiple classes, but only
// the first will the public, rest will be private
class Crocodile {

}
