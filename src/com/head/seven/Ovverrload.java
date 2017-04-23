package com.head.seven;

public class Ovverrload {
    public int addNumber(int number1, int number2) {
        return number1 + number2;
    }

    public double addNumber(Double number1, Double number2) {
        return number1 + number2;
    }

    public void setUniqueId(String id) {
        setUniqueId(id);
    }

    public void setUniqueId(int id) {
        setUniqueId(id);
    }
}
