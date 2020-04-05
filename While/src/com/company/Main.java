package com.company;

public class Main {

    public static void main(String[] args) {
//        int count = 1;
//        while (count != 6) {
//            System.out.println("Count value is: " + count);
//            count ++;
//        }
//        for(int i = 6; i != 6; i++) {
//            System.out.println("Count value is " + count);
//        }

//        int count = 6;
//        do {
//            System.out.println("Count value was " + count);
//            count ++;
//
//            if(count > 100) {
//                break;
//            }
//        } while (count !=6);

        int number = 4;
        int finishNumber = 20;

//        while (number <= finishNumber) {
//            number ++;
//            if(!isEven(number)) {
//                continue;
//            }
//            System.out.println("Even number " + number);
//        }
        int countEven = 0;
        while (number <= finishNumber) {
            number ++;
            if(!isEven(number)) {
                continue;
            } else {
                System.out.println("Even number " + number);
                countEven ++;
                if(countEven == 5 ) {
                    break;
                }
            }
        }
        System.out.println("Toatal even number " + countEven  );
    }

    public static boolean isEven(int number) {
        if(number % 2 == 0) {
            return  true;
        } else {
            return false;
        }
    }
}
