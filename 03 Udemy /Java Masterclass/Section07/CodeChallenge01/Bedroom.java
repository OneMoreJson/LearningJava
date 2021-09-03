public class Bedroom {

    // Attributes
    private String name;                                //   Every room needs a name
    private Wall wall1;                                 //   Add four walls
    private Wall wall2;
    private Wall wall3;
    private Wall wall4;
    
    private Ceiling ceiling;                            //   Establish the ceiling obj from the Ceiling class
    private Bed bed;                                    //   Establish the bed obj from the Bed class
    private Lamp lamp;                                  //   Establish the lamp obj from the Lamp class

    // Constructor
    public Bedroom(String name, Wall wall1, Wall wall2, Wall wall3, Wall wall4, Ceiling ceiling, Bed bed, Lamp lamp) {
        this.name = name;
        this.wall1 = wall1;
        this.wall2 = wall2;
        this.wall3 = wall3;
        this.wall4 = wall4;
        this.ceiling = ceiling;
        this.bed = bed;
        this.lamp = lamp;
    }

    // Getters                                          //   Grabs Lamp from the Lamp class method
    public Lamp getLamp() {
        return lamp;
    }

    // Meths
    public void makeBed() {                             //   Grabs function from Bed class
        System.out.println("Bedroom -> Making bed");
    }




}
