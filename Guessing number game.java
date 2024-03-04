import java.util.Scanner;


public class Main {
        public static void main(String[] args) {

            Scanner scanner = new Scanner(System.in);
            int score = 0;
            int rounds = 4;
            int maxAttempts = 6;

            System.out.println("Welcome to the Number Guessing Game!");

            for (int round = 1; round <= rounds; round++) {
                int numberToGuess = (int)(Math.random() * 101); // Generate a random number within the specified range
                int attempts = 0;
                boolean NumberguessedCorrectly = false;

                System.out.println("\nRound " + round + ": Guess the number between: 1 and 100 ");

                while (attempts < maxAttempts) {
                    System.out.print("Enter a Number to guess: ");
                    int userGuessNumber = scanner.nextInt();
                    attempts++;

                    if (userGuessNumber == numberToGuess) {
                        NumberguessedCorrectly = true;
                        System.out.println("Congratulations! You have guessed the correct number.");
                        break;
                    }
                    else if (userGuessNumber < numberToGuess) {
                        System.out.println("The Guessed number is Too Low Number of Attempts left: " + "  " + (maxAttempts - attempts));
                    } else {
                        System.out.println("The Guessed number is Too High Number of Attempts left:"+ "  " + (maxAttempts - attempts));
                    }
                }

                if (!NumberguessedCorrectly) {
                    System.out.println("Out of attempts. Nice Try: The correct number was: "+ "  " + numberToGuess);
                } else {
                    score += maxAttempts - attempts + 1; // Increase score based on remaining attempts
                    System.out.println("Your score is: " + score);
                }
            }
            System.out.println("\nGame Over!");
            System.out.println("Your score is: " + score);
            scanner.close();
        }

}















