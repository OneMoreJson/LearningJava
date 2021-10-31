import java.io.*;

/**
 * This FileController controls the application with the following:
 *
 *      - Creates file or appends calculations to the Math_Results.csv file
 *      - Reading file
 *      - Closing file (Inside Each)
 *
 */

public class FileController {

    public void addToFile(int a, int b, int c,                  //   Parameters come from the operation methods (OM)
                          String operator) {                    // of the calcApp class.  The a, b, c, operator are
                                                                // num1, num2, numA (answer) and operator of calc

        File file = new File(                                   //   Sets up what the file's name will be.  This will
                "Math_Results.csv");                            // be created in the same folder as our app files

        try {                                                   //   Needed to tuck the three write methods within the
            PrintWriter out = new PrintWriter(                  // exception handling block.  This comes straight from
                    new BufferedWriter(                         // our reading: PW, BW, and FW nested inside each other
                            new FileWriter(
                                    file, true)));              //   The "true" allows us to add data to the file if
                                                                // it already exists

            out.write(a + " " + operator + " " +                //   Provides the format required for assignment
                    b + " = " + c + "\n");

            out.close();                                        //    Closes file

            System.out.println("Completed save to file " +      //   Added to show this portion was completed
                    "process...");

        } catch (IOException e) {
            System.out.println("You received a printStackTrace Exception");
            e.printStackTrace();
        }
    }

    public void readFile(){                                     //   Reads the csv file one line at a time and prints
                                                                // data to the console
        File f = new File("Math_Results.csv");
        try {
            BufferedReader in = new BufferedReader(new FileReader(f));
            System.out.println("\nThe following data is found in the Math_Result.csv file:  \n");

            String line = null;
            try {
                line = in.readLine();
            } catch (IOException e) {
                System.out.println("You received a printStackTrace Exception");
                e.printStackTrace();
            }
            while (line != null)
            {
                System.out.println(line);
                try {
                    line = in.readLine();
                } catch (IOException e) {
                    System.out.println("You received a printStackTrace Exception");
                    e.printStackTrace();
                }
            }
            System.out.println("\n-------------------------------------------------");
        } catch (FileNotFoundException e) {
            System.out.println("The file was not found...");
            System.out.println("\n-------------------------------------------------");
        }

    }
}
