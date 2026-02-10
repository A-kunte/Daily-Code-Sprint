import java.util.Scanner;

public class TableGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Table Generator ---");
        System.out.print("Enter a number to generate its table: ");
        
        if (sc.hasNextInt()) {
            int num = sc.nextInt();
            System.out.println("Table for " + num + ":");
            System.out.println("--------------------");

            for (int i = 1; i <= 10; i++) {
                int result = num * i;
                System.out.println(num + " x " + i + " = " + result);
            }
            System.out.println("--------------------");
        } else {
            System.out.println("Invalid input! Please enter a whole number.");
        }

        sc.close();
    }
}