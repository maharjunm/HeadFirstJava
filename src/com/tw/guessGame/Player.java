package com.tw.guessGame;

public class Player {
    private int number;

    public void guess() {
        number = (int) (Math.random() * 10);
        System.out.println("I'm guessing " + number);
    }

    public int getNumber() {
        return number;
    }
}
