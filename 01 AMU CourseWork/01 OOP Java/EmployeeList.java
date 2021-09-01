/*******************
 Name: Jason Cameron

 Date: 29 Aug 2021

 Notes: Week 08 Assignment for ENTD380 summer course
        - EmployeeList class simply creates the array of employee objects
          and provides a way to print all the data to the screen.
 *******************/

public class EmployeeList {                                     //   This is where using an array shows some
                                                                // limitations.  The array requires that we define
                                                                // how large it will be.  Since the assignment defined
                                                                // that we are to create an array with three employee
                                                                // objects, I chose to do this (hopefully) as simple
                                                                // as possible.  I am interested in seeing if this
                                                                // can be converted into a Linked List.

    private static Employee e001 = new Employee();              //   Also, each Employee object had to be created
    private static Employee e002 = new Employee();              // and assigned to each array index.  I tried to use a
    private static Employee e003 = new Employee();              // loop to auto create each emp object while also
                                                                // assigning it to the array's index points.  However,
                                                                // I received several errors explaining that the
                                                                // array indexes were null, so they could not be
                                                                // assigned

    public static Employee[] empList = new Employee[3];         //   Made public to use the array obj in the Main
                                                                // class.  This is why it's set outside the methods.
    // Methods
    public static Employee[] makeEmpList(){                     //   Combines all the Emp obj into an array

        empList[0] = e001;                                      //   Assigns each Emp Obj to each index
        empList[1] = e002;
        empList[2] = e003;

        e001.setAllEmpData();                                   //   Calls upon Employee object's setAllEmpData method
        System.out.println();                                   // to establish user input data for each attribute.
        e002.setAllEmpData();                                   // Extra line spacing for readability.
        System.out.println();
        e003.setAllEmpData();
        System.out.println();

        return empList;                                         //   Returns empList so we can use it in the
    }                                                           // PrintEmpList method below

    public static void printEmpList(Employee[] empList){        //   This method will print each employee information

        for (int i = 0; i < empList.length ; i++) {             //   The for loop runs for the length of the empList
                                                                // array
            empList[i].getAllEmpData();                         //   As the i var increase, the empList index's
                                                                // Employee object's getAllEmpData method prints
                                                                // each defined attribute
            System.out.println();                               //   Extra line provided for readibility
        }
    }




}
