package com.company;

public class Main {

    public static void main(String[] args) {

        int myValue = 10_000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum Value " + myMinIntValue);
        System.out.println("Integer Maximum Value " + myMaxIntValue);

        System.out.println("Busted Max values = " + (myMaxIntValue + 1));
        System.out.println("Busted Min values = " + (myMinIntValue - 1));

        int myMaxIntTest = 2147483647;  // Throws an error if you make the last digit an 8

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;
        System.out.println("Byte max value = " + myMaxByteValue);
        System.out.println("Byte min value = " + myMinByteValue);

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;
        System.out.println("Short max value = " + myMaxShortValue);
        System.out.println("Short min value = " + myMinShortValue);

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;
        System.out.println("Long max value = " + myMaxLongValue);
        System.out.println("Long min value = " + myMinLongValue);

        long myLongValue = 100L;
        System.out.println(myLongValue);

        int myTotal = (myMinIntValue / 2);

        byte myNewByteValue = (byte)(myMinByteValue / 2 );

        short myNewShortValue = (short)(myMinShortValue /2);

    }
}
