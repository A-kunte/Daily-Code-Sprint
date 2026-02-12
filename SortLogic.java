import java.util.Scanner;

public class SortLogic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter three numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int small, mid, large;

        if (a <= b && a <= c) {
            small = a;
            if (b <= c) {
                mid = b;
                large = c;
            } else {
                mid = c;
                large = b;
            }
        } else if (b <= a && b <= c) {
            small = b;
            if (a <= c) {
                mid = a;
                large = c;
            } else {
                mid = c;
                large = a;
            }
        } else {
            small = c;
            if (a <= b) {
                mid = a;
                large = b;
            } else {
                mid = b;
                large = a;
            }
        }

        System.out.println("Sorted Order: " + small + ", " + mid + ", " + large);

        sc.close();
    }
}