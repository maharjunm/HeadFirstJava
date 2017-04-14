package com.head.five;

import java.util.Scanner;

public class SimpleDotComDriveTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = "2";
        int value = Integer.parseInt(input);
        int[] locations = {1,2,3};
        for(int location: locations){
            if(value == location){
                System.out.println("Hit");
                break;
            }
        }
        System.out.println("You loss the Game");
    }
}
