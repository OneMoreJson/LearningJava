import java.util.InputMismatchException;
import java.util.Scanner;
/**
 Name: Jason Cameron

 Date: 24 Oct 2021

 Assignment: Completed for ENTD381 Summer 2021 Week 07

 Note: The following were the set criteria
    - We Import the Scanner and use the class for screen I/O.
    - We Ask the user: What is your name?
    - We Scan the users input and output Hello "Name" Where name is the input from the user.
    - We Ask the user to input several numbers, compute the average, and use printf to output
      the answer to the screen.
    - We must properly comment your program including flower box and inline comments.

 */

public class AverageCalc {

    Scanner sc = new Scanner(System.in);                        //   Importing two scanners because I like to keep
    Scanner sn = new Scanner(System.in);                        // strings an ints separate (not really needed)

    // Attributes                                               //   By creating the class attributes, I didn't need
    private String userName;                                    // the following methods to return anything.  If I
    private int totalNumbers;                                   // wanted to, I could later change it so each method
    private int[] numList;                                      // returned a boolean which might affect something else
    private double totalAverage;                                // in the app

    // Full Execution
    public void fullExecution(){                                //   This is the only meth that is public.  It
        intro();                                                // literally calls all the smaller meths in the order
        getUserName();                                          // that is logical.  This meth could later call a menu
        getTotalNumbers();                                      // method which would let the user navigate the app
        getNumberList();
        printNumberList();
        calcTotalAverage();
        closingApp();
    }

    // Intro
    private void intro(){                                       //   Simple greeting... instructions could be added
        System.out.println("Welcome to our Average " +          // to the app later if needed
                "Calculator App (ACA)!");
    }

    // Get Username
    private void getUserName(){                                 //   Asking the user for their name
        boolean contLoop = true;                                //   Using the bool as a flag for the following loop

        while(contLoop){                                        //   Loop used to check to see if the user provided a
            System.out.println("What is your name?  ");         // name or empty string.  Will continue until a name
            String nameProvided = sc.nextLine();                // (or some character) is provided

            if (nameProvided == ""){
                System.out.println("You did not provide a name..." +
                        "\nPlease try again." +
                        "\n__________________________________\n\n");
            } else {
                System.out.println("Thank you " + nameProvided + ".");
                this.userName = nameProvided;
                contLoop = false;
            }
        }
    }

    // Get totalNumbers
    private void getTotalNumbers() {                            //   Needed a number to build our array list for

        System.out.println("How many numbers do you want to calculate?  ");
        this.totalNumbers = testForInt();                       //   Using another meth to check if the input provided
                                                                // is a valid int.  If an invalid character input is
                                                                // given, then the exception handler catches the
                                                                // mistake and requires the user to try again.  The
                                                                // testForInt method returns an int
    }

    // Get User Numbers
    private void getNumberList(){
        this.numList = new int[this.totalNumbers];              //   Creating an array using the totalNumbers var

        for (int i = 0; i < this.numList.length; i++) {         //   Setting each index with a number provided by the
                                                                // user
            System.out.print("\tInput Number " + (i+1) + ":  ");
            this.numList[i] = testForInt();                     //   Getting to use the testForInt meth again.  Yay,
        }                                                       // re-usability!!!
    }
    
    // Print list of Numbers
    private void printNumberList(){                             //   This wasn't required, but it made sense
        System.out.println("Here is the list of numbers we calculated:  ");
        for (int i = 0; i < this.numList.length; i++) {
            System.out.printf(numList[i] + " ", i);             //   NOTE: I used the "printf" to see how it worked
        }                                                       // in comparison with "print" and "println"
    }

    // Calc Averages
    private void calcTotalAverage(){
        int sum = 0;                                            //   Used to hold the sum of all numbers in the array
        for (int i = 0; i < numList.length; i++) {
            sum += numList[i];
        }
        this.totalAverage = (double)sum / this.totalNumbers;    //   Once again, I do not need to return anything
        System.out.printf("\nThe average of all " +             // because I place the final average number in the
                this.totalNumbers + " numbers is: " +           // class's totalAverage var.
                this.totalAverage);                             //   NOTE: I am using "printf" ...
    }

    // Closing
    private void closingApp(){                                      //   A polite closing statement
        System.out.println("\nThank you for using this ACA. " +
                "\nThe app is now closing.");
    }

    // Test for Int
    private int testForInt(){                                       //   This meth is used as an exception handling
        int num;                                                    // tool.  It was used twice inside other methods
        while (true){
            try {
                num = sn.nextInt();
                return num;
            }
            catch (InputMismatchException e) {
                sn.next();
                System.out.print("You did not provide a number." +
                        "\nPlease try again:   ");
            }
        }
    }

}


















