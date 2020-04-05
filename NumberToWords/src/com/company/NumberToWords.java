package com.company;

public class NumberToWords {
    public static void numberToWords(int number) {
        if(number < 0) {
            System.out.println("Invalid Value");
        }
        int reversedNumber = reversed(number);
        int zero = getDigitCount(number) - getDigitCount(reversedNumber);
        if (number == 0) {
            System.out.println("Zero");
        }
        while (reversedNumber != 0 ) {
            int lastDigit = reversedNumber % 10;

            switch (lastDigit){
                case 0:
                    System.out.println("Zero");
                    break;
                case 1:
                    System.out.println("One");
                    break;
                case 2:
                    System.out.println("Two");
                    break;
                case 3:
                    System.out.println("Three");
                    break;
                case 4:
                    System.out.println("Four");
                    break;
                case 5:
                    System.out.println("Five");
                    break;
                case 6:
                    System.out.println("Six");
                    break;
                case 7:
                    System.out.println("Seven");
                    break;
                case 8:
                    System.out.println("Eight");
                    break;
                case 9:
                    System.out.println("Nine");
                    break;
            }
            reversedNumber = reversedNumber / 10;

        }
        for( int i = 0; i < zero ; i++) {
            System.out.println("Zero");
        }

    }
    public static int reversed(int number) {
        int reversedNumber = 0;
        while (number != 0) {
            int digit = number % 10;
            reversedNumber = reversedNumber * 10;
            reversedNumber = reversedNumber + digit;
            number = number / 10;
        }
        return reversedNumber;
    }
    public static int getDigitCount(int number) {
        if(number < 0) {
            return  -1;
        }
        int count = 0;
        if(number == 0) {
            count = 1;
        } else {
            while (number != 0) {
                number = number / 10;
                count ++;
            }
        }
        return count;
    }
}
