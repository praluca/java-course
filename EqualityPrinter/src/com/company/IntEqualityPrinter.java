package com.company;

public class IntEqualityPrinter {
        public  static  void  printEqual(int first, int second, int last) {
            if(first < 0 || second < 0 || last < 0) {
                System.out.println("Invalid Value");
            } else if(first == second && second == last){
                System.out.println("All numbers are equal");
            } else if(first != second && second != last && first != last) {
                System.out.println("All numbers are different");
            } else {
                System.out.println("Neither all are equal or different");
            }
        }
}
