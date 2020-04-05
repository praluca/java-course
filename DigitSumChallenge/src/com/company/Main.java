package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println( sumDigit(25));
    }
    public static int sumDigit(int number) {
        int sum = 0;
        int digit;
        if(number < 10)  {
            return -1;
        } else {
            while(number > 0) {
                digit = number % 10;
                sum += digit;
                number = number / 10;
            }
            return sum;
        }
    }
}
