package com.kodilla.collections.interfaces.homework;

public class Honda implements Car {

    private int speed;

    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public void increaseSpeed() {
        speed = speed + 50;
    }

    @Override
    public void decreaseSpeed() {
        speed = speed - 60;
    }
}
