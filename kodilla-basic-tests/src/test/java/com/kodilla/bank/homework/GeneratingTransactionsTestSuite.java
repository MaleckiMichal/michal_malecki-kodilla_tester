package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class GeneratingTransactionsTestSuite {

    @Test
    public void shouldReturnArrayFrom5To10Elements() {
        GeneratingTransactions generatingTransactions = new GeneratingTransactions(5000);
        int[] testArray = generatingTransactions.generating();
        boolean arrayLength;
        if (testArray.length >= 5 && testArray.length <= 10) {
            arrayLength = true;
        } else {
            arrayLength = false;
        }
        assertTrue(arrayLength);
    }

    @Test
    public void shouldAddPaymentIfSumBelow3000() {
        GeneratingTransactions generatingTransactions = new GeneratingTransactions(2000);
        int [] testArray = generatingTransactions.generating();
        boolean isPayment = false;
        int sum = generatingTransactions.getInitialBalance();
        for (int i = 0; i < testArray.length; i++) {
            if (sum < 3000 && testArray[i] >= 100) {
                isPayment = true;
            } else if (sum < 3000 && testArray[i] < 0) {
                isPayment = false;
            }
            sum += testArray[i];
        }
        assertTrue(isPayment);
    }
}
