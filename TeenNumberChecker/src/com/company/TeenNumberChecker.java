package com.company;

public class TeenNumberChecker {
    public static boolean hasTeen(int first, int second, int last){
        if(isTeen(first) || isTeen(second) || isTeen(last)){
            return true;
        } else {
            return false;
        }
    }

    public static boolean isTeen(int number){
        if( number >= 13 && number <= 19){
            return true;
        } else {
            return false;
        }
    }


}
