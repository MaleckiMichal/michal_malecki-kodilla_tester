package com.kodilla.bank.homework;

import java.util.Arrays;

public class CashMachine {

    private int[] transactions;

    GeneratingTransactions generatingTransactions;

    public CashMachine(int initialBalance) {
        generatingTransactions = new GeneratingTransactions(initialBalance);
        this.transactions = generatingTransactions.generating();
    }

    public int getBalance() {
        int balance = generatingTransactions.getInitialBalance();
        for (int i = 0; i < this.transactions.length; i++) {
            balance += this.transactions[i];
        }
        return balance;
    }

    public int getTransactionsQuantity() {
        return this.transactions.length;
    }

    public int[] getTransactions() {
        return transactions;
    }
}
