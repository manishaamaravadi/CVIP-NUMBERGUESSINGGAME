import java.util.Random;
import java.util.Scanner;

public class index {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        int minRange = 1;
        int maxRange = 100;
Random random = new Random();
        int randomNumber = random.nextInt(maxRange - minRange + 1) + minRange;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between " + minRange + " and " + maxRange + ". Try to guess it!");

        boolean hasGuessedCorrectly = false;
        int numberOfTries = 0;

        while (!hasGuessedCorrectly) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            numberOfTries++;

            if (userGuess < minRange || userGuess > maxRange) {
                System.out.println("Please enter a valid guess within the specified range.");
            } else if (userGuess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                hasGuessedCorrectly = true;
                System.out.println("Congratulations! You guessed the correct number in " + numberOfTries + " tries.");
            }
        }

        scanner.close();
    }
}
