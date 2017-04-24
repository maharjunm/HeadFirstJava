package com.head.nine;

import com.head.seven.Animal;
import com.head.seven.Cat;
import com.head.seven.Dog;

import java.util.ArrayList;

public class Example {
    public static void main(String[] args) {
        ArrayList<Object> arrayList = new ArrayList<>();
        Animal dog = new Dog();
        Animal cat = new Cat();

        arrayList.add(dog);
        arrayList.add(cat);

        Dog dog1 = (Dog) arrayList.get(0);
        dog1.makeNoise();

        Cat cat1 = (Cat) arrayList.get(1);
        cat1.makeNoise();

    }
}
