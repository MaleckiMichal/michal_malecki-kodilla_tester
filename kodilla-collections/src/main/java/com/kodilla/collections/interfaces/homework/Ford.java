package com.kodilla.collections.interfaces.homework;

public class Ford implements Car {

    private int speed;

    @Override
    public int getSpeed() {
        return speed;
    }

    public Ford(int speed) {
        this.speed = speed;
    }

    @Override
    public void increaseSpeed() {
        speed = speed + 40;
    }

    @Override
    public void decreaseSpeed() {
        speed = speed - 20;
    }
}
