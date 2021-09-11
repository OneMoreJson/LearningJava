/*

Section 08, Challenge 03: Reverse Array Challenge

   - Write meth called reverse() with an int array as a parameter
   - The meth should not return any value.  The met is allowed to modify the array parameter
   - In main() test the reverse() method and print the array both reversed and non-reversed
   - To reverse the array, swap the elements, so that the element is swapped with the last element

 */

public class Main {

    // The Array Used
    private static int[] theArray = {1, 2, 3, 4, 5};

    // Ex
    public static void main(String[] args) {

        printReverse(theArray);                         //   Doesn't actually change the array in memory
        System.out.println();
        printArray(theArray);                           //   Original array remains the same as seen through print
        System.out.println();
        reverse(theArray);                              //   Reverses the array in memory
        printArray(theArray);                           //   Shows the actually reversed in memory (same print meth)
        System.out.println();
        reverse(theArray);                              //   Reversed the array back to normal
        printArray(theArray);                           //   Prints to show change
        System.out.println();

    }

    // Meth
    public static void printReverse(int[] array) {      //   Decided to first print a reverse (not change array)
        for (int i = array.length - 1; i > -1; i--) {   //   For loop counts down the array, providing data in reverse
            System.out.print(array[i]+ " ");            //   Kept on one line because this could get very long...
        }
    }

    public static void reverse(int[] array) {           //   From the reverse print ex, I have an idea how to reverse
        int[] tempArray = new int[array.length];        //   First, we need a place to store the original array data

        for (int i = 0; i < array.length; i++) {        //   For loop is used to store data within tempArray
            tempArray[i] = array[i];
        }

        int x = array.length-1;                         //   Set a countdown int for tempArray.  Note this needs to be
                                                        // set to the array's length minus one because if you leave it
                                                        // to the length number, you will be "out of bounds" in the
                                                        // array
        for (int i = 0; i < array.length; i++) {        //   For loop is used to count up theArray while the x var lets
            theArray[i] = tempArray[x];                 // us count down the tempArray, giving us the ability to store
            x--;                                        // data into the original array (theArray).  The x var is
        }                                               // reduced each pass of the for loop
    }
    
    public static void printArray(int[] array) {        //   Simple for loop (we've used countless times to print an
        for (int i = 0; i < array.length; i++) {        // array by now). I changed the println to just print so we
            System.out.print(array[i] + " ");           // save space on screen
        }
    }
}
