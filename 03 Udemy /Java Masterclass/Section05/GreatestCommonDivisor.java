/*

   From Section 05, the 9th Code Challenge

   As the title explains, this challenge requires us to find the greatest
   common divisor between two numbers.  What I found fun about this project
   was the fact that we break the problem down into first finding a clean
   disible number (no remainders) for the first number.  When we have one, 
   we check run through all the divisible numbers for the second number.  If
   the two numbers match, we have our answer.  If we do not find a match, we
   go back to the first number and continue the algorythm untill we finally 
   have a match.   

*/



public class GreatestCommonDivisor {

    public static void main(String[] args) {                        //   Running the method to check results

        System.out.println(getGreatestCommonDivisor(25,15));
        System.out.println(getGreatestCommonDivisor(12,30));
        System.out.println(getGreatestCommonDivisor(9,18));
        System.out.println(getGreatestCommonDivisor(81,153));

    }

    public static int getGreatestCommonDivisor(int x, int y) {

        if(x < 10 || y < 10) return -1;                             //   First we check the submitted numbers 
                                                                    // are less than 10.  If so, return -1 to 
                                                                    // show error

        int tx = x;                                                 //   vars set as tx & ty... "t" for "temp"
        int ty = y;

        while (tx != 0) {                                           //   Begin with while loop to check tx first.
                                                                    // As long as it isn't zero, we continue...
            int xDivNum;                                            //   Create var to cary divided number of x 
            ty = y;                                                 //   Seting ty with y's data

            if (x % tx == 0) {                                      //   Checking if x divided by tx remainder 
                                                                    // is zero.  If it is, we set the xDivNum var
                xDivNum = tx;                                       // to tx.  Then we subtract tx by one.
                tx--;

                while (ty != 0) {                                   //   Then we move into another while loop,
                                                                    // still in the first if statement.  This 
                                                                    // loop continues as lont as ty is not zero.
                    int yDivNum;                                    //   set up the divided number of y

                    if (y % ty == 0) {                              //   This if statement does the as the one
                        yDivNum = ty;                               // for the x number
                        ty--;

                        if (xDivNum == yDivNum){                    //   Third deep, this if statement takes the 
                            return xDivNum;                         // two found numbers and checks to see if we
                                                                    // found the greatest common divisor.  If we
                                                                    // have found it we don't need to continue.
                        }
                    } else {                                        //   Still in the "y while loop" we reduce y
                        ty--;                                       // by one
                    }

                }
            } else {                                                //   Still in the "x while loop" we reduce x
                tx--;                                               // by one
            }

        }
        return -1;                                                  
    }                                                               //   getGreatestCommonDivisor END
}
