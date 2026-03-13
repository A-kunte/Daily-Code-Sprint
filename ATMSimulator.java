import java.util.Scanner;

public class ATMSimulator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double balance = 500.00;
        boolean isRunning = true;

        System.out.println("--- Welcome to Bank ATM ---");

        while (isRunning) {
            System.out.println("\n1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Exit");
            System.out.print("Choose an option: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.printf("💰 Current Balance: $%.2f\n", balance);
                    break;

                case 2:
                    System.out.print("Enter deposit amount: ");
                    double deposit = sc.nextDouble();
                    if (deposit > 0) {
                        balance += deposit;
                        System.out.println("✅ Successfully deposited $" + deposit);
                    } else {
                        System.out.println("❌ Invalid amount!");
                    }
                    break;

                case 3:
                    System.out.print("Enter withdrawal amount: ");
                    double withdraw = sc.nextDouble();
                    if (withdraw > balance) {
                        System.out.println("❌ Error: Insufficient funds!");
                    } else if (withdraw <= 0) {
                        System.out.println("❌ Error: Invalid amount!");
                    } else {
                        balance -= withdraw;
                        System.out.println("✅ Successfully withdrew $" + withdraw);
                    }
                    break;

                case 4:
                    System.out.println("👋 Thank you for using Java Bank. Goodbye!");
                    isRunning = false;
                    break;

                default:
                    System.out.println("❌ Invalid Choice. Please try again.");
            }
        }
        sc.close();
    }
}