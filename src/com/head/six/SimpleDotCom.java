package com.head.six;

import java.util.ArrayList;

public class SimpleDotCom {
    ArrayList<Integer> locations;
    int numOfHits;
    SimpleDotCom(ArrayList<Integer> locations) {
        this.locations = locations;
        numOfHits = 0;
    }

    public String checkYourSelf(String value) {
        int guessValue = Integer.parseInt(value);
        String result = "miss";
        if(locations.remove(new Integer(guessValue))){
            result = "hit";
        }
        if(locations.size() == 0){
            result = "kill";
        }
        System.out.println(result);
        return result;
    }
}
