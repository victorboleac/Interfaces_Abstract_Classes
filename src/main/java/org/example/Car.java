package org.example;

public class Car extends Vehicle implements Drivable{
    @Override
    void move() {
        System.out.println("Car is being driven!");

    }
}
