package com.kodilla.bank.homework;

import java.util.Arrays;

public class Bank {

    CashMachine[] banks;

    public Bank(int initialBalance0, int initialBalance1, int initialBalance2, int initialBalance3, int initialBalance4) {
        this.banks = new CashMachine[5];
        this.banks[0] = new CashMachine(initialBalance0);
        this.banks[1] = new CashMachine(initialBalance1);
        this.banks[2] = new CashMachine(initialBalance2);
        this.banks[3] = new CashMachine(initialBalance3);
        this.banks[4] = new CashMachine(initialBalance4);
    }

    public int totalBalance() {
        int total = 0;
        for (int i = 0; i < this.banks.length; i++) {
            total += this.banks[i].getBalance();
        }
        return total;
    }

    public int withdrawalsQuantity() {
        int withdrawals = 0;
        for (int i = 0; i < this.banks.length; i++) {
            int[] a = this.banks[i].getTransactions();    // could be without int[] a, but now seems to be more readable
            for (int j = 0; j < a.length; j++) {
                if (a[j] < 0) {
                    withdrawals++;
                }
            }
        }
        return withdrawals;
    }

    public int paymentsQuantity() {       // here without int[] a and using getTransactionsQuantity()
        int payments = 0;
        for (int i = 0; i < this.banks.length; i++) {
            for (int j = 0; j < this.banks[i].getTransactionsQuantity(); j++) {
                if (this.banks[i].getTransactions()[j] > 0) {
                    payments++;
                }
            }
        }
        return payments;
    }

    public double withdrawalsAverage() {
        int withdrawals = 0;
        double withdrawalsSum = 0;
        for (int i = 0; i < this.banks.length; i++) {
            int[] a = this.banks[i].getTransactions();    // could be without int[] a, but now seems to be more readable
            for (int j = 0; j < a.length; j++) {
                if (a[j] < 0) {
                    withdrawals++;
                    withdrawalsSum += a[j];
                }
            }
        }
        if (withdrawals == 0) {
            return 0;
        } else {
            return withdrawalsSum / withdrawals;
        }
    }

    public double paymentsAverage() {
        int payments = 0;
        double paymentsSum = 0;
        for (int i = 0; i < this.banks.length; i++) {
            int[] a = this.banks[i].getTransactions();    // could be without int[] a, but now seems to be more readable
            for (int j = 0; j < a.length; j++) {
                if (a[j] > 0) {
                    payments++;
                    paymentsSum += a[j];
                }
            }
        }
        if (payments == 0) {
            return 0;
        } else {
            return paymentsSum / payments;
        }
    }
}
