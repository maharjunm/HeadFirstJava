package com.head.five;

public class SimpleDotCom {
    int[] locations;
    int numOfHits;
    SimpleDotCom(int[] locations) {
        this.locations = locations;
    }

    public String checkYourSelf(String value) {
        int guessValue = Integer.parseInt(value);
        String result = "miss";
        for(int location: locations) {
            if(guessValue == location) {
                result = "hit";
                numOfHits++;
            }
        }
        if(numOfHits == locations.length){
            result = "kill";
        }
        System.out.println(result);
        return result;
    }
}
