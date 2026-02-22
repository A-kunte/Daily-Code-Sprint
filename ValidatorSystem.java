import java.util.Scanner;

@FunctionalInterface
interface SecurityCheck {
    boolean validate(String data);

    static void printSystemHeader() {
        System.out.println("\nPassword Validator");
        System.out.println("------------------------");
    }
}

class PasswordValidator implements SecurityCheck {
    @Override
    public boolean validate(String data) {
        // Core Logic: Must be > 5 chars and contains no spaces
        return data != null && data.length() > 5 && !data.contains(" ");
    }
}

public class ValidatorSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        PasswordValidator pv = new PasswordValidator();

        SecurityCheck.printSystemHeader();

        System.out.print("Enter a new password to test: ");
        String userInput = sc.nextLine();

        boolean isSafe = pv.validate(userInput);

        if (isSafe) {
            System.out.println("✅ Result: SAFE PASSWORD");
        } else {
            System.out.println("❌ Result: WEAK PASSWORD");
            System.out.println("(Criteria: Minimum 6 characters, no spaces allowed)");
        }

        sc.close();
    }
}