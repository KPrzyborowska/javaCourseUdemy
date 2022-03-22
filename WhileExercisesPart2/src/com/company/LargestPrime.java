package com.company;

public class LargestPrime {

    public static int getLargestPrime(int number) {

        if (number <= 1) {
            return -1;
        }

        if (number > 1) {
            for (int i = 3; i < number; i++) {
                if (number % i == 0) {
                    int firstPrime = i;
                    int secondPrime = i++;
                    if (firstPrime * secondPrime == number) {
                        return secondPrime;
                    }
                }
            }
        }
        return -1;
    }
}
