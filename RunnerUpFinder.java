import java.util.Scanner;

public class RunnerUpFinder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Runner-Up Logic ---");
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        if (n < 2) {
            System.out.println("❌ Array must have at least two elements to find a runner-up.");
            return;
        }

        int[] arr = new int[n];
        System.out.println("Enter " + n + " integers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            if (arr[i] > largest) {
                secondLargest = largest;
                largest = arr[i];
            } else if (arr[i] > secondLargest && arr[i] != largest) {
                secondLargest = arr[i];
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            System.out.println("❌ No distinct second largest element found.");
        } else {
            System.out.println("\n✅ Analysis Complete:");
            System.out.println("🏆 Largest: " + largest);
            System.out.println("🥈 Second Largest (Runner-Up): " + secondLargest);
        }

        sc.close();
    }
}