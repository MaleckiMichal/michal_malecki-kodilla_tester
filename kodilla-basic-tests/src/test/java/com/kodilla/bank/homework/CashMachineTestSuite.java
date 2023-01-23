package com.kodilla.bank.homework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CashMachineTestSuite {

    @Test
    public void shouldReturnEqualBalance() {
        CashMachine cashMachine = new CashMachine(1500);
        int result = cashMachine.generatingTransactions.getInitialBalance();
        for (int i=0; i<cashMachine.getTransactions().length; i++) {
            result += cashMachine.getTransactions()[i];
        }
        assertEquals(result,cashMachine.getBalance());
    }

    @Test
    public void shouldReturnEqualQuantityOfTransactions() {
        CashMachine cashMachine1 = new CashMachine(2000);
        CashMachine cashMachine2 = new CashMachine(100);
        CashMachine cashMachine3 = new CashMachine(20000);

        assertEquals(cashMachine1.getTransactions().length, cashMachine1.getTransactionsQuantity());
        assertEquals(cashMachine2.getTransactions().length, cashMachine2.getTransactionsQuantity());
        assertEquals(cashMachine3.getTransactions().length, cashMachine3.getTransactionsQuantity());
    }
}


/*
  @Test
    public void shouldReturnEqualInitialBalance() {
        CashMachine cashMachine = new CashMachine(4000);
        int initBalance = cashMachine.generatingTransactions.getInitialBalance();
        assertEquals(4000,initBalance);
    }
*/