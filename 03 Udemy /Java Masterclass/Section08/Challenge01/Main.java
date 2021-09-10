/*

Section 08 Challenge 01: Arrays

   - Create a program using arrays that sorts a list of int in descending order
   -- Descending order is the highest value to lowest
   - Set up the program so that the numbers to sort are read in from the keyboard
   - Implement the following meth : getIntegers, printArray, and sortIntegers
   - getIntegers returns an array of entered integers from keyboard
   - printArray prints out the contents of the array
   - sortIntegers should sort the array and return a new array containing the sort numbers

 */

import java.util.Scanner;

public class Main {

    // Attributes
    private static Scanner getInts = new Scanner(System.in);    //   Set up the input scanner

    // Execution
    public static void main(String[] args) {

        int x = setNumOfIndexes();                              //   Asking user for the number of indexes.  Loads into
                                                                // a local var "x"
        int[] xArray = getIntegers(x);                          //   Asking user for all the numbers to be put in the
                                                                // array "xArray"
        int[] sortArray = sortIntegers(xArray);                 //   Sorts xArray numbers and places new order into
                                                                // array "sortArray"
        printArray(sortArray);                                  //   Prints the sortArray results

    }

    // Meths
    public static int[] getIntegers(int num) {                  //   Parameter "num" provides flexible array lengths
        System.out.println("Enter " + num + " integer values below. \r");
        int[] values = new int[num];                            //   Sets new array according to parameter

        for (int i = 0; i < values.length; i++) {               //   For loop inputs users numbers into each index
            values[i] = getInts.nextInt();                      //   Scanner "getInst" is called to get user inputs
        }
        return values;
    }

    public static void printArray(int[] intArray) {             //   Simple print meth that runs a For loop through
        for (int i = 0; i < intArray.length; i++) {             // each index position and prints it onto screen
            System.out.println(intArray[i]);
        }

    }

    public static int[] sortIntegers(int[] intArray) {              //   Meth used to sort from high to low.
        int[] sortedArray = new int[intArray.length];               //   Placeholder array... nice using
                                                                    // array.length

        for (int i = 0; i < intArray.length; i++) {                 //   Duplicates data from one array to another
            sortedArray[i] = intArray[i];
        }

        boolean flag = true;
        int temp;

        while (flag) {
            flag = false;

            for (int i = 0; i < sortedArray.length - 1; i++) {      //   Creating a shuffle of data in the indexes.
                                                                    // We make the For loop run for one less than the
                                                                    // length because all numbers should be in their
                                                                    // place. We would also get an error if we check
                                                                    // last place data against an index outside the
                                                                    // array.
                if (sortedArray[i] < sortedArray[i + 1]) {          //   If first place is less than next place, then
                    temp = sortedArray[i];                          // first place is put in temp var.  Then we place
                    sortedArray[i] = sortedArray[i + 1];            // second place in data in first place.  Now temp
                    sortedArray[i +1] = temp;                       // var dat is in the second place to be checked
                    flag = true;                                    // again later since we put the flag back to true.
                }
            }
        }

    /*                  Playing the shuffle data game below...

                        2, 6, 9, 3, 10                  <- i starts in the 0 index.......
                                                           2 is less than 6 so 2 is put in temp, 6 is in i, and 2 is
                                                           put in the place where 6 had been resulting in:
                                                           6, 2, 9, 3, 10
                        6, 2, 9, 3, 10                  <- increased i to next index.......
                                                           2 is less than 9 so 2 is put in temp, 9 is in i, and 2 is
                                                           put in the place where 9 had been resulting in:
                                                           6, 9, 2, 3, 10
                        6, 9, 2, 3, 10                  <- increased i to next index.......
                                                           2 is less than 3 so 2 is put in temp, 3 is in i, and 2 is
                                                           put in the place where 3 had been resulting in:
                                                           6, 9, 3, 2, 10
                        6, 9, 3, 2, 10                  <- increased i to next index.......
                                                           2 is less than 10 so 2 is put in temp, 10 is in i, and 2 is
                                                           put in the place where 10 had been resulting in:
                                                           6, 9, 3, 10, 2
                        6, 9, 3, 10, 2                  <- We have reached the end of indexes.  Flag is still true, so
                                                           we start the while loop over again with the new array
                                                           sorted. We now ask the same quest, is first place less than
                                                           second? 6 is less than 9 so 6 is placed in tem, 9 is placed
                                                           in first, and 6 is placed where 9 had been, resulting in:
                                                           9, 6, 3, 10, 2
                        9, 6, 3, 10, 2                  <- increased i to next index.......
                                                           6 is not less than 3, so we increase i to next index.......
                                                           3 is less than 10 so 3 is put in temp, 10 is in i, and 3 is
                                                           put in the place where 10 had been resulting in:
                                                           6, 9, 10, 3, 2
                        6, 9, 10, 3, 2                  <- We continue through the process until i has reached its end.
                                                           Note: because we did not move anything, we never set the
                                                           flag back to true, so now we can exit the while loop!

    */


        return sortedArray;
    }

    public static int setNumOfIndexes(){                        //   I added this meth to ask the user how many numbers
                                                                // should be in the array.  This lets us be more
                                                                // flexible with the array's length.
        System.out.println("Enter the amount of numbers you want to list:  \r");
        int numOfIndexes = getInts.nextInt();                   //   Reused the getInts scanner obj for this meth
        return numOfIndexes;
    }


}
