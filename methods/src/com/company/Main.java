package com.company;

public class Main {

    public static void main(String[] args) {

      calculateScore (true, 800, 5, 100);
        /* as:
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        calculateScore (gameOver, score, levelCompleted, bonus);

        gameOver = true
        score = 10000
        itp = za drugim razem bez prymitywów, bo zmieniamy dane a nie tworzymy nowe

        calculateScore (gameOver, score, levelCompleted, bonus);
        tak też można na dłuższy sposób
	 */
        calculateScore (true, 10000, 8, 200);
    }
    public static void calculateScore (boolean gameOver, int score, int levelCompleted, int bonus){
        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            finalScore += 1000;
            System.out.println("Your final score is " + finalScore);
        }
    }

}
