package com.company;

import java.util.Scanner;

public class ReadingUserInputChallenge {

    public void test() {

        Scanner scanner = new Scanner(System.in);
//        //        scanner.nextLine();
//        boolean hasNextInt = scanner.hasNextInt();
        int sum = 0;
        int counter = 1;
        while (counter <= 10) {
            System.out.print("Enter number #" + counter + ": ");
            boolean correctNumber = scanner.hasNextInt();
            if (correctNumber) {
                int number = scanner.nextInt();
                sum += number;
                counter++;
            } else {
                System.out.println("Invalid value");
            }
            scanner.nextLine();
        }
        scanner.close();
        System.out.println("Sum of entered numbers is " + sum);
    }
}
