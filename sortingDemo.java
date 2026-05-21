import java.util.Arrays;

// Runs all experiments and prints results in a formatted table.
public class sortingDemo {

    public static void main(String[] args) {

        int[] sizes = {100, 1000, 10000};  // Array sizes to test
        String[] labels = {"Increasing", "Random", "Reverse"};  // Input types

        sortStats stats = new sortStats();  // Shared stats object

        // Print table header
        System.out.println("Algorithm  |   Input    |   n   |  Comparison  | Swaps");
        System.out.println("---------------------------------------------------------------");

        // Loop through each array size
        for (int n : sizes) {

            // Generate all three input types for this size
            int[][] inputs = {
                inputGenerator.increasing(n),
                inputGenerator.random(n),
                inputGenerator.reverse(n)
            };

            // Run each algorithm on each input type
            for (int i = 0; i < inputs.length; i++) {
                int[] base = inputs[i];

                // Insertion Sort
                stats.reset();
                insertionSort.sort(Arrays.copyOf(base, base.length), stats);
                printRow("Insertion", labels[i], n, stats);

                // Selection Sort
                stats.reset();
                selectionSort.sort(Arrays.copyOf(base, base.length), stats);
                printRow("Selection", labels[i], n, stats);

                // Bubble Sort
                stats.reset();
                bubbleSort.sort(Arrays.copyOf(base, base.length), stats);
                printRow("Bubble", labels[i], n, stats);
            }
        }
    }

    // Helper method to print a formatted row of results
    private static void printRow(String algo, String inputType, int n, sortStats stats) {
        System.out.printf("%-10s | %-10s | %-5d | %-13d | %-8d%n",
                algo, inputType, n, stats.comparisons, stats.swaps);
    }
}
       
