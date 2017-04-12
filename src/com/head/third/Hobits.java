package com.head.third;

public class Hobits {
    String name;

    public static void main(String[] args) {
        Hobits[] hobits = new Hobits[3];
        int x = 0;
        while(x < 3) {
            hobits[x] = new Hobits();
            hobits[x].name = "reading books";
            if (x == 1){
                hobits[x].name = "Playing games";
            }
            if(x == 2) {
                hobits[x].name = "Listening to music";
            }
            System.out.println(hobits[x].name + " is good hobit.");
            x++;
        }
    }
}
