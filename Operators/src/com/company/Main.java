package com.company;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2; // 1 + 2 =3
        System.out.println("1 + 2 = " + result);
        int previousResult = result;
        System.out.println("previousResult = " + previousResult);
        result = result - 1; //3 - 1 = 2
        System.out.println("3 - 1 = " + result);
        System.out.println("previousResult = " + previousResult);

        result = result * 10; //2 * 10 = 20
        System.out.println("2 * 10 = " + result);

        result = result / 5; //20 / 5 = 4
        System.out.println("20 / 5 = " + result);

        boolean isAlien = false;
        if(isAlien == false) {
            System.out.println("It is not an alien!");
            System.out.println("And i am scared of aliens");
        }

        int topScor = 100;
        if(topScor == 100){
            System.out.println("You got the high score! ");
        }

        boolean isCar = false;
        if(isCar){
            System.out.println("This is not supposed to happen");
        }

        isCar = true;
        boolean wasCar = isCar ? true : false;
        if(wasCar) {
            System.out.println("was car is true");
        }

        double myDouble = 20.00;
        double mySecondDouble = 80.00;
        double myResult = (myDouble + mySecondDouble) * 100;
        double remainder = myResult % 40.00;
        boolean isZero = remainder == 0 ? true : false;
        System.out.println("isZero is equals to " + isZero);

        if(!isZero) {
            System.out.println("Got some remainder");
        }

    }
}
