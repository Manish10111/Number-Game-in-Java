import java.util.Random;
import java.util.Scanner;
 

public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int minRange = 1;
        int maxRange = 100;
        int attempts = 6;
        int score = 0;

        System.out.println("Welcome to the Number Game!");

        while (true) {
            int numberToGuess = random.nextInt(maxRange - minRange + 1) + minRange;
            System.out.println("I've picked a number between " + minRange + " and " + maxRange + ". Can you guess what it is?");

            for (int attempt = 1; attempt <= attempts; attempt++) {
                System.out.print("Attempt " + attempt + "/" + attempts + ": Enter your guess: ");
                int userGuess = scanner.nextInt();

                if (userGuess == numberToGuess) {
                    System.out.println("Congratulations! You've guessed the correct number.");
                    score += attempts - (attempt - 1);
                    System.out.println(" Your total score is: " + score);
                    break;
                } else if (userGuess < numberToGuess) {
                    System.out.println("Too low! Try a higher number.");
                } else {
                    System.out.println("Too high! Try a lower number.");
                }

                if (attempt == attempts) {
                    System.out.println("Sorry, you've run out of attempts. The correct number was: " + numberToGuess);
                    System.out.println(" Your total score is: " + score);
                }
            }

            System.out.print("Do you want to play again? (y/n): ");
            String playAgain = scanner.next();

            if (!playAgain.equalsIgnoreCase("y")) {
                System.out.println("Hope you Enjoyed the Game");
                System.out.println("Thanks for playing!");
                break;
            }
        }

        scanner.close();
    }
}
