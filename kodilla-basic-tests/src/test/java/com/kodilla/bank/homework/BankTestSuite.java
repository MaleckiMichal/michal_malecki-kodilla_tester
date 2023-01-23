package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BankTestSuite {

    @Test
    public void shouldReturnEqualTotalBalance() {
        Bank bank = new Bank(2000,6000,10000,500,1500);
        int total = 0;
        for (int i = 0; i < bank.banks.length; i++) {
            total += bank.banks[i].getBalance();
        }

        assertEquals(total,bank.totalBalance());
    }

    @Test
    public void shouldReturnEqualWithdrawalsQuantity() {
        Bank bank = new Bank(2500,4500,8000,500,12000);
        int withdrawals = 0;
        for (int i = 0; i < bank.banks.length; i++) {
            int[] a = bank.banks[i].getTransactions();
            for (int j=0; j<a.length;j++) {
                if (a[j] < 0) {
                    withdrawals++;
                }
            }
        }
        assertEquals(withdrawals,bank.withdrawalsQuantity());
    }

    @Test
    public void shouldReturnEqualPaymentsQuantity() {
        Bank bank = new Bank(500,6500,4000,2500,1500);
        int payments = 0;
        for (int i = 0; i < bank.banks.length; i++) {
            int[] a = bank.banks[i].getTransactions();
            for (int j=0; j<a.length;j++) {
                if (a[j] > 0) {
                    payments++;
                }
            }
        }
        assertEquals(payments,bank.paymentsQuantity());
    }

    @Test
    public void averageShouldBeZeroIfWithdrawalsQuantityIsZero() {
        Bank bank = new Bank(-25000,-25000,-25000,-25000,-25000); // negatives for test need to get withdrawals quantity = 0
        assertEquals(0,bank.withdrawalsAverage());
    }

    @Test
    public void withdrawalsAvgShouldReturnEqual() {
        Bank bank = new Bank(2000,4000,1000,500,15500);
        int quantity = 0;
        double sum = 0;
        for (int i = 0; i < bank.banks.length; i++) {
            int[] a = bank.banks[i].getTransactions();
            for (int j = 0; j < a.length; j++) {
                if (a[j] < 0) {
                    quantity++;
                    sum += a[j];
                }
            }
        }
        assertEquals(sum/quantity,bank.withdrawalsAverage(),0.01);
    }

    @Test
    public void paymentsAvgShouldReturnEqual() {
        Bank bank = new Bank(2000,6000,10000,500,1500);
        int quantity = 0;
        double sum = 0;
        for (int i = 0; i < bank.banks.length; i++) {
            int[] a = bank.banks[i].getTransactions();
            for (int j = 0; j < a.length; j++) {
                if (a[j] > 0) {
                    quantity++;
                    sum += a[j];
                }
            }
        }
        assertEquals(sum/quantity,bank.paymentsAverage(),0.01);
    }
}
