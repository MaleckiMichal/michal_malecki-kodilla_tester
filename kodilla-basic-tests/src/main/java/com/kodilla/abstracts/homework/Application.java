package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {
        Square square = new Square(2);
        System.out.println("Square side: " + square.getSideA());
        System.out.println("Perimeter: " + square.calcPerimeter() + "  Area: " + square.calcArea());

        Rectangle rectangle = new Rectangle(3, 5);
        System.out.println("\n" + "Rectangle sides: " + rectangle.getSideA() + " & " + rectangle.getSideB());
        System.out.println("Perimeter: " + rectangle.calcPerimeter() + "  Area: " + rectangle.calcArea());

        Triangle triangle = new Triangle(4, 5, 6, 7);
        System.out.println("\n" + "Triangle height: " + triangle.getHeight() + "   Side with height: " + triangle.getSideHeight() + "   Rest sides: " + triangle.getSideB() + " & " + triangle.getSideC());
        System.out.println("Perimeter: " + triangle.calcPerimeter() + "  Area: " + triangle.calcArea());
    }
}
