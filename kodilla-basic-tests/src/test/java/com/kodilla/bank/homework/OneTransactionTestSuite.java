package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class OneTransactionTestSuite {

    @Test
    public void shouldReturnTrueIfNumberIsInRange() {
        OneTransaction oneTransaction = new OneTransaction();
        int number = oneTransaction.cashTransaction();
        boolean inRange;
        if (number >= -2000 && number <= 2000) {
            inRange = true;
        } else {
            inRange = false;
        }
        assertTrue(inRange);
    }

    @Test
    public void shouldReturnTrueIfIsInPositiveRange() {
        OneTransaction oneTransaction = new OneTransaction();
        int number = oneTransaction.cashPaymentOnly();
        boolean inRange;
        if (number >= 100 && number <= 2000) {
            inRange = true;
        } else {
            inRange = false;
        }
        assertTrue(inRange);
    }

    @Test
    public void shouldReturnTrueIfIsDivisibleBy10() {
        OneTransaction oneTransaction = new OneTransaction();
        int number = oneTransaction.cashPaymentOnly();
        boolean inRange;
        if (number % 10 == 0) {
            inRange = true;
        } else {
            inRange = false;
        }
        assertTrue(inRange);
    }

    @Test
    public void shouldReturnTrueIfIsNotZero() {
        OneTransaction oneTransaction = new OneTransaction();
        int[] test = new int[1600000];
        boolean nonZero = false;
        for (int i = 0; i < test.length; i++) {
            test[i] = oneTransaction.cashTransaction();
        }
        for (int i = 0; i < test.length; i++) {
            if (test[i] == 0) {
                nonZero = false;
                break;
            } else {
                nonZero = true;
            }
        }
        assertTrue(nonZero);
    }
}
