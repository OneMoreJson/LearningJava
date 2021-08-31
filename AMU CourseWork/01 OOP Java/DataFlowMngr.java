import java.util.Scanner;

/*******************
 Name: Jason Cameron

 Date: 29 Aug 2021

 Notes: Week 08 Assignment for ENTD380 summer course
        - The DataFlowMngr class gathers data from user for the Employee object's
          attributes.  These methods are used within the Employee class.
 *******************/


public class DataFlowMngr {

    Scanner userIntInput = new Scanner(System.in);                  //   Getting numbers from user
    Scanner userStringInput = new Scanner(System.in);               //   Getting string from user
                                                                    //   Not sure if this needed, but I had problems
                                                                    // when I didn't distinguish between the two

    // Asking User for Data
    public int getEmployeeIDData() {
        System.out.println("Input Employee ID Number:  ");
        boolean hasNextInt = userIntInput.hasNextInt();             //   Used to detect if user provided a number.

        if (hasNextInt) {                                           //   If hasNextInt is true, then we apply that
            int empID = userIntInput.nextInt();                     // number to the empID int var and return it so
            return empID;                                           // it can be assigned to the employee object
        } else {
            System.out.println("You did not inter a correct number");
        }                                                           //   Otherwise, user is informed that the input
        return -1;                                                  // was invalid, and we supply a -1 to the field
    }

    public String getEmployeeNameData() {
        System.out.println("Input Employee Name:  ");
        String empName = userStringInput.nextLine();                //   When I tried to use one scanner, the app
        return empName;                                             // would skip the ask for the name and kept going
        }                                                           // to the next request (for age).  I think it
                                                                    // had to do with the scanner collecting int data
                                                                    // types and would collect strings... I need more
                                                                    // research on the subject.

    public int getEmployeeAgeData() {                               //   The rest of the methods are the same as the
        System.out.println("Input Employee Age:  ");                // employee id method...
        boolean hasNextInt = userIntInput.hasNextInt();

        if (hasNextInt) {
            int empAge = userIntInput.nextInt();
            return empAge;
        } else {
            System.out.println("You did not inter a correct number");
        }
        return -1;
    }

    public int getEmployeeSalaryData() {
        System.out.println("Input Employee Salary:  ");
        boolean hasNextInt = userIntInput.hasNextInt();

        if (hasNextInt) {
            int empSalary = userIntInput.nextInt();
            return empSalary;
        } else {
            System.out.println("You did not inter a correct number");
        }
        return -1;
    }

}
