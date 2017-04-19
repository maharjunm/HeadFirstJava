package com.head.six;

import com.head.five.*;

import java.util.ArrayList;
import java.util.Scanner;

public class DotComBust {
    private ArrayList<DotCom> dotComList = new ArrayList<>();
    private GameHelper gameHelper;
    private int numOfGusses;

    private void setUpGame() {
        DotCom first = new DotCom();
        first.setName("some.com");
        DotCom second = new DotCom();
        first.setName("some.com");
        DotCom third = new DotCom();
        first.setName("some.com");
        dotComList.add(first);
        dotComList.add(second);
        dotComList.add(third);
        ArrayList<String> location1 = new ArrayList<>();
        location1.add("A1");
        location1.add("A2");
        location1.add("A3");
        ArrayList<String> location2 = new ArrayList<>();
        location1.add("G3");
        location1.add("G4");
        location1.add("G5");
        ArrayList<String> location3 = new ArrayList<>();
        location1.add("C4");
        location1.add("C5");
        location1.add("C6");

        dotComList.get(0).setLocationCells(location1);
        dotComList.get(1).setLocationCells(location2);
        dotComList.get(2).setLocationCells(location3);
    }

    public static void main(String[] args) {
        DotComBust dotComBust = new DotComBust();
        dotComBust.setUpGame();
        dotComBust.startGame();
    }

    public void startGame() {
        while(!dotComList.isEmpty()) {
            String userInput = new Scanner(System.in).next();
            checkYourGuess(userInput);
        }
    }
    public void checkYourGuess(String userInput) {
        String result;
        for(DotCom dotCom: dotComList) {
            result = dotCom.checkYouself(userInput);
            if(result.equals("hit")) {
                System.out.println("You hit the " + dotCom.getName());
                break;
            } else if(result.equals("kill")) {
                System.out.println("You sunk the " + dotCom.getName());
                dotComList.remove(dotCom);
                break;
            }
            System.out.println(result);
        }
    }
}
