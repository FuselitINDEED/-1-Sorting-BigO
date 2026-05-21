// Implements insertion sort with comparison and swap counting.
public class insertionSort {

    public static void sort(int[] arr, sortStats stats) {

        // Start from index 1 because the element at index 0 is already "sorted"
        for (int i = 1; i < arr.length; i++) {
            int key = arr[i];      // Element to insert
            int j = i - 1;

            // Shift elements to the right until the correct position is found
            while (j >= 0) {
                stats.comparisons++;  // Count comparison

                if (arr[j] > key) {
                    arr[j + 1] = arr[j];  // Shift element right
                    stats.swaps++;        // Count shift as a swap
                    j--;
                } else {
                    break;  // Stop when correct position is found
                }
            }

            // Insert the key into its correct position
            arr[j + 1] = key;
        }
    }
}
