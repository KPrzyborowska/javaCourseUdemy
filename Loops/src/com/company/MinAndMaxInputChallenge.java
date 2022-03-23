package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MinAndMaxInputChallenge {

    public void minAndMax () {

        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE; //na pierwszą wprowadzoną liczbę, żeby była najmniejsza
        int max = Integer.MIN_VALUE; //na pierwszą wprowadzoną liczbę, żeby była największa (bo nie ma porównania)

        while (true) {
            System.out.println("Enter number");
            boolean isAnInt = scanner.hasNextInt();

            if (isAnInt) {
                int number = scanner.nextInt();
                if ()
            }
        }
    }


}
