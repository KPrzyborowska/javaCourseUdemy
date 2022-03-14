package com.company;

public class NumberToWords {

    public static void numberToWords(int number) {

        if (number < 0) {
            System.out.println("Invalid Value");
            return;
        }
        if (number == 0) {
            System.out.println("Zero");
            return;
        }
        int oldNumberDigitCount;
        oldNumberDigitCount=getDigitCount(number);
        number = reverse(number);
        int newNumberDigitCount;
        newNumberDigitCount=getDigitCount(number);
        int diff = oldNumberDigitCount - newNumberDigitCount;


        int digit = 0;
        while (number > 0) {
            digit = number % 10;
            if (digit == 0) {
                System.out.println("Zero");
            }
            if (digit == 1) {
                System.out.println("One");
            }
            if (digit == 2) {
                System.out.println("Two");
            }
            if (digit == 3) {
                System.out.println("Three");
            }
            if (digit == 4) {
                System.out.println("Four");
            }
            if (digit == 5) {
                System.out.println("Five");
            }
            if (digit == 6) {
                System.out.println("Six");
            }
            if (digit == 7) {
                System.out.println("Seven");
            }
            if (digit == 8) {
                System.out.println("Eight");
            }
            if (digit == 9) {
                System.out.println("Nine");
            }
            number /= 10;
        }
        if (diff > 0) {
            for (int i = 0; i < diff; i++) {
                System.out.println("Zero");
            }
        }
    }

    public static int reverse (int number) {

//        if (number < 0)
//        {
//            number *= -1;
//        }

        int reverse = 0;
        int stored = Math.abs(number); //if (number<0){ number *= -1; }
        while (stored > 0) {
            int digit = stored % 10;
            reverse = (reverse * 10) + digit;
            stored /= 10;
        }
        if (number < 0) {
            return reverse * -1;
        }
            return reverse;
    }

    public static int getDigitCount (int number) {

        if (number < 0) {
            return -1;
        }
        if (number == 0) {
            return 1;
        }

        int count = 0;
        int digit = 0;
        while (number > 0) {
            digit = number % 10;
                count ++;
            number /= 10;
        }
        return count;
    }
}