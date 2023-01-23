package com.kodilla.basic_assertion;

public class PrimeChecker {

    private int count;
    public boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    public int getCount() {
        return count;
    }

    public void incrementCount() {
        this.count++;
    }
}


/*
public boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return number > 1;
    }
 */