package com.company;

public class Forbasic {

    public static double calculateInterest (double amount, double interestRate) {
        return (amount * (interestRate/100));

//       for(int i=2; i<9; i++) {
//        System.out.println("10,000 at " + i + "interest = " + String.format("%.2f",calculateInterest(10000.0,i)));
//    }
//
//        for(int i=8; i>1; i--) {
//        System.out.println("10,000 at " + i + "interest = " + String.format("%.2f",calculateInterest(10000.0,i)));
//    }

    }

    public static boolean isPrime (int n) {

        if(n == 1) {
            return false;
        }
        for (int i=2; i<=n/2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

//    int count=0;
    // int sum=0;
//    for(int i=10; i<50; i++) {
//        if(isPrime(i)) {
//            count++;
              //sum+=i;
//            System.out.println("Number " + i + " is a prime number");
//            if (count ==3){
//                System.out.println("Exiting the loop");
//                break;
//            }
//        }
//    }
}

//    int count=0;
//    int sum=0;
//        for (int number = 1; number <= 1000; number++) {
//                if (number % 3 == 0 && number % 5 == 0) {
//                count++;
//                sum += number;
//                System.out.println("number " + number);
//                }
//                if (count==5) {
//                break;
//                }
//                }
//                System.out.println("sum = " + sum);

//    int numberOfNumbers=0;
//        for (int number = 1; number <= 1000; number++) {
//            if (number % 3 == 0 && number % 5 == 0) {
//                numberOfNumbers++;
//                System.out.println("number" + number);
//            }
//            if(numberOfNumbers==5){ //number==31
//                break;
//            }
//        }
