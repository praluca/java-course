package com.company;

public class Main {

    public static void main(String[] args) {
        System.out.println("10000 at 2% interest = " + calculateInterest(10000,2));
        for(int i=0; i < 5; i++) {
            System.out.println("Loop " + i + " hello");
        }
        for (int i = 2; i <=8; i++) {
            System.out.println(String.format("%.2f",calculateInterest(10000,i)));
        }
        for (int i = 8; i <=2; i--) {
            System.out.println(String.format("%.2f",calculateInterest(10000,i)));
        }
        int count = 0;
        for(int i = 0; i < 30; i++) {
            if(isPrime(i)) {
                System.out.println(i);
                count++;
                if(count == 3 ) {
                    break;
                }
            }

        }
    }

    public static boolean isPrime(int n) {
        if(n==1) {
            return false;
        }
        for(int i = 0; i <= n/2; i++) {
            if(n % 2 ==0) {
                return  false;
            }
        }
        return true;
    }
    public static double calculateInterest(double amount, double rateInterest) {
        return (amount * (rateInterest / 100));
    }
}
