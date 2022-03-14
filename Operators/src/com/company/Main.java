package com.company;

public class Main {

    public static void main(String[] args) {
	int result = 2 + 2;
    result = result % 3;
        System.out.println("Przy dzieleniu 4/3 zostaje reszta " + result);

        //result = result + 1
        result++; //1+1=2
        System.out.println("1 + 1 = " + result);

        result--; //result = result - 1 so 2 -1 = 1
        System.out.println("2 - 1 = " + result);

        result +=2; //result = result + 2 so 1 + 2 = 3
        System.out.println("1 + 2 = " + result);

        result *=10; //result = result * 10 so 3*10=30
        System.out.println("3 * 10 = " + result);

        result /=3; //result = result / 3 so 30/3-10
        System.out.println("10 / 3 = " + result);

         boolean isAlien = false;
         if (isAlien == false) { //start of code block
             System.out.println("It's not an Alien");
             System.out.println("and I'm scared of aliens");
         } //finish of code block

        int topScore = 80;
         if (topScore == 100) {
             System.out.println("You got the high score!");
         }

         int secondTopScore = 81;
         if (topScore > secondTopScore && topScore < 100) {
             System.out.println("Greater than the second top score and less than 100");
         }

         if ((topScore > 90) || (secondTopScore <= 90)) {
             System.out.println("Either or both of the conditions are true");
         }

         // boolean isCar = false;
         // if (isCar == false) { //jeśli = true to java traktuje jakos przypisanie do iscar true a nie sprawdzanie
             //System.out.println("Now is fine");
        // }

         boolean isCar = false;
         if (isCar) {
             System.out.println("It's faster if question");
         }


         isCar = true;
         boolean wasCar = isCar ? true : false;
         if (wasCar) {
             System.out.println("wasCar is true");
         }

         //zadanie

        double firstDouble = 20.00d;
         double secondDouble = 80.00d;
         double resultOfDoubles = (firstDouble + secondDouble) * 100.00d;
         double reminderOfResult = resultOfDoubles % 40.00d;
        System.out.println("result of doubles is " + resultOfDoubles);
        System.out.println("reminder of result is " + reminderOfResult);

        boolean isNoReminder = (reminderOfResult == 0) ? true : false;
        System.out.println(" Is no reminder = " + isNoReminder);

            if (!isNoReminder){
                System.out.println("Got some reminder");
            }
    }
}
