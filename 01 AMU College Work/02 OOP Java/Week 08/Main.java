/**
 Name: Jason Cameron

 Date: 31 Oct 2021

 Assignment: Completed for ENTD381 Summer 2021 Week 08

 Note: The following were the set criteria
    - Create a class that will open a text file for
      reading and writing.                                              <-- FileController
    -- Modify the prior program and ask the user
       "Do you want to save the results (Y/N)?"                         <-- Done after Calc
    - If the answer is yes then ave the results into a
      file name "Math_Results.csv" in this format:
            X + Y = Z and so on.
    - Ask the user do you want to review the results (Y/N)              <-- Done in the AppController Menu
      -- If the answer is yes, then display the content of
         "Math_Results.csv"

 */

public class Main {

    //  Executes the Application
    public static void main(String[] args) {

        AppController appController = new AppController();
        appController.startCalcApp();

    }
}
