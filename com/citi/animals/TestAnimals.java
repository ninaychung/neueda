package com.citi.animals;

import java.util.ArrayList;
import java.util.List;

public class TestAnimals {
    public static void main(String[] args) {
        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat());
        cats.add(new Cat());
        for (Cat c : cats) {
            c.purr();
        }

        Animal a = new Koala();
        Animal a1 = new Alligator();
        Animal aa = new Animal() {
            // you can create anonymous inner class
            // this is how lambda work under the hood
        };
        Animal a2 = new Cat();
        Tamigotchi t1 = new Tamigotchi();
        Pet p1 = new Tamigotchi();
        Pet p2 = new Cat();

        // create an array
        Pet[] pets = new Pet[3];
        pets[0] = new Cat();
        pets[1] = new Tamigotchi();
        pets[2] = new Cat();

        for (Pet p : pets) {
            p.feed();
        }

        p2.feed();
        // p2.excrete(); pet doesn't have excrete
        Cat c2 = new Cat();
        c2.excrete(); // good

        // a2.feed(); animal doesn't have feed
        // p2.purr(); purr only found in cat
        c2.purr(); // all good

        // back to pet
        Cat cat = (Cat) p2; // casting
        // pointing to object created earlier, creating multiple references
        cat.purr();

        // this creates runtime error
        // java.lang.ClassCastException, Tamigotchi cannot be cast to Cat
        // because Tamigotchi is not a cat
        Pet pt = new Tamigotchi();

        // Cat cat2 = (Cat) pt;
        // cat2.purr();

        // instead do
        if (pt instanceof Cat) {
            Cat cat3 = (Cat) pt;
            cat3.purr();
        }
    }

}
