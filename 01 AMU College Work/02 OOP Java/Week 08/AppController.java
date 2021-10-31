import java.util.Scanner;

/**
 * This Class controls the application (Works like a Menu)
 *
 *      - Menu (i.e. this is the class the execution file will call)
 *      - Calls CalcApp to perform operational functions
 *          + 1) Add
 *          + 2) Subtract
 *          + 3) Multiply
 *          + 4) Divide
 *      - Calls FileController to open, read, and close file
 *        (NOTE: Query to write to file is done after calc is completed)
 *
 */

public class AppController {

    // SCANNERS
    static Scanner ss = new Scanner(System.in);                 //   Probably not needed, but I like to try and
    static Scanner sn = new Scanner(System.in);                 // separate my int & string responses

    // Instantiate CalcApp
    CalcApp calcApp = new CalcApp();
    FileController fileController = new FileController();

    public void startCalcApp(){                                 //   Intro
        System.out.println("Welcome to our Calculator App! " +
                "\nPlease follow the instructions as our options " +
                "have changed. \n\n" +
                "-------------------------------------------------");
                runAppMenu();
    }

    // Menu
    private void runAppMenu() {                                 //   Same as in Week 6's CalcApp assignment.  Added
        String selection;                                       // File Read options to the menu
        boolean continueApp = true;

        while(continueApp) {
            System.out.println("Please select the following " +
                "operation you want to run:  " +
                "\n\t1.  Addition" +
                "\n\t2.  Subtraction" +
                "\n\t3.  Multiplication" +
                "\n\t4.  Division" +
                "\n\t5.  Read Math Results File" +
                "\n\t6.  End");

            selection = ss.nextLine();

            switch (selection.toLowerCase()) {
                case "1": case "a": case "add": case "addition":
                        continueApp = calcApp.addNum();
                    break;
                    case "2": case "s": case "sub": case "subtract": case "subtraction":
                        continueApp = calcApp.subNum();
                    break;
                    case "3": case "m": case "multiply": case "multiplication":
                        continueApp = calcApp.multiplyNum();
                    break;
                    case "4": case "d": case "divide": case "division":
                        continueApp = calcApp.divNum();
                    break;
                    case "5":
                        case "r": case "read": case "read file": case "read math results file":
                    fileController.readFile();
                    break;
                    case "6": case "e": case "end": case "exit":
                        continueApp = false;
                    break;
                default:
                    System.out.println("Invalid entry.  Please try again..." +
                            "\n-------------------------------------------------\n");
            }
        }
        System.out.println("Thank you for using Calc App." +
                "\nApplication is closing....");
    }
}
