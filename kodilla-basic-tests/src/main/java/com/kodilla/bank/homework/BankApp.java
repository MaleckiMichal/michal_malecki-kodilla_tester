package com.kodilla.bank.homework;

public class BankApp {

    public static void main(String[] args) {
        Bank bank = new Bank(2000,6000,10000,500,1500);
        System.out.println(bank.banks[0].getBalance());
        System.out.println(bank.banks[1].getBalance());
        System.out.println(bank.banks[2].getBalance());
        System.out.println(bank.banks[3].getBalance());
        System.out.println(bank.banks[4].getBalance());
        System.out.println("Total balance: " + bank.totalBalance());
        System.out.println("Withdrawals total: " + bank.withdrawalsAverage() * bank.withdrawalsQuantity());
        System.out.println("Withdrawals quantity: " + bank.withdrawalsQuantity());
        System.out.println("Withdrawals avg: " + bank.withdrawalsAverage());
        System.out.println("Payments total: " + bank.paymentsAverage() * bank.paymentsQuantity());
        System.out.println("Payments quantity: " + bank.paymentsQuantity());
        System.out.println("Payments avg: " + bank.paymentsAverage());
    }
}
