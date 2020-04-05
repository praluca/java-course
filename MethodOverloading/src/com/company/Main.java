package com.company;

public class Main {

    public static void main(String[] args) {
       int newScore = calculateScore("Tim", 500);
        System.out.println("New score is " + newScore);
        calculateScore(75);
        calculateScore();

       double feetAndInches= calcFeetAndInchesToCentimeters(6,5);
        System.out.println(feetAndInches);

        feetAndInches= calcFeetAndInchesToCentimeters(156);
        System.out.println(feetAndInches);

    }
    public static int calculateScore(String playerName, int score) {
        System.out.println("Player " + playerName + " scored " + score + " points");
        return score * 100;
    }

    public static int calculateScore(int score) {
        System.out.println("Unnamed player scored " + score + " points");
        return score * 100;
    }

    public static int calculateScore() {
        System.out.println("No player, no score");
        return 0;
    }
    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if(feet >= 0){
            if(inches >= 0 && inches <= 12) {
                return feet * 12 * 2.54 + inches * 2.54;
            } else {
                return -1;
            }
        } else {
            return -1;
        }
    }
    public static double calcFeetAndInchesToCentimeters(double inches){
        if(inches >= 0 ) {
            double feet = (int)inches / 12;
            double remainingInches = (int) inches % 12;
            double sum = calcFeetAndInchesToCentimeters(feet,remainingInches);
            return sum;
        } else {
            return -1;
        }
    }

}
