package com.company;

public class SharedDigit {

    public static boolean hasSharedDigit(int number1, int number2) {

        if ((number1 < 10 || number1 > 99) || (number2 < 10 || number2 > 99)) {
            return false;
        }

        while (number1 > 0 && number2 > 0) {
            int digit1 = number1 % 10;
            int digit2 = number2 % 10;
            number1 /= 10;
            number2 /= 10;
            if ((digit1 == number1) || (digit1 == number2) || (digit2 == number1) || (digit2 == number2) || (digit1 == digit2) || (number1==number2)) {
                return true;
            }
            if (number1 <9 ||number2 <9) {
                break;
            }
        }
        return false;
        }
    }