package Projects;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int lowerBound = 1; // Minimum number in the range
        int upperBound = 100; // Maximum number in the range
        int randomNumber = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        int attempts = 0;

        System.out.println("Welcome to the Guessing Game!");
        System.out.println(
                "I'm thinking of a number between " + lowerBound + " and " + upperBound + ". Try to guess it.");

        while (true) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            attempts++;

            if (userGuess < lowerBound || userGuess > upperBound) {
                System.out.println("Please enter a number between " + lowerBound + " and " + upperBound + ".");
            } else if (userGuess < randomNumber) {
                System.out.println("Too low! Try again.");
            } else if (userGuess > randomNumber) {
                System.out.println("Too high! Try again.");
            } else {
                System.out.println(
                        "Congratulations! You guessed the number " + randomNumber + " in " + attempts + " attempts.");
                break;
            }
        }

        scanner.close();
    }
}
/*
 * Guessing Game Documentation
 * Purpose of the Game:
 * The purpose of the Guessing Game is to entertain and challenge the player's
 * ability to guess a randomly generated number within a specified range. The
 * game offers an engaging user experience by providing feedback on each guess
 * and rewarding the player when they correctly guess the target number.
 * 
 * Random Number Generation:
 * The game relies on a random number generator to select a secret number within
 * a predefined range. Here's how random number generation works in this game:
 * 
 * Initialization: A Random object is created from the Java util library to
 * handle random number generation.
 * 
 * Setting Range: The game defines a lower bound (minimum number) and an upper
 * bound (maximum number) for the random number. These bounds determine the
 * range within which the secret number will be generated.
 * 
 * Generation: The nextInt() method of the Random object is used to generate a
 * random integer within the specified range. The formula used is
 * random.nextInt(upperBound - lowerBound + 1) + lowerBound.
 * 
 * User Interaction:
 * The Guessing Game provides a user-friendly interaction to engage the player.
 * Here's how the user interacts with the game:
 * 
 * Welcome Message: When the game starts, it displays a welcome message,
 * informing the player about the game's objective.
 * 
 * Instructions: The game provides clear instructions on how to play, explaining
 * that the player needs to guess the secret number within the given range.
 * 
 * User Input: The player is prompted to enter their guess using the Scanner
 * class. They can input an integer within the specified range.
 * 
 * Feedback: After each guess, the game provides feedback to the player based on
 * the comparison between their guess and the secret number:
 * 
 * If the guess is too low, it displays a message indicating that the guess is
 * too low and prompts the player to try again.
 * If the guess is too high, it displays a message indicating that the guess is
 * too high and prompts the player to try again.
 * If the guess is correct, it congratulates the player, reveals the secret
 * number, and displays the number of attempts made.
 * Loop: The game uses a loop to continue the interaction until the player
 * correctly guesses the secret number. The loop ensures that the player can
 * make multiple attempts.
 * 
 * Closing: After the player guesses the correct number, the game closes
 * gracefully, releasing any resources and closing the Scanner.
 * 
 * Overall, the game's purpose is to entertain and challenge the player by
 * combining random number generation and user interaction to create an engaging
 * guessing experience. The player's objective is to guess the randomly
 * generated number correctly within the specified range while receiving
 * feedback on their guesses.
 * 
 * 
 * 
 * 
 * 
 */