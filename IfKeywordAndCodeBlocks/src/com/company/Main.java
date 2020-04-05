package com.company;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        boolean secondGameOver = true;
        int secondScore = 10000;
        int secondLevelCompleted = 8;
        int secondBonus = 200;

//        if (score < 5000 && score >1000) {
//            System.out.println("Your score was less than 5000 but greater than 1000");
//        } else if(score < 1000) {
//            System.out.println("Your score is less than 1000");
//        } else {
//            System.out.println("Got here! ");
//        }

        if(gameOver == true){
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was " + finalScore);
        }
        if(secondGameOver){
            int secondFinalScore = secondScore + (secondLevelCompleted * secondBonus);
            System.out.println("Your second  final score was " + secondFinalScore);
        }



    }
}
