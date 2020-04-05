package com.company;

public class FirstLastDigitSum {
    public static int sumFirstAndLastDigit(int number) {
        if(number < 0) {
            return -1;
        } else {
            int lastDigit = number % 10;
            int count = 0;
            int sum = lastDigit;
            int copyNumber = number;
            while (number  != 0) {
                count ++;
                number = number / 10;
            }
            if( copyNumber == 0) {
                sum = 0;
            } else {
                int firstDigit = copyNumber / ((int)(Math.pow(10,count -1)));
                sum += firstDigit;
            }
            return sum;
        }
    }
}
