package com.company;

public class WhileChallenge {

//    Explanation:
    public static void do15 (int numer) {

        int number = 0; // number=0
        while (number <15) {
            number++; //number już jest 1, bo while statement jest true

            if (number <= 5) {
                System.out.println("Skipping number " + number);
                continue;
            }

            System.out.println("number = " + number);

            if (number >= 10) {
                System.out.println("breaking at " + number);
                break;
            }
        }
    }
}
