package com.company;

public class Main {

    public static void main(String[] args) {
        boolean hasSum = EqualsSumChecker.hasEqualSum(1,1,1);
        System.out.println(hasSum);

        hasSum = EqualsSumChecker.hasEqualSum(1,1,2);
        System.out.println(hasSum);

        hasSum = EqualsSumChecker.hasEqualSum(1,-1,0);
        System.out.println(hasSum);
    }
}
