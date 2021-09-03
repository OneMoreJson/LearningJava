public class Lamp {

    // Attributes
    private String style;
    private boolean battery;
    private int globRating;

    // Constructor
    public Lamp(String style, boolean battery, int globeRating) {
        this.style = style;
        this.battery = battery;
        this.globRating = globeRating;
    }

    // Getters
    public String getStyle() {
        return style;
    }
    public boolean isBattery() {
        return battery;
    }
    public int getGlobRating() {
        return globRating;
    }

    // Meths                                                //   This method could be called in the Main, but
    public void turnOn() {                                  // it is best called through the Bedroom class
        System.out.println("Lamp -> turning on");
    }

}
