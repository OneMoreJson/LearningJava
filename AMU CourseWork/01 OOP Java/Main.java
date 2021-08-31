/*******************
 Name: Jason Cameron

 Date: 29 Aug 2021

 Notes: Week 08 Assignment for ENTD380 summer course
        - Create an array of object displaying the data of 3 employee.
          Statement 1 is creating an array of Employee Emp to store
          the records of 3 employees.
        - This is the Main file where objects are built and processed
        - I broke the assignment down into a lot of smaller classes (obj)
          because I wanted to explore the interactions between objects and
          methods.  I hope this is ok. I also will attempt to incorporate
          this week's lesson on saving to a file.  However, I don't think
          I'll have something to submit (with that feature) before Sunday.
          I'm also exploring how I could use a Linked list, instead of
          an array.  That will definitely not be done by Sunday.
 *******************/


public class Main {

    public static void main(String[] args) {

        EmployeeList theList = new EmployeeList();          //   Creates an EmployeeList object
        theList.makeEmpList();                              //   Runs the makeEmpList from the EmployeeList class.
                                                            // This method will call on multiple other classes
                                                            // to complete this one method.
        theList.printEmpList(theList.empList);              //   Once the list is built, we can print it. This
                                                            // method is stored within the EmployeeList class.
                                                            // Interestingly, we needed to have the empList
                                                            // array set to public in order to call the data
                                                            // stored within it
    }
}
