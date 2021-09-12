/*
   To me this is the most basic element of the project.  We create a class which is used
   to build multiple objects with a name and phone number.  I can see that we could add
   addresses and other attributes within the object to make it extremely robust.  Within
   the class are basic methods that get and set data within the obj while keeping the
   actual attributes private.  You must go through the public methods to access the
   object's attributes.  Interestingly, the setters are private but getters are able to
   be public.  I need to research why this is the case...

 */

import java.util.Scanner;

public class Contact {

    // Scanner
    private static Scanner getUserInput = new Scanner(System.in);           //   Used to get user input when setting
                                                                            // obj data.  I was able to keep this
                                                                            // private within the class/obj
    // Attributes
    private String name;
    private String phoneNumber;

    // Constructor
    public Contact() {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    // Setters
    private void setName(String name) {
        this.name = name;
    }
    private void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // Getters
    public String getName() {
        return name;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }

    // Meths
    public void setContactInfo() {
        System.out.println("Please provide Contact Name:  \r");
        setName(getUserInput.nextLine());
        System.out.println("Please Provide Contact Phone Number:  \r");
        setPhoneNumber(getUserInput.nextLine());
    }

    public void printContactInfo() {
        System.out.print(getName() + " : " + getPhoneNumber() + "\n");
    }
}
