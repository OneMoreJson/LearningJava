/*******************
 Name: Jason Cameron

 Date: 03 Oct 2021

 Notes: Completed for ENTD381 Summer 2021 Week 04

    Design and implement a set of classes that define the employees of a hospital:
    doctor, nurse, administrator, surgeon, receptionist, janitor, and so on. Include
    methods in each class that are named according to services provided by that
    person and that print an appropriate message. Create a main driver class to
    instantiate and exercise several of the classes.

    Note: This assignment sounded interesting.  I chose to approach it like a hospital
    RPG.  However, that only means the vars and meths I included are based on the idea.
    I do not have the skills to make this a real game at this moment (nor time).

    +Note: I am choosing to create a super class called HospitalEmployee.  From there,
    create child classes that inherit attributes and behaviors of the super.  These
    are the subclasses I will create:
        1. doctor
        2. nurse
        3. administrator
        4. surgeon
        5. receptionist
        6. janitor
        7. security

 *******************/

public class Main {

    public static void main(String[] args) {

        // Intro
        System.out.println("Welcome to our Hospital Game!");
        System.out.println("Here is our cast of Hospital Employees:\n");

        // Introduce Cast
        //   1. Doctor
        Doctor doctor = new Doctor("White",
                150_000.00d,
                "Neurology");                                  //   Instantiate the obj
        doctor.greeting();
        System.out.print("\t");                                         //   More fluff to make the lines readable
        doctor.work();
        System.out.println();                                           //   Simple line spacing.  I feel like there is
                                                                        // better way to do this

        //   2. Nurse
        Nurse nurse = new Nurse("Miss Scarlet",
                "Night", 70_000.00d);
        nurse.work(nurse.shift);                                        //   Running this changes the original 100 par
        nurse.greeting();
        System.out.print("\t");
        System.out.println(nurse.getName() +
                " starts with " +
                nurse.focus + " focus and " +
                nurse.stamina + " stamina because they work the " +
                nurse.shift + " shift.");
        System.out.println();


        //   3. Admin
        Admin admin = new Admin("Col. Mustard", 70_000.00d);
        admin.addCerts("FACHE");                                        //   Need to build that cred
        admin.addCerts("CMM");
        admin.addCerts("cHAP");
        admin.addCerts("CPHRM");
        admin.addCerts("CPHIMS");
        admin.addCerts("CRCE");
        admin.addCerts("CRCP");
        admin.greeting();                                               //   Combined greet with list certs
        System.out.println();


        //   4. Surgeon
        Surgeon surgeon = new Surgeon("Wadsworth",
                280_000.00d, "Plastic",
                "555-867-5309");
        surgeon.greeting();
        System.out.println();


        //   5. Receptionist
        Receptionist receptionist = new Receptionist("Miss Peacock",
                27_000.00d);
        receptionist.addTasks("Phone call 1");
        receptionist.addTasks("Phone call 2");
        receptionist.addTasks("Phone call 3");
        receptionist.addTasks("Phone call 4");
        receptionist.addTasks("Phone call 5");
        receptionist.addTasks("Type report");
        receptionist.addTasks("Gather reports");
        receptionist.addTasks("Get coffee");
        receptionist.addTasks("Answer mail");
        receptionist.addTasks("Type email 1");
        receptionist.greeting();
        System.out.println();


        //   6. Janitor
        Janitor janitor = new Janitor("P. Plum", "Swing",
                22_0000d);
        janitor.setNumberOFMesses(88);
        janitor.greeting();
        System.out.println();
        System.out.println();


        //   7. Security
        Security security = new Security("Mr. Boddy", "Night", 20_000.00d);
        security.setNumberOfCoffees(3);
        security.greeting();
        System.out.println();
        System.out.println();


        //   One more thing I wanted to do... just because I added pay into the attributes
        System.out.println("The total amount the hospital is paying for theses seven employees is: " +
                (int)(admin.annualPay + doctor.annualPay + janitor.annualPay +
                nurse.annualPay + receptionist.annualPay +
                security.annualPay + surgeon.annualPay));



    }
}









