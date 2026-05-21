import java.util.Random;

// Generates different types of input arrays for testing sorting algorithms.
public class inputGenerator {

    // Returns a sorted array: best-case for insertion and bubble sort
    public static int[] increasing(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = i;
        return arr;
    }

    // Returns a reverse-sorted array: worst-case for insertion and bubble sort
    public static int[] reverse(int n) {
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = n - i;
        return arr;
    }

    // Returns an array filled with random integers: average-case input
    public static int[] random(int n) {
        Random r = new Random();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = r.nextInt();
        return arr;
    }
}
