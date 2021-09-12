/*
   This seems really self-explanatory to me. This class basically builds our menu.
   From there, we control the flow of user inputs.  Most everything is private.
   The callMenu() function is the only thing accessible from the Main Ex position.

 */

import java.util.Scanner;

public class MobilePhone {

    // Scanner
    private static Scanner getUserInput = new Scanner(System.in);
    private static Contacts myContacts = new Contacts();

    public static void callMenu() {

        boolean quit = false;
        int choice = 0;

        printInstructions();
        while(!quit) {
            System.out.println("Enter your choice: ");
            choice = getUserInput.nextInt();
            getUserInput.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    myContacts.printAllContacts();
                    break;
                case 2:
                    myContacts.addToContacts();
                    break;
                case 3:
                    myContacts.modifyContact();
                    break;
                case 4:
                    myContacts.removeContact();
                    break;
                case 5:
                    myContacts.findContactByName();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }
    private static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the List of Contacts.");
        System.out.println("\t 2 - To add a new Contact to Contacts List.");
        System.out.println("\t 3 - To Modify an item in the list.");
        System.out.println("\t 4 - To remove an item from the list.");
        System.out.println("\t 5 - To search for a Contact by Name.");
        System.out.println("\t 6 - To quit the application.");
    }
}
