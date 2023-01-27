package com.kodilla.collections.interfaces.homework;

import com.kodilla.collections.arrays.homework.CarApplication;

public class CarRace {

    public static void main(String[] args) {
        Ford ford = new Ford(0);
        doRace(ford);

        Opel opel = new Opel(0);
        doRace(opel);

        Honda honda = new Honda(0);
        doRace(honda);
    }

    public static void doRace(Car car) {
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();
        System.out.println("speed: " + car.getSpeed());
    }
}
