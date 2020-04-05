package com.company;

public class Main {

    public static void main(String[] args) {
	    boolean isTeen = TeenNumberChecker.hasTeen(9,99,19);
        System.out.println(isTeen);

        isTeen = TeenNumberChecker.hasTeen(23,15,42);
        System.out.println(isTeen);

        isTeen = TeenNumberChecker.hasTeen(22,23,34);
        System.out.println(isTeen);
    }
}
