/*

Section 08, Challenge 03: Reverse Array Challenge:  Instructor

   - Write meth called reverse() with an int array as a parameter
   - The meth should not return any value.  The met is allowed to modify the array parameter
   - In main() test the reverse() method and print the array both reversed and non-reversed
   - To reverse the array, swap the elements, so that the element is swapped with the last element

 */

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] array = {1, 5, 3, 7, 11, 9, 15};
                                                    //   I keep forgetting we can use this built in meth!!!
        System.out.println("Array = " + Arrays.toString(array));

        reverse(array);

        System.out.println("Reversed Array = " + Arrays.toString(array));

    }

    private static void reverse(int[] array) {      //   This solution provided by the instructor is better, but
                                                    // covers things not previously talked about... Rather, its another
                                                    // way of breaking down the problem

        int maxIndex = array.length - 1;            //   We are setting this maxIndex var to the length minus one
        int halfLength = array.length / 2;          //   Setting a halfLength var to the halfway point of the array

        for (int i = 0; i < halfLength; i++) {      //   Using a for loop to move data through the array.  This cont
                                                    // throughout the array, swapping data with its mirror index until
                                                    // i reaches the halfLength of the array.  Note: if we are an odd
                                                    // length array, this still works as the middle index data doesn't
                                                    // need to swap with anything.
            int temp = array[i];                    //   Setting a temp var to hold data so we can swap data between
                                                    // indexes.  First we move the data from the first position to the
                                                    // temp var
            array[i] = array[maxIndex - i];         //   First place is now filled with the last place's data
            array[maxIndex - i] = temp;             //   Last place is now filled with the data from the temp var
                                                    // (which held the first place's data)
        }
    }


}
