package org.example;

public class Lorry extends Vehicle implements Drivable{
    @Override
    public void drive() {
        Drivable.super.drive();
    }

    @Override
    void move() {

    }
}
