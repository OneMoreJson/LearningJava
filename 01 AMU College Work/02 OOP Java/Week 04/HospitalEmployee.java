/*******************
 Name: Jason Cameron

 Date: 03 Oct 2021

 Notes: Completed for ENTD381 Summer 2021 Week 04

    This class will serve as the Super class for all Hospital Employees (HE).

 *******************/


public class HospitalEmployee {

    // Attributes
    String name;
    String shift;
    double annualPay;
    int stamina;
    int focus;
    boolean hired;

    // Constructor
    public HospitalEmployee(String name, String shift, double annualPay) {
        this.name = name;
        this.shift = shift;
        this.annualPay = annualPay;
        this.stamina = 100;                                     //   I decided to start all HE with 100 for both
        this.focus = 100;                                       // stamina and focus. Later we could add meths that
                                                                // reduce or increase both depending on the game
                                                                // mechanics
        this.hired = true;                                      //   All HE would start out employed.  However the
                                                                // game could have a mechanic where each might get
                                                                // too low on stamina or focus, causing them to make
                                                                // mistakes.  Then we could fire them, making this
                                                                // var "false."  It is the equivalent to dying in an
                                                                // RPG
    }

    public HospitalEmployee(String name, double annualPay) {    //   Built an overloaded constructor because some
        this.name = name;                                       // employees will always work a day shift
        this.annualPay = annualPay;
        this.shift = "Day";

    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }
    public void setShift(String shift) {
        this.shift = shift;
    }
    public void setAnnualPay(double annualPay) {
        this.annualPay = annualPay;
    }

    // Getters
    public String getName() {
        return name;
    }
    public String getShift() {
        return shift;
    }
    public double getAnnualPay() {
        return annualPay;
    }
    public int getStamina() {
        return stamina;
    }
    public int getFocus() {
        return focus;
    }

    // Meths
    public void greeting(){
        System.out.println("Hello, my name is " + this.name + ".");
    }

    public void work(){
        System.out.println("I work the " + this.shift + " shift.");
    }

    public void rest(){}
}
