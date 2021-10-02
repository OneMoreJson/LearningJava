/*******************
 Name: Jason Cameron

 Date: 03 Oct 2021

 Notes: Completed for ENTD381 Summer 2021 Week 04

     This class is a child class to the super.  Things I changed:
     1. Added a "number of messes" attribute
     2. Changed the Greeting
     3. Provided a method to modify the stamina

 *******************/

public class Janitor extends HospitalEmployee {

    // Attributes
    public int numberOFMesses;

    // Constructor
    public Janitor(String name, String shift, double annualPay) {
        super(name, shift, annualPay);
    }

    // Setter
    public void setNumberOFMesses(int numberOFMesses) {
        this.numberOFMesses = numberOFMesses;
    }

    // Getter
    public int getNumberOFMesses() {
        return numberOFMesses;
    }

    // OR Meths
    @Override
    public void greeting() {
        System.out.println("Hey.  The name is " + this.name + ".");
        System.out.println("\tI'm the janitor.");
        System.out.println("\tIt would be great if you cleaned up your own messes.");
        System.out.println("\tCurrently, I have " + this.numberOFMesses + " messes to deal with.");
        work(this.numberOFMesses);
        System.out.print("\tMy stamina is at: " + this.stamina);
    }

    // Meths
    public void work(int num) {                                        //   I am overloading the super HE work meth
        if (num < 10) {
            this.stamina = 100;
        } else if (num < 30) {
            this.stamina = 70;
        } else if (num < 50) {
            this.stamina = 40;
        } else if (num < 70) {
            this.stamina = 20;
        } else {
            this.stamina = 0;
        }
    }
}
