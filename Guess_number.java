import java.util.Random;
import java.util.Scanner;

public class Guess_number {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int minRange = 1;
        int maxRange = 100;
        int attempts = 0;
        int totalAttempts = 0;
        int score = 0;

        int round = 0;

        System.out.println("Welcome to the Number Guessing Game!");

        boolean playAgain = true;
        while (playAgain) {
            round++;
            int targetNumber = random.nextInt(maxRange - minRange + 1) + minRange;
            System.out.println("Round" + round + ":I've picked a number between" + minRange);

            boolean guessedCorrectly = false;
            while (!guessedCorrectly) {
                System.out.print("Enter your guess: ");
                int guess = scanner.nextInt();
                attempts++;
                totalAttempts++;

                if (guess == targetNumber) {
                    System.out.println("Congratulations! You guessed the correct number in ");
                    score += (maxRange - minRange + 1) - attempts;
                    guessedCorrectly = true;
                } else if (guess < targetNumber) {
                    System.out.println("Too low! Try again.");
                } else {
                    System.out.println("Too high! Try again.");
                }
            }

            System.out.println("Do you want to play again? (yes/no):");
            String playChoice = scanner.next();
            if (!playChoice.equalsIgnoreCase("yes")) {
                playAgain = false;
            } else {
                attempts = 0;
            }
        }

        System.out.println("Thank you for playing!your total score is: " + score);
        System.out.println("Total rounds played:" + round);
        System.out.println("Average attempts per round:" + (double) totalAttempts / round);
        scanner.close();
    }
}
