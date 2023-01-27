package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.*;

import java.util.Random;

public class CarApplication {

    private static final Random random = new Random();

    public static Car drawCar() {
        int randomCar = random.nextInt(3);
        int randomSpeed = drawCarSpeed();
        if (randomCar == 0)
            return new Ford(randomSpeed);
        else if (randomCar == 1)
            return new Honda(randomSpeed);
        else
            return new Opel(randomSpeed);
    }

    public static int drawCarSpeed() {
        return random.nextInt(30, 60);
    }

    public static void main(String[] args) {
        int size = random.nextInt(1, 16);
        Car[] cars = new Car[size];
        for (int i = 0; i < cars.length; i++)
            cars[i] = drawCar();
        for (Car car : cars) {
            CarUtils.describeCar(car);
        }
    }
}
