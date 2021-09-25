import java.util.Scanner;

/*******************
 Name: Jason Cameron

 Date: 26 Sep 2021

 Notes: Completed for ENTD381 Summer 2021 Week 03

     NOTE: This is the Application java file.  This file is called for execution
     in the Main file.  The instructions for our assignment is also in the Main
     file

 *******************/

public class Application {

    // Scanner
    public static Scanner userInput = new Scanner(System.in);

    // Meth
    public static void run(){                                   //   Gets number from user and runs calc meth
        System.out.println("Please provide a whole number greater than one:   \r");
                                                                //   UPDATE: I changed the print to inform we were
                                                                // looking for a whole number
        boolean numChecker = userInput.hasNextInt();            //   A bool var is created to see if the user input was
                                                                // a number.  If it is, the Scanner class can use this
                                                                // ".hasNextInt()" meth (pre-included with the class)
                                                                // will provide a "true" result.
        if(numChecker) {                                        //   The if statement runs when the previous bool var
                                                                // resulted in a "true"
            int num = userInput.nextInt();                      //   Create an int var and fill it with the user's
                                                                // input.  This will be "safe" now because we checked
                                                                // that the user provided a number.  NOTE: an error
                                                                // could still occur if the user provided a float
                                                                // (number with a decimal).  In that case, our bool var
                                                                // will be "false"
            if (num > 1) {                                      //    If the number provided by the user is greater
                                                                // than one, the block of code will print a statement
                                                                // with both the num var and the calcEven function
                                                                // (using the num var for the parameter) result
                System.out.println("The sum of all even numbers between 2 and " +
                        num + " is " + calcEven(num));
            } else {
                System.out.println("You did not provide a number greater than 1");
                                                                //   Otherwise, we tell the user they did not provide
                                                                // a number we could use for this calc
            }
        } else {
            System.out.println("You did not provide a whole number...");
                                                                //   If the user does not provide an int we tell them
                                                                // they did not provide a number.  Again, this could
                                                                // be a logical error since the user could still
                                                                // provide a number with a decimal point, resulting
                                                                // in receiving this response (as it is not an int).
                                                                // UPDATE: I changed the print to inform we were
                                                                // looking for a whole number
        }
    }

    private static int calcEven(int x) {                        //   I like to separate meths, it lets me practice at
                                                                // making this calc function a private (black box) to
                                                                // the outside.  Also, if we wanted, we could use a mod
                                                                // version to calc od numbers and still use the "run"
                                                                // meth (with some changes in working)
        int sumOfEven = 0;                                      //   Initiating an int var to be returned

        if (x >= 2) {                                           //   First we provide an if statement to ensure the
                                                                // number provided will work (greater or equal to 2);
                                                                // I note, I could have just used a greater than one...
            for (int i = 2; i <= x; i++) {                      //   The For loop runs through numbers starting at two
                                                                // and continues as long as "i" is less than or equal
                                                                // to the number within "x" which will be provided by
                                                                // the user later.  Finally, the i var is increased by
                                                                // one every time the loop is completed
                if(i % 2 == 0) {                                //   The if statement checks to see if the number is
                    sumOfEven += i;                             // is even.  This is done by dividing current "i" num
                                                                // by two and confirming the remainder is zero
                }
            }
            return sumOfEven;                                   //   When the loop is completed, we return the sum of
        }                                                       // all the even numbers between two and the number given
        return -1;                                              //   If the number was not found to be greater than
                                                                // one, a negative one is returned... this can be used
                                                                // to show another error message in the run meth.
                                                                // NOTE: It is not really necessary for this app but
                                                                // could allow me to reuse the meth in another app
    }
}
