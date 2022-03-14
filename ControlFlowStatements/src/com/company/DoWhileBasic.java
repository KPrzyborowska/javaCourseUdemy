package com.company;

public class DoWhileBasic {

    int number = 4;
    int finishNumber = 20;
    int sum =0;
    while (number <= finishNumber) {
        number++;
        if(isEvenNumber(number)) {
            sum++;
        System.out.println("Even number " + number);
            System.out.println("Sum of Even numbers is " + sum);
        }
    }
}
