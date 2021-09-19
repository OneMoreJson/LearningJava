/*

   - Each Branch should have an arrayList of Customers
   -- Branch: Need to be able to add a new customer and initial transaction amount
   -- Add additional transactions for that customer/branch

 */


import java.util.ArrayList;

public class Branch  {

    // Attributes
    private String branchName;
    private ArrayList<Customer> customerList;

    // Constructor
    public Branch(String branchName) {
        this.branchName = branchName;
        this.customerList = new ArrayList<>();
    }

    // Getters
    public String getBranchName() {
        return branchName;
    }
    public ArrayList<Customer> getCustomerList(){
        return customerList;
    }

    // Private Meths
    private Customer findCustomer(String customerName){                 //   Start by finding if the exists in the
                                                                        // customerList array.  If it does, we want to
                                                                        // return the customer obj.  This is used in
                                                                        // so many methods below...

        for (int i = 0; i < this.customerList.size(); i++) {            //   For loop running through the customerList
                                                                        // array
            Customer checkCustomerExist = this.customerList.get(i);     //   At each interval we create a Customer obj
                                                                        // that is assigned the Customer obj data at
                                                                        // "i" index

            if(checkCustomerExist.getCustomerName().equals(customerName)) {
                return checkCustomerExist;                              //   Then we use the If statement check to see
                                                                        // if that object's data is equal to the
                                                                        // customerName parameter data.  Note: we use
                                                                        // the ".equals" method.  If the obj matches
                                                                        // we return the obj

                                            /*
                                                    IMPORTANT NOTE: "In simple words, == checks if both objects point
                                                    to the same memory location whereas .equals() evaluates to the
                                                    comparison of values in the objects."

                                                    ~ Quoted from GeeksForGeeks
                                                    https://www.geeksforgeeks.org/difference-equals-method-java/

                                             */
            }
        }
        return null;                                                    //   Returning null means we can provide some
                                                                        // useful responses later if we cannot find
                                                                        // the customer obj
    }

    // Public Meths
    public boolean addCustomerToList(String customerName, double initialTransaction) {
        if(findCustomer(customerName) == null) {                        //   This If statement keeps us from entering
                                                                        // the same name twice.  It pulls the find
                                                                        // method from above which provides either a
                                                                        // Customer obj or null.  If the name is not
                                                                        // we continue with this statement
            this.customerList.add(new Customer(customerName, initialTransaction));
            return true;                                                //   WE add a new Customer obj (with the info
                                                                        // provided in the parameters) to the
                                                                        // customerList array.  After this is done, we
                                                                        // return "true" to show it was completed.
                                                                        //   NOTE: apparently modifying data and
                                                                        // returning something else is not considered
                                                                        // a good practice in other programming
                                                                        // languages.  I have now idea if that is true
        }
        return false;
    }

    public boolean addCustomerTransaction(String customerName, double transaction) {
        Customer existingCustomer = findCustomer(customerName);         //   Much like the addCustomerToList meth above,
                                                                        // we start by grabbing data from the find
                                                                        // meth and applying it to a new Customer obj

        if(existingCustomer != null) {                                  //   This time, if the local Customer obj is
                                                                        // NOT null, we can continue

            existingCustomer.addCustomerTransactions(transaction);      //   We dive into the Customer object's methods
            return true;                                                // and apply the add transaction.  Then return
                                                                        // "true" to show it was successfull
        }
        return false;
    }



}
