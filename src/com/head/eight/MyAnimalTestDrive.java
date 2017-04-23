package com.head.eight;

import com.head.seven.Animal;
import com.head.seven.Cat;
import com.head.seven.Dog;

public class MyAnimalTestDrive {
    public static void main(String[] args) {
        MyAnimalList myAnimalList = new MyAnimalList();
        Animal cat = new Cat();
        Animal dog = new Dog();

        myAnimalList.add(cat);
        myAnimalList.add(dog);
    }
}
