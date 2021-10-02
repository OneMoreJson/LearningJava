import java.util.ArrayList;

/*******************
 Name: Jason Cameron

 Date: 03 Oct 2021

 Notes: Completed for ENTD381 Summer 2021 Week 04

     This class is a child class to the super.  Things I changed:
     1. Gave the admin an Array List where we can fill in a list of credentials (certs)
     2. Change the greeting
     3. Added method to add certs to array list
     4. Added a way to list all the certs... placed in greeting because I imagine Col Mustard
        always telling everyone this credentials

 *******************/

public class Admin extends HospitalEmployee {

    // Attributes
    private ArrayList<String> certifications;                       //   Every admin needs credentials

    // Constructor
    public Admin(String name, double annualPay) {                   //   Note we use the second constructor!
        super(name, annualPay);
        this.shift = "Day";                                         //   Best part about being an admin... No shifts
        this.certifications = new ArrayList<>(10);
    }

    // OR Meths
    @Override
    public void greeting() {
        System.out.println("Welcome to our Hospital.");
        System.out.println("\tMy name is " + this.name +
                " and I am an administrator for the hospital.");
        listCerts(this.certifications);
    }

    // Meths
    public void addCerts(String cert){                              //   I know that we can end up with an exception
        certifications.add(cert);                                   // if we go over the ten cert array limit
    }

    public void listCerts(ArrayList<String> theCertList) {
        System.out.println("\tNot to brag, but here are my credentials:  ");
        for (int i = 0; i < theCertList.size(); i++) {
            System.out.println("\t\t" + (i+1) + ". " + theCertList.get(i));
        }
    }

}
