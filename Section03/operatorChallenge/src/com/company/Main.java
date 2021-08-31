package com.company;

public class Main {

    public static void main(String[] args) {

        double num1 = 20.00d;
        double num2 = 80.00d;
        double numTotal = (num1 + num2) * 100.00d;

        System.out.println("total of all numbers in equation = " + numTotal);

        double remainderNum = numTotal % 40.00d;
        System.out.println("the remainder was: " + remainderNum);

        boolean x = (remainderNum == 0.0)? true : false;
        System.out.println(x);

        if (!x) {
            System.out.println("Got some remainder");
        }

    }
}
