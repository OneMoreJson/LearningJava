
public class Main {


    public static void main(String[] args) {
        StudentProfile profileOne = new StudentProfile("Sally", "Salem", "Film", 3.75, 2022);
        StudentProfile profileTwo = new StudentProfile("Max", "Tiffen", "Computer Science", 3.45, 2021);

        System.out.println("The expected year of graduation for " + profileTwo.firstName + " is " +  profileTwo.gradDate);
        profileTwo.incrementExpectGradYear();
        System.out.println("The expected year of graduation for " + profileTwo.firstName + " is now " +  profileTwo.gradDate);
    }
}