package com.company;

public class Main {

    public static void main(String[] args) {

        byte myB = 10;
        short myS = 20;
        int myI = 50;
        long myL = 50_000L + ((myB + myS + myI) * 10);

        System.out.println(myL);

    }
}
