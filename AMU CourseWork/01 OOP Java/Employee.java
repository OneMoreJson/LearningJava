/*******************
 Name: Jason Cameron

 Date: 29 Aug 2021

 Notes: Week 08 Assignment for ENTD380 summer course
        - This the Employee class where we define what an Employee object
          consists of (attributes and methods).  It is the primary class
          in which everything is built off of.
 *******************/

public class Employee {

    private int empID;                                      //   I like to start with all the required vars,
    private String empName;                                 // set to private.  The only way we can access
    private int empAge;                                     // their data is through the Getter, Setter methods
    private int empSalary;                                  // below.

    private DataFlowMngr manageEmpData = new DataFlowMngr();//   Created a DataFlowMngr object to get user input
                                                            // for the employee attributes.  I think I could include
                                                            // Scanner code inside this class, but I had thought I
                                                            // might use the DataFlowMngr to control where and how
                                                            // the employee information was stored.

    // Constructor                                          //   Overloaded constructors so I could create an
    public Employee(){}                                     // Employee obj with empty attributes if I needed to
    public Employee(int empID, String empName, int empAge, int empSalary) {
        this.empID = empID;
        this.empName = empName;
        this.empAge = empAge;
        this.empSalary = empSalary;
    }


    // Getters                                              //   Help to get the private Employee attribute data
    public int getEmpID() {
        return empID;
    }
    public String getEmpName() {
        return empName;
    }
    public int getEmpAge() {
        return empAge;
    }
    public int getEmpSalary() {
        return empSalary;
    }


    // Setters                                                  //   Included overloaded Setters in case I
                                                                // want to "hard code" emp data. Otherwise, these
                                                                // empty Setters use the DataFlowMngr's
                                                                // getEmployeeIDData methods, which ask the user for
                                                                // the data
    public void setEmpID() {
        this.empID = manageEmpData.getEmployeeIDData();
    }
    public void setEmpID(int empID) {
        this.empID = empID;
    }
    public void setEmpName() {
        this.empName = manageEmpData.getEmployeeNameData();
    }
    public void setEmpName(String empName) {
        this.empName = empName;
    }
    public void setEmpAge() {
        this.empAge = manageEmpData.getEmployeeAgeData();
    }
    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }
    public void setEmpSalary() {
        this.empSalary = manageEmpData.getEmployeeSalaryData();
    }
    public void setEmpSalary(int empSalary) {
        this.empSalary = empSalary;
    }

    // Others                                                   //   Primarily, these combine the Get and Set methods
                                                                // from above
    public void setAllEmpData(){
        setEmpID();
        setEmpName();
        setEmpAge();
        setEmpSalary();
    }
    public void getAllEmpData(){                                //   This method required me to change some Employee
                                                                // data types into a string.  There might have been
                                                                // an easier way, but I figure keeping the original
                                                                // data types as ints would help if perform
                                                                // calculations later.
        String[] allEmpData = new String[] { Integer.toString(getEmpID()),
                getEmpName(),
                Integer.toString(getEmpAge()),
                Integer.toString(getEmpSalary())
        };

        for (int i = 0; i < allEmpData.length; i++) {           //   Again, the data types were converted to strings
            System.out.print(allEmpData[i] + "  ");             // because it was used in this for loop to "get" ALL
        }                                                       // Employee data.  This is used later in the
    }                                                           // EmployeeList class


}
