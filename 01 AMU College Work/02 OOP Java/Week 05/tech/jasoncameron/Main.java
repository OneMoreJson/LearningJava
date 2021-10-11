/*******************
 Name: Jason Cameron

 Date: 10 Oct 2021

 Notes: Completed for ENTD381 Summer 2021 Week 05

 Note: Provide code examples to demonstrate your understanding of package,
       abstract and interface.  These files were created because the instructions
       explain that source code should be provided within a zip file when submitted
       along with a Word Doc's copy and pasted example code

 Note: My plan.  Create a package that contains one interface and one abstract class.
       Within the main folder, I will create a one class that uses each from the
       package.  This means each will import the package into the class.  Finally,
       I will have the main.java file create objects from the two classes, performing
       a print statement from each object.

 *******************/

package tech.jasoncameron;                      //  The package is constructed "tech.JasonCameron" after
                                                // my website


public class Main {

    public static void main(String[] args) {

        // Objects
        Hal hal = new Hal("Hal");
        Dave dave = new Dave("Dave");

        // Execute
        dave.accessWindow(hal);
        dave.readWindow(hal);
        dave.inputRequestToWindow(hal);
        dave.closeWindow(hal);



    }


}
