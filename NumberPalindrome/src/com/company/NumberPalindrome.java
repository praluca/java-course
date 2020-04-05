package com.company;

public class NumberPalindrome {
    public static boolean isPalindrome(int number) {
        int reversedNumber = 0;
        int copyNumber = number;
       while (copyNumber != 0) {
           int lastDigit = copyNumber % 10;
           reversedNumber = reversedNumber * 10;
           reversedNumber += lastDigit;
           copyNumber = copyNumber / 10;
       }
       if(reversedNumber == number) {
           return true;
       } else {
           return false;
       }
    }
}
