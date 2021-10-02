/*******************
 Name: Jason Cameron

 Date: 03 Oct 2021

 Notes: Completed for ENTD381 Summer 2021 Week 04

     This class is a child class to the super.  Things I changed:
     1. Added a "number of coffe" attribute
     2. Changed the Greeting
     3. Provided a method to modify the stamina and focus

 *******************/

public class Security extends HospitalEmployee {

    // Attributes
    private int numberOfCoffees;

    // Constructor
    public Security(String name, String shift, double annualPay) {
        super(name, shift, annualPay);
    }

    // Setter
    public void setNumberOfCoffees(int numberOFMesses) {
        this.numberOfCoffees = numberOFMesses;
    }

    // Getter
    public int getNumberOfCoffees() {
        return numberOfCoffees;
    }

    // OR Meths
    @Override
    public void greeting() {
        System.out.println("Halt! Just kidding.");
        System.out.println("\tThe name is " + this.name +".");
        System.out.println("\tI'm the security guard for the " + this.shift + " shift.");
        System.out.println("\tDo you have any coffee?");
        System.out.println("\tI have only had " + this.numberOfCoffees + " cup(s) of coffee.");
        modStamina(this.numberOfCoffees);
        System.out.print("\tMy stamina is at " + this.stamina + ", while my focus is at " + this.focus + ".");
    }

    // Meths
    public void modStamina(int num) {                                        //   Totally unrealistic
        if (num < 1) {
            this.stamina = 1;
            this.focus = 1;
        } else if (num < 5) {
            this.stamina = 25;
            this.focus = 25;
        } else if (num < 8) {
            this.stamina = 50;
            this.focus = 50;
        } else if (num < 10) {
            this.stamina = 75;
            this.focus = 75;
        } else {
            this.stamina = 100;
            this.focus = 100;
        }
    }
}
