import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Fixed exchange rates (Logic constants)
        double usdToInr = 82.50;
        double usdToEur = 0.92;

        System.out.print("Enter amount in USD: ");
        double usd = sc.nextDouble();

        System.out.println("Choose target currency:");
        System.out.println("1. INR (Indian Rupee)");
        System.out.println("2. EUR (Euro)");
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.println("Amount in INR: " + (usd * usdToInr));
        } else if (choice == 2) {
            System.out.println("Amount in EUR: " + (usd * usdToEur));
        } else {
            System.out.println("Invalid choice.");
        }

        sc.close();
    }
}