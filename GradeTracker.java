import java.util.Scanner;

public class GradeTracker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of subjects: ");
        int numSubjects = sc.nextInt();
        int[] marks = new int[numSubjects];
        double total = 0;

        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter marks for Subject " + (i + 1) + ": ");
            marks[i] = sc.nextInt();
            total += marks[i];
        }

        double average = total / numSubjects;

        System.out.println("\n--- 📊 Performance Report ---");
        System.out.println("Total Marks: " + total);
        System.out.printf("Average Percentage: %.2f%%\n", average);

        System.out.print("Final Result: ");
        if (average >= 75) {
            System.out.println("⭐ Distinction");
        } else if (average >= 60) {
            System.out.println("✅ First Class");
        } else if (average >= 50) {
            System.out.println("🆗 Second Class");
        } else if (average >= 35) {
            System.out.println("📋 Pass");
        } else {
            System.out.println("❌ Fail");
        }

        sc.close();
    }
}