import java.util.InputMismatchException;
import java.util.Scanner;
/**
 * This CalcApp Meth has the following:
 *
 *      - Calc Operations (with try catch on division by zero)
 *      - Continue Request (Return to menu query)
 *      - Save to File query
 *      - Integer check
 *
 */

public class CalcApp {                                          //   Same as in Week 6's CalcApp assignment.  Revised
                                                                // some code to make things cleaner.  Added Query to
    // SCANNERS                                                 // ask user if they want to save to file.  This method
    static Scanner ss = new Scanner(System.in);                 // is used after each operation method
    static Scanner sn = new Scanner(System.in);

    // Instantiate CalcApp
    static FileController fileController = new FileController();

    // ATTRIBUTES
    private int answer;
    private int x;
    private int y;


    // CONSTRUCTOR
    public CalcApp() {
        this.answer = 0;
        this.x = 0;
        this.y = 0;
    }

    // METHS: Calc Operations
    public boolean addNum(){

        System.out.println("Provide first number");
        this.x = testForInt();
        System.out.println("Provide second number");
        this.y = testForInt();
        this.answer = x + y;
        System.out.println(x + " + " + y + " = " + answer);
        System.out.println("-------------------------------------------------\n");

        saveToFileQuery(this.x, this.y, this.answer, "+");                             // <-- 2 used for TEST
        return requestToContApp();
    }

    public boolean subNum(){

        System.out.println("Provide first number");
        x = testForInt();
        System.out.println("Provide second number");
        y = testForInt();
        answer = x - y;
        System.out.println(x + " - " + y + " = " + answer);
        System.out.println("-------------------------------------------------\n");

        saveToFileQuery(this.x, this.y, this.answer, "-");
        return requestToContApp();
    }

    public boolean multiplyNum(){

        System.out.println("Provide first number");
        x = testForInt();
        System.out.println("Provide second number");
        y = testForInt();
        answer = x * y;
        System.out.println(+ x + " * " + y + " = " + answer);
        System.out.println("-------------------------------------------------\n");

        saveToFileQuery(this.x, this.y, this.answer, "*");
        return requestToContApp();

    }

    public boolean divNum(){
        while (true) {

            try {
                System.out.println("Provide first number");
                x = testForInt();
                System.out.println("Provide second number");
                y = testForInt();
                answer = x / y;
                System.out.println(x + " / " + y + " = " + answer);
                break;
            }
            catch (ArithmeticException e) {
                sn.next();
                System.out.println("You cannot divide by 0." +
                        "\nPlease try again");
            }
            finally {
                System.out.println("-------------------------------------------------\n");
            }
        }

        saveToFileQuery(this.x, this.y, this.answer, "/");
        return requestToContApp();
    }

    // METHS: App Functions
    private static boolean requestToContApp(){
        String userResponse;
        System.out.println("Would you like to return to the MENU ?  Y/N");
        userResponse = ss.nextLine();

        switch (userResponse.toLowerCase()) {
            case "n": case "no":
                return false;
            default:
                System.out.println("\n-------------------------------------------------\n");
                return true;
        }
    }

    private static void saveToFileQuery(int num1, int num2,     //   Created to fulfill assignment requirements.  Meth
                                        int numA, String op){   // is placed in each operation method (OM).  Parameters
                                                                // are then provided by the OM.   Otherwise, this is
                                                                // a simple menu query that calls on the FileController
                                                                // "addToFile" meth if user selects "yes"
        String userResponse;
        System.out.println("Would you like to SAVE your calculation to a file?  Y/N");
        userResponse = ss.nextLine();

        switch (userResponse.toLowerCase()){
            case "y": case "yes":
                fileController.addToFile(num1, num2, numA, op); //   Parameters gathered from the OM
                break;
            case "n": case "no":
                System.out.println("You declined to Save your calculation.");
                break;
            case "":
                System.out.println("Nothing given.  We will continue...");
                break;
            default:
                    System.out.println("-------------------------------------------------\n");
            }
    }

    private int testForInt(){                                   //   Added this after learning about it in Week 7.
        int num;                                                // Used in multiple areas to "simplify" operation
        while (true){                                           // methods
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
