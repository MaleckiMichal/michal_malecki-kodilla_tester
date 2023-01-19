package com.kodilla.basic_assertion;

public class Application {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        double c = 12;

        int sumResult = calculator.sum(a, b);
        boolean correctSum = ResultChecker.assertEquals(13, sumResult);
        if (correctSum) {
            System.out.println("Metoda sum działa poprawnie dla liczb " + a + " i " + b);
        } else {
            System.out.println("Metoda sum nie działa poprawnie dla liczb " + a + " i " + b);
        }

        int subtractResult = calculator.subtract(a, b);
        boolean correctSubtract = ResultChecker.assertEquals(-3, subtractResult);
        if (correctSubtract) {
            System.out.println("Subtract method is working correct for numbers " + a + " & " + b);
        } else {
            System.out.println("Subtract method is NOT working correct for numbers " + a + " & " + b);
        }

        int squareResult = calculator.square(a);
        boolean correctSquare = ResultChecker.assertEquals(25,squareResult);
        if (correctSquare) {
            System.out.println("Square method is working correct for number " + a);
        } else {
            System.out.println("Square method is NOT working correct for number " + a);
        }

        double squareResultMath = calculator.squareMathMethod(c);
        boolean correctSquareMath = ResultChecker.assertEquals(144,squareResultMath);
        if (correctSquareMath) {
            System.out.println("Square Math method is working correct for number " + c);
        } else {
            System.out.println("Square Math method is NOT working correct for number " + c);
        }
    }
}
