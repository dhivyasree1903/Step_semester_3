import java.util.Arrays;

public class TopPerformerTracker {

    // Track min, max, and spread in a single pass without sorting
    public static String findMinMaxSpread(int[] scores) {
        if (scores == null || scores.length == 0) {
            return "No scores provided";
        }

        int min = scores[0];
        int max = scores[0];

        for (int i = 1; i < scores.length; i++) {
            if (scores[i] < min) {
                min = scores[i];
            }
            if (scores[i] > max) {
                max = scores[i];
            }
        }

        int spread = max - min;
        return String.format("Min: %d, Max: %d, Spread: %d", min, max, spread);
    }

    public static void main(String[] args) {
        int[] scores1 = {45, 98, 62, 77, 85, 33};
        System.out.println("Scores: " + Arrays.toString(scores1));
        System.out.println("Result: " + findMinMaxSpread(scores1));

        int[] scores2 = {80, 80, 80};
        System.out.println("\nScores: " + Arrays.toString(scores2));
        System.out.println("Result: " + findMinMaxSpread(scores2));
    }
}
