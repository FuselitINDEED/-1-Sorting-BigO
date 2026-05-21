// Implements bubble sort with comparison and swap counting.
public class bubbleSort {

    public static void sort(int[] arr, sortStats stats) {

        boolean swapped = true;  // Tracks whether any swap occurred in a pass

        // Continue looping until no swaps occur
        for (int i = 0; i < arr.length - 1 && swapped; i++) {
            swapped = false;  // Assume no swaps this pass

            // Compare adjacent elements
            for (int j = 0; j < arr.length - 1 - i; j++) {
                stats.comparisons++;  // Count comparison

                if (arr[j] > arr[j + 1]) {
                    // Swap adjacent elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    stats.swaps++;  // Count swap
                    swapped = true; // A swap occurred, so keep looping
                }
            }
        }
    }
}
