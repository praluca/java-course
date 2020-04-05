package com.company;

public class Main {

    public static void main(String[] args) {
        boolean isLeap = LeapYear.isLeapYear(-1600);
        System.out.println(isLeap);

        isLeap = LeapYear.isLeapYear(1600);
        System.out.println(isLeap);

        isLeap = LeapYear.isLeapYear(2017);
        System.out.println(isLeap);

        isLeap = LeapYear.isLeapYear(2000);
        System.out.println(isLeap);

        isLeap = LeapYear.isLeapYear(1924);
        System.out.println(isLeap);



    }
}
