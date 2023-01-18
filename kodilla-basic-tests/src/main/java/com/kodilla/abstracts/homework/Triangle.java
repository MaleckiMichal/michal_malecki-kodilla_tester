package com.kodilla.abstracts.homework;

public class Triangle extends Shape {

    private int height;
    private int sideHeight;
    private int sideB;
    private int sideC;

    public Triangle(int height, int sideHeight, int sideB, int sideC) {
        super();
        this.height = height;
        this.sideHeight = sideHeight;
        this.sideB = sideB;
        this.sideC = sideC;
    }

    @Override
    public int calcPerimeter() {
        return sideHeight + sideB + sideC;
    }

    @Override
    public int calcArea() {
        return sideHeight * height / 2;
    }

    public int getHeight() {
        return height;
    }

    public int getSideHeight() {
        return sideHeight;
    }

    public int getSideB() {
        return sideB;
    }

    public int getSideC() {
        return sideC;
    }
}