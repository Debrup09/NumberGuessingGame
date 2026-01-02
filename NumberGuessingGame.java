import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        // 1. Defining the range first
        System.out.println("what should be the lowest number of this game? : ");
        int min = sc.nextInt();
        System.out.println("what should be the highest number of this game? : ");
        int max = sc.nextInt();
        System.out.println("Great range is set!");
        int targetNumber = random.nextInt(max - min + 1) + min;

        // 2. Setting a Limit
        int maxAttempts = 7;
        System.out.println("Choose your difficulty: \n0. Easy\n1.Medium\n2.Hard\n3.Nightmare");
        int difficulty = sc.nextInt();

        switch (difficulty) {
            case 0 :  maxAttempts = 10;
                      break;
            case 1 :  break;
            case 2 :  maxAttempts = 5;
                      break;
            case 3 :  maxAttempts = 1;
                      break;

            default:  System.out.println("Invalid Choice! Starting with MEDIUM Difficulty");
                      break;
        }

        int attemptsMade = 0;
        boolean hasWon = false;

        System.out.println("--- Welcome to the Number Guessing Game! ---");
        System.out.println("I'm thinking of a number between " + min + " and " + max + ".");
        System.out.println("You have " + maxAttempts + " attempts to guess it.");

        while (attemptsMade < maxAttempts) {
            System.out.print("\nEnter your guess: ");

            // 3. Input Validation (Ensures the user enters a number)
            if (!sc.hasNextInt()) {
                System.out.println("That's not a valid number! Try again.");
                sc.next(); // Clear the invalid input
                continue;
            }

            int guess = sc.nextInt();
            attemptsMade++;

            // 4. Game Logic with Feedback
            if (guess > targetNumber) {
                System.out.println("Lower (Attempts remaining: " + (maxAttempts - attemptsMade) + ")");
            } else if (guess < targetNumber) {
                System.out.println("Higher (Attempts remaining: " + (maxAttempts - attemptsMade) + ")");
            } else {
                hasWon = true;
                break;
            }
        }

        // 5. End Game States
        if (hasWon) {
            System.out.println("\nCongratulations! You found it in " + attemptsMade + " guesses.");
        } else {
            System.out.println("\nGame Over! You've run out of attempts.");
            System.out.println("The number was: " + targetNumber);
        }

        sc.close();
    }
}