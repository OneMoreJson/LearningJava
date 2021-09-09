/*
Section 07, Master Challenge ... My Solution

   - Purpose: help a fictitious company called Bills Burgers to manage their
   process of selling hamburgers
   - The application will help Bill to select types of burgers, some
   additional items (additions) to be added to the burger and pricing
   - Need to create a base hamburger, but also two other types of hamburgers
   are popular in Bills store
   - The Basic burger should have:
   -- Bread roll type, meat and up to 4 additional additions (things like
   lettuce, tomato, carrot, Etc.) that the customer can select to be added
   to the burger
   - Each one of these items gets charged an additional price, so you need a way
   to track how many items got added and to calculate the final price (base
   burger with all the toppings)
   - This burger has a base price and additions are all sold separate (up to
   additions)
   - Create a Hamburger class to deal with all the above
   - The constructor should only include the roll type, meat and price, can
   also include name of burger ... you can use a setter
   - Create two extra varieties of Hamburgers (subclasses) to cater for
   -- A) healthy burger (on a brown rye bread roll), plus two addition items
   that can be added
   -- The healthy burger can have 6 items (Additions) in total
   -- B) Deluxe burger... comes with chips and drinks as additions, but no
   extra additions are allowed
   - All three classes should have a method that can be called anytime to
   show the basic price of hamburger plus all additional, each showing
   the addition name, and addition price, and a grand/final total for
   burger (Base price + all additions)
   - For the two additional classes this may require you to be looking at
   the base class for pricing and then adding totals to final price

 */

public class Main {

    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("Basic", "Reindeer", 3.56, "White");

        double price = hamburger.itemizeHamburger();
        System.out.println();


        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.12);

        hamburger.itemizeHamburger();
        System.out.println("The final price for your hamburger is: $" + price);

        System.out.println();
        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHamburgerAddition1("Egg", 6.00);

        System.out.println("The final price for your healthy hamburger is: $" + healthyBurger.itemizeHamburger());

        System.out.println();
        DeluxeBurger db = new DeluxeBurger();
        db.itemizeHamburger();

        System.out.println();
        DeluxeBurger db2 = new DeluxeBurger();
        db2.addHamburgerAddition3("Rum", 25.95);
        db2.itemizeHamburger();




    }


}





















