package com.marci.mentoring;

public class Math {

    private static final int ONE = 1;

    public static boolean isPrime(int number) {
        if (number == ONE || isEven(number)) {
            return false;
        }
        for (int i = 3; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static boolean isEven(int number) {
        return number % 2 == 0;
    }

}
