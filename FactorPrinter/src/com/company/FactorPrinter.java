package com.company;

public class FactorPrinter {
    public static void printFactors(int number) {
        if(number < 1 ) {
            System.out.println("Invalid Value");
        }
        int[] factors = new int[100];
        int nr = 0;
        for(int i = 1; i <= number; i++) {
            if(number % i == 0) {
                factors[nr] = i;
                nr ++;
            }
        }
        for (int i = 0; i < nr; i++) {
            System.out.println(factors[i]);
        }

    }
}
