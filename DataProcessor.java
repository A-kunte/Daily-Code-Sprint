import java.util.Arrays;

public class DataProcessor {
    
    public static void sortArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] numbers = {9, 3, 1, 7, 2};

        System.out.println("Before: " + Arrays.toString(numbers));

        sortArray(numbers);
        
        System.out.println("After:  " + Arrays.toString(numbers));
    }
}