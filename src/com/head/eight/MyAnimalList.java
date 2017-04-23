package com.head.eight;

import com.head.seven.Animal;

public class MyAnimalList {

    Animal[] animals = new Animal[5];
    int nextIndex = 0;

    public void add(Animal animal) {
        if(animals.length < nextIndex) {
            animals[nextIndex++] = animal;
            System.out.println("Object added at " + (nextIndex - 1));
        }
    }
}
