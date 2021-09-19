/*
   - Have a Bank class
   -- It should have an arrayList of branches
   -- Bank: Add new branch
   -- Bank: Add a customer to that branch with initial transaction
   -- Bank: Add a transaction for an existing customer for that branch
   - Show a list of customers for a particular branch and optionally a list
     of their transaction

 */

import java.util.ArrayList;

public class Bank {

    // Attributes
    private String bankName;
    private ArrayList<Branch> branchList = new ArrayList<>();

    // Constructor
    public Bank(String bankName){
        this.bankName = bankName;
        this.branchList = new ArrayList<>();
    }

    // Private Meths
    private Branch findBranch(String branchName) {                      //   Mostly the same as the Branch class
        for (int i = 0; i < branchList.size(); i++) {
            Branch checkBranchExist = branchList.get(i);

            if(checkBranchExist.getBranchName().equals(branchName)) {
                return checkBranchExist;
            }                                                           //   Interesting thought, if you add an else
        }                                                               // return null in the for loop, you will stop
        return null;                                                    // after the first check and return the null
                                                                        // if it doesn't match.  This is why it is
                                                                        // added after the loop is finished
    }

    // Public Meths
    public boolean addBranchToList(String branchName) {
        if(findBranch(branchName) == null) {
            this.branchList.add(new Branch(branchName));                //   GOOD TO REMEMBER... you can add NEW obj
            return true;                                                // during the ".add" method of ArrayList
        }
        return false;
    }

    public boolean addCustomer(String branchName, String customerName, double initialTransaction) {
        Branch branch = findBranch(branchName);

        if(branch != null) {
            return branch.addCustomerToList(customerName, initialTransaction);
                                                                        //   Forgot, but this will return "true" if
                                                                        // completed and "false" if it couldn't.  This
                                                                        // is why we don't need to worry about
                                                                        // returning a boolean
        }
        return false;
    }

    public boolean addCustomerTransaction(String branchName, String customerName, double transaction) {
        Branch branch = findBranch(branchName);                         //   This is all the same as above (almost)

        if (branch != null) {
            return branch.addCustomerTransaction(customerName, transaction);
        }
        return false;
    }

    public boolean listCustomers(String branchName, boolean showTransactions) {
        Branch branch = findBranch(branchName);                         //   Starts the same as above (find meth)

        if(branch != null) {
            System.out.println("Customer details for branch " +         //   Preemptive notice on which branch we are
                    branch.getBranchName());                            // looking at

            ArrayList<Customer>branchCustomers = branch.getCustomerList();
                                                                        //   Creating an array to hold the branch
                                                                        // Customer obj data

            for (int i = 0; i < branchCustomers.size(); i++) {          //   For loop through the array

                Customer branchCustomer = branchCustomers.get(i);       //   Setting local Customer obj with data from
                                                                        // the local branchCustomer array during each
                                                                        // "i" iteration

                System.out.println((i+1) + ") Customer: " + branchCustomer.getCustomerName());
                                                                        //   Lists all the Customer Names in branch

                if(showTransactions) {                                  //   If the showTransaction is true we run
                    System.out.println("Transactions...");              // through all transactions for each customer
                                                                        // much the same way we did with customerNames

                    ArrayList<Double> transactions = branchCustomer.getCustomerTransactions();

                    for (int j = 0; j < transactions.size(); j++) {
                        System.out.println("\t"  + (j+1) + ". Amount:  " + transactions.get(j));
                    }
                }
            }
            return true;                                                //   If we enter the if statement then we leave
                                                                        // by returning a true boolean
        } else {
            return false;                                               //   Otherwise, we return a false
        }
    }
}
