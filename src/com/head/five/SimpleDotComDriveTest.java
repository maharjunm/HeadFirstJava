package com.head.five;

import java.util.Scanner;

public class SimpleDotComDriveTest {
    public static void main(String[] args) {
        GameHelper gameHelper = new GameHelper();
        SimpleDotCom simpleDotCom = new SimpleDotCom(new int[]{1, 2, 3});
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
