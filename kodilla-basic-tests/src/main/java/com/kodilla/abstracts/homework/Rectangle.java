package com.kodilla.abstracts.homework;

public class Rectangle extends Shape {

    private int sideA;
    private int sideB;

    public Rectangle(int sideA, int sideB) {
        super();
        this.sideA = sideA;
        this.sideB = sideB;
    }

    public int getSideA() {
        return sideA;
    }

    public int getSideB() {
        return sideB;
    }

    @Override
    public int calcPerimeter() {
        return 2 * sideA + 2 * sideB;
    }

    @Override
    public int calcArea() {
        return sideA * sideB;
    }
}
