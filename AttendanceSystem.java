import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class AttendanceSystem {
    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        String input = "";
        System.out.println("--- Student Attendance Entry ---");
        System.out.println("(Type 'done' to stop adding names)");

        while (true) {
            System.out.print("Enter Student Name: ");
            input = sc.nextLine().trim();

            if (input.equalsIgnoreCase("done"))
                break;

            if (!input.isEmpty()) {
                students.add(input);
            }
        }

        System.out.println("\nTotal Students: " + students.size());
        Collections.sort(students);
        System.out.println("Sorted Attendance List:");
        for (String s : students) {
            System.out.println("- " + s);
        }
        sc.close();
    }
}