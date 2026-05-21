// Implements selection sort with comparison and swap counting.
public class selectionSort {

    public static void sort(int[] arr, sortStats stats) {

        // Move boundary of unsorted portion one step at a time
        for (int i = 0; i < arr.length - 1; i++) {
            int minIndex = i;  // Assume current index is the minimum

            // Find the actual minimum in the unsorted portion
            for (int j = i + 1; j < arr.length; j++) {
                stats.comparisons++;  // Count comparison

                if (arr[j] < arr[minIndex]) {
                    minIndex = j;  // Update index of new minimum
                }
            }

            // Swap the found minimum with the first unsorted element
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
                stats.swaps++;  // Count swap
            }
        }
    }
}
