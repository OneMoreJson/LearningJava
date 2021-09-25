/*******************
 Name: Jason Cameron

 Date: 26 Sep 2021

 Notes: Completed for ENTD381 Summer 2021 Week 03

    Design and implement an application that reads an integer value and prints
    the sum of all even integers between 2 and the input value, inclusive.
    Print an error message if the input value is less than 2. Prompt accordingly.

    NOTE: This is the main java file where we call the Application class that will
    perform the integer calculations

 *******************/

public class Main {

    public static void main(String[] args) {

        Application app = new Application();                //   First we instantiate a new Application obj with the
                                                            // variable name "app" (providing it a ref towards a place
                                                            // in memory.
        app.run();                                          //   The class's run meth is called and the instructions
                                                            // are completed
        System.out.println("Application Completed");        //   Provided this print statement because it is "jarring"
                                                            // when the app completes without any notice
    }
}
