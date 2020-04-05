package com.company;

public class FlourPacker {
    public static boolean canPack(int bigCount, int smallCount, int goal) {
        if(bigCount < 0 || smallCount < 0 || goal < 0) {
            return false;
        }
        if(bigCount * 5 + smallCount < goal) {
            return false;
        } else if(bigCount * 5 + smallCount == goal) {
            return true;
        } else {
            int diff = goal % 5 - bigCount;
            int diffS = goal % 5;
            if(smallCount >= diff  && smallCount >= diffS) {
                return true;
            } else {
                return false;
            }
        }
    }
    //&& goal % bigCount + smallCount >=goal
}
