package com.company;

public class Main {

    public static void main(String[] args) {
        int myValue = 10000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value: " + myMinIntValue);
        System.out.println("Integer Maximum Value: " + myMaxIntValue);
        System.out.println("Busted MAX Value: " + (myMaxIntValue + 1));//overflow
        System.out.println("Busted MIN Value: " + (myMinIntValue - 1));//underflow

        int myMaxTestValue =  2_147_483_647;

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte Minimum Value = " + myMinByteValue);
        System.out.println("Byte Maximum Value = " + myMaxByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short Minimum Value = " + myMinShortValue);
        System.out.println("Short Maximum Value = " + myMaxShortValue);

        long myLongValue = 100L;
        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long Minimum Value = " + myMinLongValue);
        System.out.println("Long Maximum Value = " + myMaxLongValue);
        long bigLongLiteralValue = 2_147_483_647_234L;
        System.out.println(bigLongLiteralValue);

        int myTotal = (myMinIntValue / 2);
        byte myNewByteValue = (byte) (myMinByteValue/2);
        short myShortNewValue = (short) (myMinShortValue/2);

        byte myByteNumberChallange = 10;
        short myShortNumberChallange = 25;
        int myIntNumberChallange = 15;
        long myLongNumberChallange = 50000L + 10L * (myByteNumberChallange + myShortNumberChallange + myIntNumberChallange);
        System.out.println(myLongNumberChallange);

        short shortTotal = (short) (1000 + 10 * (myByteNumberChallange + myShortNumberChallange + myIntNumberChallange));

    }
}
