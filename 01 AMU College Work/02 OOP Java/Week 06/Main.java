/**
 Name: Jason Cameron

 Date: 17 Oct 2021

 1 Note: Completed for ENTD381 Summer 2021 Week 06

    - Create a class to include try catch finally block. You need to explain where you
      implemented the try catch block and why? (Hint you can implement the try catch
      on the test program level, super class level or the sub class level).
    - Create a test program to demonstrate your work (Hint; add text to numbers
      and/or divide by zero)

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


public class Main {

    public static void main(String[] args) {

        CalcApp calcApp = new CalcApp();
        calcApp.startCalcApp();

    }
}













