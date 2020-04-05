package com.company;

import java.util.Scanner;

public class InputCalculator {
    public void inputThenPrintSumAndAverage() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        float average = 0;
        int count = 0;
        while (true) {
            boolean hasNextInt = scanner.hasNextInt();
            if(hasNextInt) {
                int number = scanner.nextInt();
                count ++;
                sum += number;
            } else {
                average =Math.round ((double) ((double)sum / (double)count));
                System.out.println("SUM = " + sum + " AVG = " + average);
                break;
            }
        }
        scanner.nextLine();
        scanner.close();
    }
}
