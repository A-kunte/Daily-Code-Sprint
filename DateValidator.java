import java.util.Scanner;

public class DateValidator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Month & Leap Year Logic ---");
        System.out.print("Enter Year (e.g., 2024): ");
        int year = sc.nextInt();
        System.out.print("Enter Month (1-12): ");
        int month = sc.nextInt();

        int days = 0;
        boolean isLeap = false;

        if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
            isLeap = true;
        }

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = 30;
                break;
            case 2:
                days = isLeap ? 29 : 28;
                break;
            default:
                System.out.println("❌ Invalid Month!");
        }

        if (days != 0) {
            System.out.println("\n--- Result ---");
            System.out.println("Year " + year + " is a Leap Year: " + isLeap);
            System.out.println("Days in Month " + month + ": " + days);
        }

        sc.close();
    }
}