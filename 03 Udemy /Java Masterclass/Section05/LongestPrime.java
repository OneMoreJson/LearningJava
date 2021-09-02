/*
NEED TO REVIEW THIS... I DID NOT REALLY KNOW WHICH WAY TO GO WITH THIS PROGRAM PROBLEM...

   Section 05, 14th Code Challenge.  We look for the get largest Prime.  

 */

public class LongestPrime {

    public static void main(String[] args) {

        System.out.println("Largest prime of 21 is:  " + getLargestPrime(21));
//        System.out.println();
//        System.out.println("Largest prime of 217 is:  " + getLargestPrime(217));
//        System.out.println();
//        System.out.println("Largest prime of 0 is:  " + getLargestPrime(0));
//        System.out.println();
//        System.out.println("Largest prime of 45 is:  " + getLargestPrime(45));
//        System.out.println();
//        System.out.println("Largest prime of -1 is:  " + getLargestPrime(-1));
//        System.out.println();
//        System.out.println("Largest prime of 271 is:  " + getLargestPrime(271));
//        System.out.println();
    }

    public static int getLargestPrime(int number) {

        if (number <= 1) return -1;

        int i;                                          //   This is cool.  They wanted to return i,
                                                        // and use it in the for loop.  That is why
                                                        // the var is initiated at the beginning
        int n = number;                                 // I think I could just leave this an number

        for (i = 2; i <= n; i++) {                      //   For loop counting up to number
            if (n % i == 0) {                           //   If remainder of num divided by i == 0
                n /= i;                                 // Num divided by i and made result
                i--;                                    // I is subtracted and made result
            }
        }

        return i;                                       //   Return i
    }
}
