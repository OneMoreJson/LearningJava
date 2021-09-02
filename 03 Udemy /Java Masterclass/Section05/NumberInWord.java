/*

   Section 05, 1st Code Challlenge.  

   This is a simple function that takes an integer and returns the 
   string equivalent.  To do this, we use the switch case statement.
   I can see how the swtich case is incredibly useful. 


*/

public class NumberInWord {

    public static void main(String[] args) {

        int x = 9;
        printNumberInWord(x);

    }

    public static void printNumberInWord(int number) {

        switch (number) {
            case 0:
                System.out.println("ZERO");
                break;
            case 1:
                System.out.println("ONE");
                break;
            case 2:
                System.out.println("TWO");
                break;
            case 3:
                System.out.println("THREE");
                break;
            case 4:
                System.out.println("FOUR");
                break;
            case 5:
                System.out.println("FIVE");
                break;
            case 6:
                System.out.println("SIX");
                break;
            case 7:
                System.out.println("SEVEN");
                break;
            case 8:
                System.out.println("EIGHT");
                break;
            case 9:
                System.out.println("NINE");
                break;
            default:
                System.out.println("OTHER");
                break;
        }
    }
}
