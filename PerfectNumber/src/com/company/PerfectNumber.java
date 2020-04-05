package com.company;

public class PerfectNumber {
    public static boolean isPerfectNumber(int number) {
        int sum = 0;
        if(number < 1) {
            return  false;
        }
        int[] divisor = new int[100];
        int nr = 0;
        for(int i = 1; i <= number/2; i++) {
            if(number % i == 0) {
                divisor[nr] = i;
                nr++;
            }
        }
        for (int j = 0; j < nr; j++) {
            sum = sum + divisor[j];
        }
        if(sum == number) {
            return true;
        } else {
            return false;
        }
    }
}
