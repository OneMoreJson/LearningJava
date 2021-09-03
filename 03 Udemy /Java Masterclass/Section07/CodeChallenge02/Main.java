/*

Section 07, 2nd Code Challenge (CC): Encapsulation

   This challenge focuses on Encapsulation.  We need to build a printer
   that lets the user build a printer obj.  This printer can be duplex.
   It also lets us add printer if the parameters are met.

   This is basically the same as the previous Challenge given by the
   instructor.  So, he provided his answer to this CC.  However, it
   didn't work perfectly with the instructions provided by this
   automated code checker program provided by Udemy.  So, I'm starting
   from the beginning to see why.  It's often easier to just work through
   the material with a new perspective.  I hope later I can "see" the
   obvious errors as I become more experienced.

   ... With what was said above, this actually turned out to be harder
   than expected.  A few logical errors occurred when following the
   instructor.  I highlight them below.  I needed to dig into some
   Q&A forums to figure out just what the Udemy compiler was having a
   fit with... (see in the Printer class)

 */

public class Main {

    public static void main(String[] args) {

        Printer printer = new Printer(5, true);
        System.out.println(printer.addToner(45));
        System.out.println("initial page count= " + printer.getPagesPrinted());
        int pagesPrinted = printer.printPages(4);
        System.out.println("Pages printed was "
                + pagesPrinted
                + " new total print count for printer = "
                + printer.getPagesPrinted());

        pagesPrinted = printer.printPages(2);
        System.out.println("Pages printed was "
                + pagesPrinted
                + " new total print count for printer = "
                + printer.getPagesPrinted());


    }
}
