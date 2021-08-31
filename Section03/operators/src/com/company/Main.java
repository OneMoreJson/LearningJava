package com.company;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {

        int result = 1 + 2;  // 1 + 2 = 3
        System.out.println("1 + 2 = " + result);

        int previousResult = result;
        System.out.println("prviousResult " + previousResult);

        result = result - 1;
        System.out.println("3 - 1 = " + result);

        System.out.println("prviousResult " + previousResult);

        result = result * 10;
        System.out.println("2 * 10 = " + result);

        result = result / 5;
        System.out.println("20 / 5 = " + result);

        result = result % 3;
        System.out.println("5 / 3 results in... " + result);


        // Shortcuts
        result ++;
        System.out.println("1 + 1 = " + result);

        result --;
        System.out.println("1 - 1 = " + result);

        result += 2;
        System.out.println("1 + 2 = " + result);

        result *= 10;
        System.out.println("3 * 10 = " + result);

        result /= 3;
        System.out.println("30 / 3 = " + result);

        result -= 2;
        System.out.println("10 - 2 = " + result);

        //if statements with operators
        boolean isAlian = false;

        if (isAlian == false) {
            System.out.println("it is a human");
            System.out.println("And I am afraid of aliens");
        } else {
            System.out.println("it is ann alien");
        }

        int topsScore = 90;
        if (topsScore <= 100) {
            System.out.println("You got the high score!");
        }

        int secondTopScore = 81;
        if (topsScore > secondTopScore && topsScore < 100) {
            System.out.println("Greater than second top score and less than 100");
        } else {
            System.out.println("You are not in the second place");
        }

        if ((topsScore > secondTopScore) && (topsScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        } else {
            System.out.println("You are not in the second place");
        }

        if ((topsScore > 90) || (secondTopScore <= 90)){
            System.out.println("Either or both of the conditions are true ");
        }


        // Common but new programmers experience

        int newValue = 50;
        if (newValue == 50) {
            System.out.println("This is an error when only one equals sign is given");
        }

        boolean isCar = false;
        if (isCar == true){
            System.out.println("once again, and error happens if only one equls is used");
        }

        if (isCar != true){
            System.out.println("once again, and error happens if only one equls is used");
        }

        // Ternary operator ... Important but hard to follow
        boolean wasCar = isCar ? true : false;
        if (wasCar) {
            System.out.println("WasCar is true");
        }

        // try above with different vars
        boolean varTrue = true;

        boolean varFalse = varTrue ? true : false;
        if (varFalse) {
            System.out.println("varFalse is true because varTrue is: " + varFalse);
        } else {
            System.out.println("varFalse is false because varTrue is: " + varFalse);
        }

        // Why helpful?        <-- THIS IS AWESOME!!!
        int ageOfClient = 20;
        boolean isEighteenOrOver = ageOfClient >= 18? true : false;

        System.out.println("is the age of the client over 18 years old? " + isEighteenOrOver);

        // CAN I?             <-- HOLY SMOKES!!! NICE!!!!
        String x = "hello";
        String y = x == "hello" ? "smile" : "frown";
        System.out.println(x);
        System.out.println(y);

        // CAN I?             <-- Taking it so much further!
        int num1 = 574789543;
        int a = num1 % 2;
        String b = a == 1 ? "odd" : "even";
        System.out.println("remainder is: " + a);
        System.out.println("therefore the " + num1 +" was: " + b);

    }
}
