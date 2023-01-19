package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {

    int a = 5;
    int b = 8;

    Calculator calculator = new Calculator();

    @Test
    public void testSum() {
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult);
    }

    @Test
    public void testSubtract() {
        int subtractResult = calculator.subtract(a, b);
        assertEquals(-3, subtractResult);
    }

    @Test
    public void testSquareMathMethodPositive() {
        double c = 0.7;
        double squareResultMath = calculator.squareMathMethod(c);
        assertEquals(0.49, squareResultMath, 0.0001);
    }

    @Test
    public void testSquareMathMethodNegative() {
        double c = -1.1;
        double squareResultMath = calculator.squareMathMethod(c);
        assertEquals(1.21, squareResultMath, 0.0001);
    }

    @Test
    public void testSquarePositive() {
        int squareResult = calculator.square(a);
        assertEquals(25, squareResult);
    }

    @Test
    public void testSquareNegative() {
        int c = -6;
        int squareResult = calculator.square(c);
        assertEquals(36, squareResult);
    }

}
