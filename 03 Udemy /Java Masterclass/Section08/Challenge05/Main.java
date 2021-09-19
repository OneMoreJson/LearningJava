/*

Section 08, Challenge 05: Banking

   - Create a simple banking application
   - Have a Bank class
   -- It should have an arrayList of branches
   - Each Branch should have an arrayList of Customers
   - The Customer class should have an arrayList of doubles (transactions)
   -- Customer: Name and the ArrayList of doubles
   -- Branch: Need to be able to add a new customer and initial transaction amount
   -- Add additional transactions for that customer/branch
   -- Bank: Add new branch
   -- Bank: Add a customer to that branch with initial transaction
   -- Bank: Add a transaction for an existing customer for that branch
   - Show a list of customers for a particular branch and optionally a list
     of their transaction
   - Demonstration autoboxing and unboxing in your code
   Hint: Transactions
         Add data validation
         e.g. check if exists, or does not exist, etc.

 */

public class Main {

    public static void main(String[] args) {

        // Ex [TEST]
        Bank boa = new Bank("Bank of America");

        boa.addBranchToList("Seattle");
        boa.addBranchToList("Las Angelos");
        boa.addBranchToList("New York");

        boa.addCustomer("Seattle", "Jason", 1000000.99);
        boa.addCustomer("Seattle", "Lee", 4320.08);
        boa.addCustomer("Seattle", "Calvin", 532.00);

        boa.addCustomer("Las Angelos", "Jason", 4559.00);
        boa.addCustomer("Las Angelos", "Mocha", 33.12);
        boa.addCustomer("Las Angelos", "Sam", 2.42);

        boa.addCustomer("New York", "Jason", 77777.88);
        boa.addCustomer("New York", "Emily", 74.02);

        boa.listCustomers("Seattle", true);

        System.out.println();
        boa.addCustomerTransaction("Seattle", "Jason", 1.11);
        boa.addCustomerTransaction("Seattle", "Jason", 2.22);
        boa.addCustomerTransaction("Seattle", "Jason", 3.33);
        boa.listCustomers("Seattle", true);

        System.out.println();
        boa.listCustomers("New York", false);







    }

}
