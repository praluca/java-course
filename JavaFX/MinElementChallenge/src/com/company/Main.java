package com.company;

import java.util.Scanner;

public class Main {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] array;
        System.out.println("Enter count: ");
        int count = scanner.nextInt();
        scanner.nextLine();
        array = readIntegers(count);
        System.out.println("Min element is " + findMin(array));
    }
    public static int[] readIntegers(int count) {
        System.out.println("Enter " + count + " elements");
        int[] array = new int[count];
        for(int i = 0; i < count; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    public static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < array.length; i++) {
            if(array[i] < min ) {
                min = array[i];
            }
        }
        return min;
    }
}
