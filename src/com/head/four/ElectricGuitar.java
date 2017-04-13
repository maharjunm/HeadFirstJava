package com.head.four;

public class ElectricGuitar {
    private String brand;
    private int numOfPickups;
    private boolean rockStarUsesIt;

    public void setBrand(String brand){
        this.brand = brand;
    }

    public String getBrand(){
        return brand;
    }

    public void setNumOfPickups(int numOfPickups){
        this.numOfPickups = numOfPickups;
    }

    public int getNumOfPickups(){
        return numOfPickups;
    }

    public void setRockStarUsesIt(boolean rockStarUsesIt){
        this.rockStarUsesIt = rockStarUsesIt;
    }

    public boolean getRockStarUsesIt(){
        return rockStarUsesIt;
    }
}
