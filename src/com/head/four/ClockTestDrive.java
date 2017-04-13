package com.head.four;

public class ClockTestDrive {
    public static void main(String[] args) {
        Clock clock = new Clock();

        clock.setTime("1245");
        String tod = clock.getTime();
        System.out.println("time: " + tod);
    }
}
