import java.util.Scanner;

public class ArmstrongLogic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Armstrong Number Checker ---");
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        int originalNum = number;
        int result = 0;

        int n = String.valueOf(number).length();

        while (originalNum != 0) {
            int remainder = originalNum % 10;

            result += Math.pow(remainder, n);

            originalNum /= 10;
        }

        if (result == number) {
            System.out.println("✅ " + number + " is an Armstrong number.");
        } else {
            System.out.println("❌ " + number + " is NOT an Armstrong number.");
        }

        sc.close();
    }
}