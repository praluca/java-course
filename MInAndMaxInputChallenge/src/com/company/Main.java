package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        ArrayList<Integer> lista = new ArrayList<>();

        while (true) {
            System.out.println("Enter number: ");
            boolean hasInt = scanner.hasNextInt();
            if (hasInt) {
                int number = scanner.nextInt();
                if(number > max) {
                    max = number;
                }
                if(number < min) {
                    min = number;
                }
            } else {
                break;
            }
        }
        System.out.println("Maximul este " + max + " minimul este " + min);
        scanner.close();
    }
}
