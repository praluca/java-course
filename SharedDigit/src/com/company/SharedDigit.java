package com.company;

public class SharedDigit {
    public static boolean hasSharedDigit (int first, int second) {
        if( first < 10 || first > 99 || second < 10 || second > 99) {
            return false;
        } else {
            boolean flag = false;
            int[] digits = new int[100];
            int nr = 0;
            while (first != 0) {
                int digit = first % 10;
                digits[nr] = digit;
                nr++;
                first = first / 10;
            }
            while (second != 0) {
                int sDigit = second % 10;
                for(int i = 0; i < nr; i++) {
                    if(digits[i] == sDigit) {
                        flag = true;
                    }
                }
                second = second / 10;
            }
            return flag;
        }
    }
}
