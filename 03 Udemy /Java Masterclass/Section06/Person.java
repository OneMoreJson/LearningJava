/*

Section 06, 2nd Code Challenge

   This challenge focuses on a few things.  First, it connects the method
   to the Main.  Second, it assigns attributes (making them private).  Third,
   it uses public Getters and Setters to access the "black box" attributes.
   Fourth, it has another additional methods that checks if the age input
   is valid.  The other method helps provide responses when the strings
   are empty.

   Method is tested within a Main java file (not here).

 */


public class Person {

    // Attributes
    private String firstName;
    private String lastName;
    private int age;

    // Getters
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getAge() {
        return age;
    }

    // Setters
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setAge(int age) {
        if (age < 0 || age > 100) age = 0;
        this.age = age;
    }

    // Other Methods
    public boolean isTeen(){                                        //   Checks to see if age is valid
        if (this.age > 12 && this.age < 20) return true;
        return false;
    }

    public String getFullName() {                                   //   Gets full name and determines what will
        if (firstName.isEmpty() && lastName.isEmpty()) return "";   // show if a string is empty
        else if (firstName.isEmpty()) return this.lastName;
        else if (lastName.isEmpty()) return this.firstName;
        return this.firstName + " " + this.lastName;
    }

}
