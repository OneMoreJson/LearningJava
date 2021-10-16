
import util.*;

public class Dave extends User {

    // No Additional Attributes
    String name = "";

    // Constructor
    public Dave(String name) {
        this.name = name;
    }

    // Abstract Methods
    @Override
    public void accessWindow(IWindow x) {
        x.opens();
        System.out.println(this.name +
                ":  Hello, " + x.getName() +
                ". \n" +
                "\t\tOpen the door." );
    }
    @Override
    public void readWindow(IWindow x) {
        x.display();
    }
    @Override
    public void inputRequestToWindow(IWindow x) {
        System.out.println(this.name + ":  Please, " + x.getName() + ", open the door...");
    }
    @Override
    public void closeWindow(IWindow x) {
        x.respond(this.name);
        x.closes(this.name);

    }
}
