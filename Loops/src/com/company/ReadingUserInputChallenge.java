package com.company;

import java.util.Scanner;

public class ReadingUserInputChallenge {

    public void test() {

        Scanner scanner = new Scanner(System.in);
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
//        while (true) {    //endless loop
//            int order = counter + 1;
//                System.out.print("Enter number #" + order + ": ");
//
//                boolean isAnInt = scanner.hasNextInt();
//
//                if (isAnInt) {
//                int number = scanner.nextInt();
//                counter++;
//                sum += number;
//                  if (counter == 10);
//                  break;
//                          }
//                } else {
//                System.out.println("Invalid value");
//                }
//                scanner.nextLine();
//                }
//                System.out.println("Sum = " + sum);
//                scanner.close();
//                  }
//                  }

