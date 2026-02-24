import java.util.HashMap;
import java.util.Scanner;

public class LibrarySystem {
    public static void main(String[] args) {
        HashMap<Integer, String> bookRepo = new HashMap<>();
        Scanner sc = new Scanner(System.in);

        bookRepo.put(101, "Core Java Volume I");
        bookRepo.put(102, "Clean Code");
        bookRepo.put(103, "Design Patterns");

        System.out.println("--- Library Quick-Lookup System ---");

        while (true) {
            System.out.print("\nEnter Book ID to search (or 0 to exit): ");

            if (!sc.hasNextInt()) {
                System.out.println("❌ Invalid Input! Use numbers only.");
                sc.next();
                continue;
            }

            int id = sc.nextInt();
            if (id == 0)
                break;

            if (bookRepo.containsKey(id)) {
                String bookName = bookRepo.get(id);
                System.out.println("✅ Found: " + bookName);
            } else {
                System.out.println("⚠️ Record Not Found for ID: " + id);
            }
        }
        sc.close();
    }
}