package org.example;

public class Van extends Vehicle implements Drivable{
    @Override
    public void drive() {
        Drivable.super.drive();
    }

    @Override
    void move() {

    }
}
