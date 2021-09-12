/*
Section 08, Challenge 04: ArrayList

INSTRUCTIONS:
   - Create a program that implements a mobile phone with the following capabilities
   - Able to store, modify, remove and query contact names
   - You will wa want to create a separate class for Contacts (name and phone number)
   - Create a master class (MobilePhone) that holds the ArrayList of Contacts
   -- The MobilePhone class has the functionality listed above
   - Add a menu of options that are available
   -- Options: Quit, Print list of contacts, add new contact, update existing contact
      remove contact and search/find contact
   - When adding or updating be sure to check if the contact already exists (use name)
   - Be sure not to expose the inner workings of the ArrayList to MobilePhone
   - Mobile phone should do everything with Contacts obj only

NOTE:
   I like keeping the Main execution area as empty as possible.  Not sure if this is
   practical or even the norm in the wild.  Experience will give me a better view.

 */


public class Main {

    public static void main(String[] args) {

        // Build
        MobilePhone myMobilePhone = new MobilePhone();

        // Execute
        myMobilePhone.callMenu();


/*          TESTS...

            I was trying to see if I can access the classes and methods... I can.  So, this is still not totally
            black-boxed.  I will still need to learn more about private and public access...

//        Contact testContact = new Contact();
//        testContact.setContactInfo();
//
//        System.out.println(testContact.getName());
//        System.out.println(testContact.getPhoneNumber());
//        System.out.println(testContact.getClass());
//
//        Contacts testContacts = new Contacts();
//        testContacts.addToContacts();
//        testContacts.printAllContacts();
 */





    }
}
