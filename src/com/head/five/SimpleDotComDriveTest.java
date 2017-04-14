package com.head.five;

import java.util.Scanner;

public class SimpleDotComDriveTest {
    public static void main(String[] args) {
        GameHelper gameHelper = new GameHelper();
        int randomValue = (int)(Math.random()*5);
        int[] locations = new int[]{ randomValue, randomValue + 1, randomValue + 2 };
        SimpleDotCom simpleDotCom = new SimpleDotCom(locations);
        while(true) {
            String input = gameHelper.getInput();
            String output = simpleDotCom.checkYourSelf(input);
            if(output.equals("kill")){
                break;
            }
        }
        System.out.println("Game Completed");
    }
}
