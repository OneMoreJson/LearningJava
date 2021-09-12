/*
   This class creates the Array List in which all contact objects are placed within.
   While the contact class provides the getters and setters, the contacts list
   includes methods that call on those functions to either add, mod or remove
   individual contact objects, or print all contact objects at once.  We could
   include an itemization of what type of contact is placed into the list by
   providing an if statement: "if you choose 1, then the contact object will be
   a personalContact; or if you choose 2, then the contact object will be a
   workContact; etc."

 */

import java.util.ArrayList;
import java.util.Scanner;

public class Contacts {

    // Scanner
    private static Scanner getUserInput = new Scanner(System.in);

    // Must Create the ArrayList to store Contact Obj
    private ArrayList<Contact> contacts = new ArrayList<>();

    public void addToContacts() {
        Contact personalContact = new Contact();        //   Needs to make a contact obj to place within the contacts
                                                        // ArrayList.  We can later change this to types of "type" of
                                                        // contact such as personal, work, family, etc.
        personalContact.setContactInfo();               //   Using the contact obj methods to enter data of contact.
                                                        // NOTE: this is information for the contact.  It has NOT been
                                                        // entered into the array list yet.
        contacts.add(personalContact);                  //   This is needed to place inside the array list.  The "add"
                                                        // function is a builtin method used within ArrayList class
    }

    public void printAllContacts() {                    //   Uses contact meth of obj within to print all info
        System.out.println("You have " + contacts.size() + " contact in you directory.");
        for (int i = 0; i < contacts.size(); i++) {
            System.out.print((i + 1) + ". ");           //   Simply to make a pretty itemize line
            contacts.get(i).printContactInfo();         //   This whole line makes up a contact obj, and it's meth!
        }
    }

    public void findContactByName() {
        System.out.println("Enter Name for Search");
        String searchName = getUserInput.nextLine();
        boolean found = false;                          //   Flag used to tell user when nothing is found

        for (int i = 0; i < contacts.size(); i++) {
            if(searchName.equals(contacts.get(i).getName())){
                contacts.get(i).printContactInfo();     //   Using ".equals" because we are checking if the data is
                                                        // same, and not the memory address (reference)
                found = true;                           //   Flag set to true, so we do not print "Nothing found
            }
        }
        if (!found) System.out.println("Nothing Found.");
    }

    public void modifyContact(){
        System.out.println("Enter Contact Name to Modify Information");
        String searchName = getUserInput.nextLine();
        boolean found = false;                          //   Flag used to tell user when nothing is found


        for (int i = 0; i < contacts.size(); i++) {     //   For loop to traverse the list to find the name the user
                                                        // provided.  Each time the list index is incremented, we
                                                        // access the contact obj getName method.  If is a match
                                                        // we call the contact obj setContactInfo method (as if we were
                                                        // in the addContact method) and the obj in that index is
                                                        // changed to what the user provides
            if(searchName.equals(contacts.get(i).getName())){
               contacts.get(i).setContactInfo();
               found = true;
               break;                                   //   Once found and completed, we break out of the for loop.
            }                                           // Not sure if this is needed.  However, it might help if
                                                        // we have multiple same-names.  UPDATE: It totally worked!
        }
        if (!found) System.out.println("Nothing Found.");

    }

    public void removeContact() {
        System.out.println("Enter Position you would like to Remove");
        int position = getUserInput.nextInt();          //   Instead of name (because I'm running into trouble just
                                                        // grabbing the whole obj based on an attribute within the list)

                                                        //   Used this to grab the name to tell the user which contact
                                                        // was deleted.  Needed to subtract by one to get the correct
                                                        // name.  Yes I missed that in the initial check...
        String theName = contacts.get(position-1).getName();
        contacts.remove(position - 1);            //   Again, using a builtin function and subtracting by one
        System.out.println(theName + " was Removed from your Contacts List");

    }
}
