package guessinggame;
import javax.swing.*;
public class GuessingGame {
    public static String determineAnswer(int userAnswer, int randomNumber, int count){
        if (userAnswer <= 0 || userAnswer >100) {
            return "Your guess is invalid";
        }
        else if (userAnswer == randomNumber){
            return "Correct Answer!\nTotal guesses: " + count;
            }
        else if (userAnswer > randomNumber){
            return "Your guess is too high. Try Again\n Try Number: " + count;
        }
        else if ( userAnswer < randomNumber){
            return "Your guess is too low. Try again\n Try Number: " + count;
        }
        else {
            return "Your guess is incorrect. Try Number: " +count;
        }
    }
    public static void main(String[] args) {
        int randomNumber = (int)(Math.random() * 100 + 1);
        int userAnswer = 0;
        System.out.println("The correct guess would be: " + randomNumber);
        int count =  1;

        while(userAnswer != randomNumber){
            String response = JOptionPane.showInputDialog(null, "Guess a number between 1 and 100",
                    "Guessing Game");
            userAnswer = Integer.parseInt(response);
            JOptionPane.showMessageDialog(null, ""+ determineAnswer(userAnswer, randomNumber,
                    count));
            count++;

        }
    }
}
