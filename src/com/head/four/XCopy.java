package com.head.four;

public class XCopy {
    public static void main(String[] args) {
        int orig = 42;
        XCopy xCopy = new XCopy();
        int y = xCopy.go(orig);
        System.out.println(orig + " " + y);
    }
    public int go(int orig) {
        orig = orig * 2;
        return orig;
    }
}
