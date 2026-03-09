import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Anagram Logic ---");
        System.out.print("Enter first word: ");
        String str1 = sc.next();
        System.out.print("Enter second word: ");
        String str2 = sc.next();

        if (str1.length() != str2.length()) {
            System.out.println("❌ Not Anagrams (Different Lengths)");
        } else {
            char[] charArray1 = str1.toLowerCase().toCharArray();
            char[] charArray2 = str2.toLowerCase().toCharArray();

            Arrays.sort(charArray1);
            Arrays.sort(charArray2);

            if (Arrays.equals(charArray1, charArray2)) {
                System.out.println("✅ " + str1 + " and " + str2 + " are Anagrams!");
            } else {
                System.out.println("❌ Not Anagrams (Different Characters)");
            }
        }

        sc.close();
    }
}