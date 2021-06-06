import java.util.Scanner;

public class MainChapter3_Challenge {

    public static void main(String[] args) {
        String question = "What is your favorite color?";
        String choiceOne = "Red";
        String choiceTwo = "Brown";
        String choiceThree = "Yellow";

//        Write a print statement asking the question
//        Write a print statement giving the answer choices
        System.out.println(question);
        System.out.println("Choose either: " + choiceOne + ", " + choiceTwo + ", or " + choiceThree);

//        Have the user input an answer
//        Retrieve the user's input
        Scanner getChoice = new Scanner(System.in);
        String usersChoice = getChoice.nextLine();

//        If the user's input matches the correctAnswer...
//        Then the user is correct and we want to print out the congrats

//        If the user's input does not match the correctAnswer...
//        then the user is incorrect and we want to print out a msg that says so

        if (usersChoice.equals(choiceTwo.toLowerCase())) {
            System.out.println("Correct");
        } else {
            System.out.println("NOT correct");
        }



    }
}
