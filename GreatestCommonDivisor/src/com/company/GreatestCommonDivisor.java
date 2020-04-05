package com.company;

public class GreatestCommonDivisor {
    public static int getGreatestCommonDivisor(int first, int second) {
        if( first < 10  || second < 10) {
            return -1;
        }
        int[] divisor = new int[100];
        int nr = 0;
        for( int i = 1; i <= first; i++) {
            if(first % i ==0 && second % i == 0) {
                divisor[nr] = i;
                nr ++;
            }
        }
        int max = 1;
        for(int i = 0; i < nr; i++) {
            if(divisor[i] > max) {
                max = divisor[i];
            }
        }
        return max;
    }
}
