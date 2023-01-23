package com.kodilla.bank.homework;

import java.util.Random;

public class GeneratingTransactions {

    private int initialBalance;
    public GeneratingTransactions(int initialBalance) {
        this.initialBalance = initialBalance;
    }

    public int[] generating() {
        Random random = new Random();
        OneTransaction oneTransaction = new OneTransaction();
        int size = random.nextInt(5, 10);
        int[] transactions = new int[size];
        int sum = this.initialBalance;

        for (int i = 0; i < size; i++) {
            int temp;
            if (sum < 3000) {
                temp = oneTransaction.cashPaymentOnly();
            } else {
                temp = oneTransaction.cashTransaction();
            }
            sum += temp;
            transactions[i] = temp;
        }
        return transactions;
    }

    public int getInitialBalance() {
        return initialBalance;
    }
}
