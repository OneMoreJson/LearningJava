/**
 Name: Jason Cameron

 Date: 17 Oct 2021

 1 Note: Completed for ENTD381 Summer 2021 Week 06

 2 NOTE: Assignment Execution

     - The following CalcApp consists of one class found in CalcApp.java file.  The
       Main.java file executes the app
     - The try, catch and final statement blocks are found in the section
       "METHS: Calc App Operations" of the CalcApp class.  During each calc method (add,
       subtract, multiply, and division), exception handling statements were used to
       protect the app from a user inputting a character or string when the app vars
       expected an int.  During the division meth, another "catch" was used to
       protect the app from trying to divide a number by zero.
     - The "finally" statement was used to show that the calculation was completed by
       printing a dash line.  Next the calc meth invokes the requestToContApp meth

 */



import java.util.InputMismatchException;
import java.util.Scanner;

public class CalcApp {

    // SCANNERS
    static Scanner ss = new Scanner(System.in);                 //   Probably not needed, but I like to try and
    static Scanner sn = new Scanner(System.in);                 // separate my int & string responses

    // ATTRIBUTES                                               //   Vars are used in each operation meth
    private int answer;
    private int x;
    private int y;


    // CONSTRUCTOR
    public CalcApp() {
        this.answer = 0;
        this.x = 0;
        this.y = 0;
    }


    // METHS:  App Controls
    public void startCalcApp(){                                 //   Should be the only method used in the Main file
        System.out.println("Welcome to Calc App.  " +           // for execution.  Everything else is a "Choose Your
                "\nIn this app, You will be able to " +         // own adventure."
                "\nperform mathematical operations" +
                "\non two numbers.\n" +
                "\n---------------------------------------\n");
        runAppMenu();                                           //   Actually runs the main portion of the application
    }

    private void runAppMenu(){
        String selection;                                       //   Var is used to gather input from user (via scan)
        boolean continueApp = true;                             //   Var used to control While loop

        while(continueApp) {                                    //   Loop used to keep presenting the menu options.  It
                                                                // ends when the user chooses to end app
            System.out.println("Please select the following " +
                    "operation you want to run:  " +
                    "\n\t1.  Addition" +
                    "\n\t2.  Subtraction" +
                    "\n\t3.  Multiplication" +
                    "\n\t4.  Division" +
                    "\n\t5.  End");

            selection = ss.nextLine();                          //   Scan selection is used to determine what op the
                                                                // user want to perform
            switch (selection.toLowerCase()) {
                case "1": case "a": case "add": case"addition": //   Multiple cases checked for each choice
                    continueApp = addNum();                     //   Stores boolean return from the addNum meth so
                    break;                                      // we know if the app should continue
                case "2": case "s": case "sub": case "subtract": case "subtraction":
                    continueApp = subNum();
                    break;
                case "3": case "m": case "multiply": case "multiplication":
                    continueApp = multiplyNum();
                    break;
                case "4": case "d": case "divide": case "division":
                    continueApp = divNum();
                    break;
                case "5": case "e": case "end": case "exit":
                    continueApp = false;
                    break;
                default :                                       //   Kicks off if none of the previous choices are given
                    System.out.println("Invalid entry.  Please try again..." +
                            "\n---------------------------------------\n");
            }
        }

        System.out.println("Thank you for using Calc App." +    //   Closer statement to inform user the app is
                "\nApplication is closing...." +                // finish.  The scribble text is "enthusiasm arm pump"
                "\n\t(ง •̀ω•́)ง✧̑̑" + " Awesome Work!\n\n\n");            // emoji
    }

    private static boolean requestToContApp(){                  //   Created this meth because it is redundantly used
        String userResponse;                                    // in all the calc methods
        System.out.println("Would you like another calculation?  Y/N");
        userResponse = ss.nextLine();

        switch (userResponse.toLowerCase()) {                   //   Much of this meth is the same as the runAppMenu
                                                                // method.  However, this meth feeds a boolean to the
                                                                // calc methods, which in-turn feeds the boolean to the
                                                                // runAppMenu to determine if we will cont the CalcApp
            case "n": case "no":
                return false;
            default:
                System.out.println("\n______________" +
                        "_____________\n");
                return true;                                    //   Will continue CalcApp if the user doesn't select
        }                                                       // no.  The user doesn't even need to select "yes"
    }


    // METHS: Calc App Operations
    private boolean addNum(){

        while (true) {                                          //   Loop will continue until we break out of it

            try {                                               //   Used a try statement block here because the user
                                                                // could input a string that cannot be translated into
                                                                // an int.  NOTE: this will not take floats!
                System.out.println("Provide first number");
                x = sn.nextInt();                               //   Vars established in the constructor
                System.out.println("Provide second number");
                y = sn.nextInt();
                answer = x + y;
                System.out.println("The sum of " + x + " and " + y + " is:  " + answer);
                break;
            }
            catch (InputMismatchException e) {                  //   Catches the exception when thrown when an int var
                                                                // is expecting to hold an integer but something else
                                                                // is given... which it can't handle
                sn.next();                                      //   THIS was AWESOME... from our textbook: keeps app
                                                                // from spiralling into an infinite loop
                System.out.println("You did not choose a number." +
                        "\nPlease try again");
            }
            finally {
                System.out.println("___________________________\n");
            }
        }

        return requestToContApp();                              //   returns the boolean response gathered from
                                                                // requestToContApp method
    }

    private boolean subNum(){                                   //   Meth is exactly the same as the addNum meth.  Only
                                                                // changes are some words and the operator
        while (true) {

            try {
                System.out.println("Provide first number");
                x = sn.nextInt();
                System.out.println("Provide second number");
                y = sn.nextInt();
                answer = x - y;
                System.out.println("The difference between " + x + " and " + y + " is:  " + answer);
                break;
            }
            catch (InputMismatchException e) {
                sn.next();
                System.out.println("You did not choose a number." +
                        "\nPlease try again");
            }
            finally {
                System.out.println("___________________________\n");
            }
        }

        return requestToContApp();
    }

    private boolean multiplyNum(){                              //   Meth is exactly the same as the addNum meth.  Only
                                                                // changes are some words and the operator
        while (true) {

            try {
                System.out.println("Provide first number");
                x = sn.nextInt();
                System.out.println("Provide second number");
                y = sn.nextInt();
                answer = x * y;
                System.out.println("The whole product of " + x + " multiplied by " + y + " is:  " + answer);
                break;
            }
            catch (InputMismatchException e) {
                sn.next();
                System.out.println("You did not choose a number." +
                        "\nPlease try again");
            }
            finally {
                System.out.println("___________________________\n");
            }
        }

        return requestToContApp();
    }

    private boolean divNum(){                               //   Meth is almost the same as the addNum meth.  Some
                                                            // changes are found in the wording and operator.  Also,
                                                            // another exception handling "catch" statement is given
                                                            // to manage the exception that occurs when a number is
                                                            // divided by zero
        while (true) {

            try {
                System.out.println("Provide first number");
                x = sn.nextInt();
                System.out.println("Provide second number");
                y = sn.nextInt();
                answer = x / y;
                System.out.println("The whole number dividend of " + x + " divided by " + y + " is:  " + answer);
                break;
            }
            catch (InputMismatchException e) {
                sn.next();
                System.out.println("You did not choose a number." +
                        "\nPlease try again");
            }
            catch (ArithmeticException e) {                 //   The additional exception handling catch statement
                sn.next();
                System.out.println("You cannot divide by 0." +
                        "\nPlease try again");
            }
            finally {
                System.out.println("___________________________\n");
            }
        }

        return requestToContApp();
    }
}
