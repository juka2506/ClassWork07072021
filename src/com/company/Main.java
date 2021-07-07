package com.company;

public class Main {

    public static void main(String[] args) {
        /*Car car = new Car();
        System.out.println(car.getColor());
        car.setColor("Blue");
        System.out.println(car.getColor());

        car.setNoOfTires(8);
        car.setBrand("BMW limousine");

        System.out.println(car.getNoOfTires());
        System.out.println(car.getBrand());

        car.startEngine(true); */

        Bird bird = new Bird();
        System.out.println(bird.getColor());
        bird.setColor("yellow");
        System.out.println(bird.getColor());
        bird.walk();
        bird.fly();
        bird.sing();
    }
}
