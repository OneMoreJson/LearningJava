/*

Section 07, 1st Challenge

   Create a single room of a house using composition
   Think about the things that should be included in the room
   Add at least one method to access an object via a getter and
   then that obj public method as you saw in the previous instruction
   then add at least one method to hide the obj

   This was actually done in a "challenge" by the instructor, and now 
   it is a "code challenge."  Meaning this is exactly the same as 
   before.  I'm including this because this is the first I've come
   accross "Encapsulation."  This is why I like Java.  I have done
   Python and JavaScript course.  This is the first I've learned 
   about encapsulation.  We learned inheritance.  

 */

public class Main {

    public static void main(String[] args) {

        // Building components of the bedroom                   //   From the Bedroom Class
        Wall wall1 = new Wall("West");
        Wall wall2 = new Wall("East");
        Wall wall3 = new Wall("South");
        Wall wall4 = new Wall("North");

        Ceiling ceiling = new Ceiling(
                12,
                55);

        Bed bed = new Bed(
                "Modern",
                4,
                3,
                2,
                1);

        Lamp lamp = new Lamp(
                "Classic",
                false,
                75);

        // Combining the above components into the larger Room (bedroom)
        Bedroom bedroom = new Bedroom(
                "Smash",
                wall1,
                wall2,
                wall3,
                wall4,
                ceiling,
                bed,
                lamp);

        // Meths
        bedroom.getLamp().turnOn();

    }
}
