package com.company;

public class Main {

    public static void main(String[] args) {
        // Eight primitive types
        //
        // byte
        // short
        // int
        // long
        // float
        // double
        // char
        // boolean

        // Strings are actually a class
        String myString = "This is a string";
        System.out.println("myString is equal to " + myString);
        myString = myString + ", and this is more.";
        System.out.println("myString is equal to " + myString);

        myString = myString + " \u00A9 2019";
        System.out.println("myString is equal to " + myString);

        String numberString = "250.55";
        numberString = numberString + " 49.95";
        System.out.println(numberString);

        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("LastString is equal to " + lastString); // myInt treated as a string

        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber;
        System.out.println("LastString is equal to " + lastString); // myInt treated as a string

        // Strings are immutable

    }
}
