import java.util.Scanner;
import java.util.InputMismatchException;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int secretNum = 7;
        int userGuess = 0;

        System.out.println("--- The Number Logic Game ---");
        System.out.println("I'm thinking of a number between 1 and 10.");

        while (userGuess != secretNum) {
            try {
                System.out.print("Enter your guess: ");
                userGuess = sc.nextInt();

                if (userGuess < 1 || userGuess > 10) {
                    System.out.println("⚠️ Out of Bounds! Stay between 1 and 10.");
                } else if (userGuess < secretNum) {
                    System.out.println("🔼 Higher!");
                } else if (userGuess > secretNum) {
                    System.out.println("🔽 Lower!");
                } else {
                    System.out.println("🎉 CORRECT! The number was " + secretNum);
                }

            } catch (InputMismatchException e) {

                System.out.println("❌ ERROR: That's not a number! Try again.");
                sc.next();
            }
        }

        System.out.println("Game Over. Thanks for playing!");
        sc.close();
    }
}