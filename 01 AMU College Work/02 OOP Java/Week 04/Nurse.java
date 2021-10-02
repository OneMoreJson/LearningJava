/*******************
 Name: Jason Cameron

 Date: 03 Oct 2021

 Notes: Completed for ENTD381 Summer 2021 Week 04

     This class is a child class to the super.  Things I changed:
     1. Changed the greeting
     2. Gave another attribute (didn't end up using it)
     3. Provided a method to change the focus and stamina based on the shift

 *******************/

public class Nurse extends HospitalEmployee {

    // Attributes
    private int strengthLevel;

    // Constructor
    public Nurse(String name, String shift, double annualPay) {
        super(name, shift, annualPay);
    }

    // OR Meths
    @Override
    public void greeting() {
        System.out.println("Hello, my name is " + this.name + ".");
        System.out.println("\tI work the " + this.shift + " shift.");         //   This is actually in the super as the
                                                                            // work meth
    }

    // Meths
    public void work(String shift) {                                        //   I am overloading the super HE work meth
        switch (shift) {
            case "Day":
                this.focus = 100;
                this.stamina = 100;
                break;
            case "Swing":
                this.focus = 80;
                this.stamina = 70;
                break;
            case "Night":
                this.focus = 50;
                this.stamina = 45;
                break;
        }
    }




}
