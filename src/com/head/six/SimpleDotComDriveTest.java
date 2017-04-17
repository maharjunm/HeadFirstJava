package com.head.six;

import java.util.ArrayList;

public class SimpleDotComDriveTest {
    public static void main(String[] args) {
        GameHelper gameHelper = new GameHelper();
        int randomValue = (int)(Math.random()*5);
        ArrayList<Integer> list = new ArrayList<>();
        int[] locations = new int[]{ 4,5,6};
        for (int location: locations) {
            list.add(location);
        }
        SimpleDotCom simpleDotCom = new SimpleDotCom(list);
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
