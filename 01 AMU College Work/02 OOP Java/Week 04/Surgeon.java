/*******************
 Name: Jason Cameron

 Date: 03 Oct 2021

 Notes: Completed for ENTD381 Summer 2021 Week 04

     This class is a child class to the super.  Things I changed:
     1. Added a specialty
     2. Added a phone number
     3. Changed the greeting

 *******************/

public class Surgeon extends HospitalEmployee {

    // Attributes
    private String specialty;
    private String phoneNumber;

    // Constructor
    public Surgeon(String name, double annualPay, String specialty, String phoneNumber) {
        super(name, annualPay);
        this.specialty = specialty + " Surgery";
        this.phoneNumber = phoneNumber;
    }

    // OR Meths
    @Override
    public void greeting() {
        System.out.println("Hi, my name is Dr. " +
                this.name + ". \n\tI specialize in " +
                this.specialty + ".");
        System.out.println("\tIf you want to change something, " +
                "call me at " + phoneNumber + ".");
    }
}













