package com.company;

public class largestPrime {

    public static int getLargestPrime(int number) {
        if (number <= 1) {
            return -1;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                number /= i;
                i--;
            }
        }
        return number;
    }
}
//    public static int getLargestPrime2(int number) {
//        if (number <= 1) {
//            return -1;
//        }
//        int bigestPrime = -1;
//        for (int i = 2; i < number; i++) {
//            if (number % i == 0 && isPrime(i) && bigestPrime < i) {
//                bigestPrime = i;
//            }
//        }
//        return bigestPrime;
//    }
//
//    private static boolean isPrime(int i) {
//        for (int j = 2; j < i; j++) {
//            if( i% j == 0){
//                return false;
//            }
//        }
//        return true;
//    }
//}
////                        int firstPrime = i;
////                        int secondPrime = i++;
////                        if (firstPrime * secondPrime == number) {
////                            return secondPrime;
//                        }
//                    }
//                }
//            }
//            return -1;
//        }

