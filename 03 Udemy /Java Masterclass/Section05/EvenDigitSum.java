/*
    
   Section 05, 6th Code Challenge

   This challenge requires us to "move" through the numbers (right to left), 
   adding only the even numbers found within the submitted number.  So an number
   such as 1 hundred fifty-two is really read from right to left, "2" then "5" 
   then "1."  Only the even numbers are added together and given as the result.  
   In this case, "2" would be the answer.  
 */

public class EvenDigitSum {                                 

    public static void main(String[] args) {                    //   Using the main to show the results of the           
                                                                // method.  
        System.out.println(getEvenDigitSum(123456789));
        System.out.println(getEvenDigitSum(252));
        System.out.println(getEvenDigitSum(-22));

    }

    public static int getEvenDigitSum(int number) {             //   Method to get the sum of all even numbers.  
                                                                // Takes a number parameter 

        int sum = 0;                                            //   Vars set up
        int n = 0;

        if (number < 0) {                                       //   First check to see if number will work.  If
        return -1;                                              // not, then return -1
        }

        while(number !=0) {                                     //   Taking the number, this loop continues as 
                                                                // as it has not been reduced to zero
            n = number % 10;                                    //   Places the remainder after number is divided
                                                                // by ten into n var
            number /= 10;                                       //   number is now devided (for real this time)
                                                                // with the results saved into number var.  This
                                                                // helps us keep reducing the number by ten, so
                                                                // we can move through all the numbers to get 
                                                                // to zero
                                                                
            if(n % 2 == 0) {                                    //   As we go through the while loop, this if
                sum += n;                                       // statement is active when the n var is even...
            }                                                   // (n divided by 2 results in zero remainder)...
        }                                                       // we add n to the sum var

        return sum;                                             //   Final Result
    }                                                           //   End of Function

}
