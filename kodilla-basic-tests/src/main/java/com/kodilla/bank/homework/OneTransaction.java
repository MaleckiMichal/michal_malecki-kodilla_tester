package com.kodilla.bank.homework;

import java.util.Random;

public class OneTransaction {

    public int cashTransaction() {
        Random random = new Random();
        while (true) {
            int temp = random.nextInt(-2000,2000);
            if ((temp % 10) == 0 && temp != 0) {
                return temp;
            }
        }
    }

    public int cashPaymentOnly() {
        Random random = new Random();
        while (true) {
            int temp = random.nextInt(100,2000);
            if ((temp % 10) == 0) {
                return temp;
            }
        }
    }
}
