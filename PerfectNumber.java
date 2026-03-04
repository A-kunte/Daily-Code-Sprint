import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Perfect Number Finder ---");
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int sum = 0;

        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
                System.out.println("Found factor: " + i);
            }
        }

        System.out.println("\nTotal Sum of Divisors: " + sum);

        if (sum == n && n != 0) {
            System.out.println("✅ " + n + " is a Perfect Number!");
        } else {
            System.out.println("❌ " + n + " is NOT a Perfect Number.");
        }

        sc.close();
    }
}