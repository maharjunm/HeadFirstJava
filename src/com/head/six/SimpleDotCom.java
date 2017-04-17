package com.head.six;

public class SimpleDotCom {
    int[] locations;
    int numOfHits;
    SimpleDotCom(int[] locations) {
        this.locations = locations;
        numOfHits = 0;
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
