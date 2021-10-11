package tech.jasoncameron.util;

public abstract class User {

    // Attributes
    public String name;

    // Abstract Meths
    public abstract void accessWindow(IWindow x);               //   Nothing is defined in these meths... later!
    public abstract void readWindow(IWindow x);
    public abstract void inputRequestToWindow(IWindow x);
    public abstract void closeWindow(IWindow x);

}
