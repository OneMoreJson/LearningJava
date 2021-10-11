package tech.jasoncameron;                              //   Importing the package
import tech.jasoncameron.util.IWindow;                  //   Importing the interface

public class Hal implements IWindow {                   //   Heuristically programmed ALgorithmic

    // Attributes
    private String windowName;

    // Constructor
    public Hal(String windowName) {
        this.windowName = windowName;
    }

    // Interface Meths

    @Override
    public String getName() {
        return this.windowName;
    }
    @Override
    public void opens() {
        System.out.println("Narrator:  " +
                "Computer Window opens...");
    }
    @Override
    public void display() {
        System.out.println(this.windowName +
                ":  What can I do for you?");
    }
    @Override
    public void respond(String x) {
        System.out.println(this.windowName  +
                ":  I'm sorry, " + x +
                ", I cannot do that.");
    }
    @Override
    public void closes(String x) {
        System.out.println(this.windowName + ":  Goodbye..." + x);
    }

    // Getters
    public String getWindowName() {
        return windowName;
    }
}
