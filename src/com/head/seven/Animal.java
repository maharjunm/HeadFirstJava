package com.head.seven;

public interface Animal {
    String picture = null;
    String food = null;
    String hunger = null;
    float boundaries = 0;
    String location = null;

    public void makeNoise();
    public void eat();
    public void sleep();
    public void roam();
}
