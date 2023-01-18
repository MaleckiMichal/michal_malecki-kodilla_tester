package com.kodilla.abstracts.homework;

public class Square extends Shape {

    private int sideA;

    public int getSideA() {
        return sideA;
    }


    public Square(int sideA) {
        super();
        this.sideA = sideA;
    }

    @Override
    public int calcPerimeter() {
        return 4 * sideA;
    }

    @Override
    public int calcArea() {
        return sideA * sideA;
    }
}
