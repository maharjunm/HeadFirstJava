package com.head.four;

public class DogTestDrive {
    public static void main(String[] args) {
        Dog[] dogs = new Dog[3];
        dogs[0] = new Dog();
        dogs[0].size = 61;
        dogs[1] = new Dog();
        dogs[1].size = 16;
        dogs[2] = new Dog();
        dogs[2].size = 6;

        for (int i = 0; i < dogs.length ; i++){
            dogs[i].bark();
        }
    }
}
