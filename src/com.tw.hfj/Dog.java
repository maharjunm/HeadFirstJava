package com.tw.hfj;

public class Dog {
    String name;

    public static void main(String[] args) {
        Dog[] dogs = new Dog[3];
        dogs[0] = new Dog();
        dogs[1] = new Dog();
        dogs[2] = new Dog();    

        dogs[0].name = "Fido";
        dogs[1].name = "Merge";
        dogs[2].name = "baby";

        for(int i = 0; i < dogs.length; i++){
            dogs[i].bark();
            dogs[i].eat();
            dogs[i].chaseCat();
        }
    }

    public void bark() {
        System.out.println(name + " is barking..");
    }

    public void eat() {
        System.out.println(name + " is eating..");
    }

    public void chaseCat() {
        System.out.println(name + " is chasing dog..");
    }

}
