/*

Section 08, Challenge 02: Minimum Element Challenge

   - Write a method called readIntegers() with a parameter called count that represents
     how many integers the user needs to enter
   - the method needs to read from the console until all the numbers are entered, and
     then return an array containing the numbers entered
   - Write a method findMin() with the arrays as a parameter.  The method needs to
     return the minimum value in the array
   - In the main() meth read the count from the console and call the meth readIntegers()
     with the count parameter
   - Then call the findMin() meth passing the array returned from the call to the
     readIntegers() meth
   - Finally, print the minimum element in the array

 */


import java.util.Scanner;

public class Main {

    // Scanner
    private static Scanner getInt = new Scanner(System.in);     //   Used to get user input

    // Ex
    public static void main(String[] args) {

        int[] theArray = readIntegers(5);
        System.out.println("The minimum number digit in theArray is:  " + findMin(theArray));

    }

    // Meths
    public static int[] readIntegers(int count) {               //   Meth to get User inputs
        int[] array = new int[count];                           //   Build int array
        System.out.println("Please enter " + count + " numbers for the array:  \r");

        for (int i = 0; i < array.length; i++) {                //   Setting user inputs for each index of the
            array[i] = getInt.nextInt();                        // array using the scanner
        }

        return array;                                           //   Returning the array
    }

    public static int findMin(int[] array) {                    //   Meth to find minimum number in array
        int minNum = array[0];                                  //   Setting minNum to the first index so we can
                                                                // compare it to the rest of indexes
        for (int i = 1; i < array.length ; i++) {               //   For loop lets us travers array and compare
            if (minNum > array[i]) minNum = array[i];           // current minNum with each index number.  If
        }                                                       // current minNum is found to be greater than
                                                                // the current index number, then we set the
                                                                // current index number to minNum and continue
                                                                // through the loop.  If it isn't, then we ignore
                                                                // the change and progress through the array
                                                                // continuing to check
        return minNum;                                          //   Final minNum is returned
    }

}
