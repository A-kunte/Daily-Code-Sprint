import java.util.Scanner;

public class FrequencyLogic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int[] freq = new int[n];
        int visited = -1;

        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                    freq[j] = visited;
                }
            }
            if (freq[i] != visited) {
                freq[i] = count;
            }
        }

        System.out.println("\n--- Frequency Analysis ---");
        System.out.println(" Element | Frequency");
        System.out.println("---------------------");
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != visited) {
                System.out.println("    " + arr[i] + "    |    " + freq[i]);
            }
        }
        sc.close();
    }
}