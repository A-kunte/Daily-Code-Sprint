import java.util.Scanner;

public class ShortPass {
    // Core Logic: One line to check both conditions
    public static boolean isValid(String p) {
        return p.length() >= 8 && p.contains("@");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Password: ");
        String input = sc.next();

        // Output decision based on the boolean result
        System.out.println(isValid(input) ? "Valid" : "Invalid");

        sc.close();
    }
}