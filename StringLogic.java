import java.util.Scanner;

public class StringLogic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- String Logic Processor ---");
        System.out.print("Enter a word: ");
        String original = sc.next().toLowerCase();

        String reversed = "";
        int vowelCount = 0;

        for (int i = original.length() - 1; i >= 0; i--) {
            char ch = original.charAt(i);
            reversed += ch;

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowelCount++;
            }
        }

        System.out.println("\n--- Analysis Results ---");
        System.out.println("Original: " + original);
        System.out.println("Reversed: " + reversed);
        System.out.println("Vowel Count: " + vowelCount);

        if (original.equals(reversed)) {
            System.out.println("✅ Result: It is a Palindrome!");
        } else {
            System.out.println("❌ Result: Not a Palindrome.");
        }

        sc.close();
    }
}