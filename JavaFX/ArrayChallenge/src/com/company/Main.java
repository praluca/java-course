package com.company;

import java.util.Scanner;

public class Main {

    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] array = new int[5];
        array = createArray(5);
        sortArray(array);
        System.out.println("Sorted array");
        for(int i = 0; i < array.length; i++) {
            System.out.println("array[" + i + "] = " + array[i]);
        }
    }
    public static int[] createArray(int number) {
        System.out.println("Enter " + number + " items");
        int[] array = new int[number];
        for(int i = 0; i <number; i++ ) {
            array[i] = scanner.nextInt();
        }
        return  array;
    }
    public static int[] sortArray(int[] array) {
        for(int i = 0; i < array.length - 1; i++) {
            if(array[i] < array[i+1]) {
                int aux = array[i];
                array[i] = array[i+1];
                array[i+1] = aux;
            }
        }
        return array;
    }
}
