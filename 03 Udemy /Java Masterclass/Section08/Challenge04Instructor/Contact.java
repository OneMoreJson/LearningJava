public class Contact {

    // Attributes
    private String name;
    private String phoneNumber;

    // Constructors
    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    // Getters
    public String getName() {
        return name;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }

    // Meths
    public static Contact createContact(String name, String phoneNumber) {  //   Something VERY NEW... not explained
        return new Contact(name, phoneNumber);                              // Basically creates a contact outside??
    }







}
