import java.util.Scanner;

public class BillLogic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter total units consumed: ");

        if (sc.hasNextDouble()) {
            double units = sc.nextDouble();
            double bill = 0;

            if (units <= 100) {
                bill = units * 1;
            } else if (units <= 200) {
                bill = (100 * 1) + (units - 100) * 2;
            } else {
                bill = (100 * 1) + (100 * 2) + (units - 200) * 3;
            }

            System.out.println("---------------------------");
            System.out.println("Total Units: " + units);
            System.out.println("Total Charges: Rupees " + bill);
            System.out.println("---------------------------");
        } else {
            System.out.println("Invalid input.");
        }
        sc.close();
    }
}