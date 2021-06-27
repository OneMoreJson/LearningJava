public class StudentProfile {

    String firstName;
    String lastName;
    int gradDate;
    double GPA;
    String major;

    public StudentProfile(String firstName,   // Constructor
                          String lastName,
                          String major,
                          double GPA,
                          int gradDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.major = major;
        this.GPA = GPA;
        this.gradDate = gradDate;
    }

    public void incrementExpectGradYear () {
        this.gradDate = this.gradDate + 1;

    }

}
