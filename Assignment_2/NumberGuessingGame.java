import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lowerBound = 1, upperBound = 100;
        int guess;
        String feedback;

        System.out.println("Think of a number between 1 and 100, and I'll try to guess it.");
        
        while (true) {
            guess = generateGuess(lowerBound, upperBound);
            System.out.println("Is your number " + guess + "? (Enter 'high', 'low', or 'correct')");
            feedback = scanner.nextLine().toLowerCase();
            
            if (feedback.equals("correct")) {
                System.out.println("I guessed your number!");
                break;
            } else if (feedback.equals("high")) {
                upperBound = guess - 1;
            } else if (feedback.equals("low")) {
                lowerBound = guess + 1;
            } else {
                System.out.println("Invalid input, try again.");
            }
        }
    }

    public static int generateGuess(int lowerBound, int upperBound) {
        Random random = new Random();
        return random.nextInt(upperBound - lowerBound + 1) + lowerBound;
    }
}
