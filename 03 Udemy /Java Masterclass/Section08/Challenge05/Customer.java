/*

   - The Customer class should have an arrayList of doubles (transactions)
   -- Customer: Name and the ArrayList of doubles


 */

import java.util.ArrayList;

public class Customer {

    // Attributes
    private String customerName;
    private ArrayList<Double> customerTransactions;

    // Constructor
    public Customer(String customerName, double firstTransaction) {
        this.customerName = customerName;
        this.customerTransactions = new ArrayList<>();
        this.customerTransactions.add(firstTransaction);
    }

    // Getters
    public String getCustomerName() {
        return customerName;
    }
    public ArrayList<Double> getCustomerTransactions() {
        return customerTransactions;
    }

    // Meths
    public void addCustomerTransactions(double at) {
        customerTransactions.add(at);
        System.out.println(at + " was added to your account");
    }

    public void printCustomerInfo() {
        System.out.println("Customer:  " + getCustomerName());
        System.out.println("Your transactions:  ");
        for (int i = 0; i < customerTransactions.size(); i++) {
            System.out.println((i+1) +".  $" + customerTransactions.get(i));
        }
    }

}
