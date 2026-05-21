// Tracks the number of comparisons and swaps performed by a sorting algorithm.
public class sortStats {
    public long comparisons = 0;  // How many times two values were compared
    public long swaps = 0;        // How many times values were swapped or shifted

    // Reset counters before each new experiment
    public void reset() {
        comparisons = 0;
        swaps = 0;
    }
}
