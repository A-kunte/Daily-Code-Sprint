public class MergeLogic {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3 };
        int[] arr2 = { 4, 5, 6 };

        int[] result = new int[arr1.length + arr2.length];

        for (int i = 0; i < arr1.length; i++) {
            result[i] = arr1[i];
        }

        for (int i = 0; i < arr2.length; i++) {
            result[arr1.length + i] = arr2[i];
        }

        System.out.println("--- Array Merge Logic ---");
        System.out.print("Merged Array: ");
        for (int n : result) {
            System.out.print(n + " ");
        }
    }
}