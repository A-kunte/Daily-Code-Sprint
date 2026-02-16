public class SecurityLogic {

    // Core Logic: The Security Gatekeeper
    public static String validatePassword(String pass) {
        // 1. Length Check
        if (pass.length() < 8) {
            return "REJECTED: Too short (Min 8 chars).";
        }

        // 2. Space Check
        if (pass.contains(" ")) {
            return "REJECTED: Cannot contain spaces.";
        }

        // 3. Complexity Check (Special Character)
        if (!pass.contains("@") && !pass.contains("#") && !pass.contains("$")) {
            return "REJECTED: Must contain @, #, or $.";
        }

        // 4. Final Success
        return "ACCEPTED: Strong Password. ";
    }

    public static void main(String[] args) {
        System.out.println("--- Day 11: Security Validation Logic ---");

        // Testing different logical outcomes
        System.out.println("Test 1: " + validatePassword("123"));
        System.out.println("Test 2: " + validatePassword("hello world"));
        System.out.println("Test 3: " + validatePassword("securePassword"));
        System.out.println("Test 4: " + validatePassword("Java_Dev@2026"));
    }
}