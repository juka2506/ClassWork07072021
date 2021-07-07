package com.company;

public class Bird {

    private String color = "red";
    private int noOfWings = 2;
    private int noLegs = 2;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNoOfWings() {
        return noOfWings;
    }

    public void setNoOfWings(int noOfWings) {
        this.noOfWings = noOfWings;
    }

    public int getNoLegs() {
        return noLegs;
    }

    public void setNoLegs(int noLegs) {
        this.noLegs = noLegs;
    }

    public void fly () {
        System.out.println("Now I am flying");
    }

    public void walk () {
        System.out.println("Now I am walking");
    }

    public void sing () {
        System.out.println("Now I am singing LALALA");
    }
}
