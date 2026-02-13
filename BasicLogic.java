import java.util.Scanner;

public class BasicLogic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Age Logic ---");
        System.out.print("Enter your age: ");
        int age = sc.nextInt();

        if (age < 0) {
            System.out.println("Invalid age entered.");
        } else if (age <= 12) {
            System.out.println("Category: Child");
        } else if (age <= 19) {
            System.out.println("Category: Teenager");
        } else if (age <= 60) {
            System.out.println("Category: Adult");
        } else {
            System.out.println("Category: Senior Citizen");
        }

        sc.close();
    }
}