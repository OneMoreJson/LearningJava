/*******************
 Name: Jason Cameron

 Date: 03 Oct 2021

 Notes: Completed for ENTD381 Summer 2021 Week 04

    This class is a child class to the super.  Things I changed:
    1. Gave the Dr. a specialty
    2. Change the greeting

 *******************/


public class Doctor extends HospitalEmployee {

    // Attributes
    private String specialty;

    // Constructor
    public Doctor(String name, double annualPay, String specialty) {
        super(name, annualPay);
        this.specialty = specialty;
    }

    // OR Meths
    @Override
    public void greeting() {
        System.out.println("Hello, my name is Dr. " +
                this.name + ", I specialize in " +
                this.specialty + ".");
    }
}
