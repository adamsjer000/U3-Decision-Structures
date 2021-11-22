import javax.swing.*;
import java.util.Random;

public class QuizGame {


    static int usersAnswer, correctAnswer;
    static String displayProblem = "";

    public static void main(String[] args) {

        createProblem();
        getUserAnswer();
        checkAnswer();

    }
    public static void checkAnswer(){
        if(usersAnswer == correctAnswer) {
            JOptionPane.showMessageDialog(null, "You are correct!");
        }else{
            JOptionPane.showMessageDialog(null, "Incorrect, please try again.");
        }
    }

    public static void getUserAnswer(){

        usersAnswer = input(displayProblem);
    }

    public static void createProblem() {

        int choice = input("Choose: Addition(1), Subtraction(2), Multiplication(3), Division(4)");

        if (choice >= 1) {
            if (choice < 5) {
                if (choice == 1) {
                    addProblem();
                }
                if (choice == 2) {
                    subProblem();
                }
                if (choice == 3) {
                    multProblem();
                }
                if (choice == 4) {
                    divProblem();
                }
            } else {
                System.out.println("Wrong input, restart program, try again.");
                System.exit(0);
            }
        } else {
            System.out.println("Wrong input, restart program, try again. ");
            System.exit(0);
        }
    }

    public static void addProblem() {

        int number1 = random();
        int number2 = random();

        correctAnswer = number1 + number2;
        displayProblem = number1 + " + " + number2;

    }

    public static void subProblem() {

        int number1 = random();
        int number2 = random();

        correctAnswer = number1 - number2;
        displayProblem = number1 + " - " + number2;
    }

    public static void multProblem() {

        int number1 = random();
        int number2 = random();

        correctAnswer = number1 * number2;
        displayProblem = number1 + " * " + number2;

    }

    public static void divProblem() {

        int number1 = random();
        int number2 = random();

        correctAnswer = number1 / number2;
        displayProblem = number1 +" / " + number2;
    }


    //HELPER METHODS
    public static int random() {

        Random random = new Random();
        return random.nextInt(20) + 1;

    }

    public static int input(String message){
        return Integer.parseInt(JOptionPane.showInputDialog(message));
    }
}
