public class ReverseLogic {
    public static void main(String[] args) {
        int[] original = { 10, 20, 30, 40, 50 };

        System.out.println("--- Reverse Logic ---");

        System.out.print("Original: ");
        for (int i = 0; i < original.length; i++) {
            System.out.print(original[i] + " ");
        }

        System.out.print("\nReversed: ");

        for (int i = original.length - 1; i >= 0; i--) {
            System.out.print(original[i] + " ");
        }

        System.out.println("\n---------------------------");
    }
}