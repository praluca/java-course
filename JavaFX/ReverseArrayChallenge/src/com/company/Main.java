package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = new int[] {1, 2, 3, 4, 5};
        System.out.println("Array: " + Arrays.toString(array));
        reverse(array);
        System.out.println("Reverse Array: " + Arrays.toString(array));
    }

    public static void reverse(int[] array) {
        int i = 0;
        while (i < array.length / 2) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
            i++;
        }
    }
}
