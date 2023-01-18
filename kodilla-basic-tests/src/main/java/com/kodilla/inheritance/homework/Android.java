package com.kodilla.inheritance.homework;

public class Android extends OperatingSystem {

    public Android (int releaseYear) {
        super(releaseYear);
    }

    @Override
    public void turnOn() {
        System.out.println("System Android turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("System Android turned off");
    }
}
