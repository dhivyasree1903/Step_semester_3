public class MatchGridAnalyzer {

    // Helper method to calculate average runs per over in a match
    public static double rowAverage(int[] row) {
        if (row == null || row.length == 0) {
            return 0.0;
        }

        double total = 0.0;
        for (int runs : row) {
            total += runs;
        }

        return total / row.length;
    }

    // Classifies each match as Power Surge or Normal based on run-rate threshold
    public static String classifyMatches(int[][] runsPerOver, int threshold) {
        if (runsPerOver == null || runsPerOver.length == 0) {
            return "No match data";
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < runsPerOver.length; i++) {
            double runRate = rowAverage(runsPerOver[i]);
            String tag = (runRate >= threshold) ? "Power Surge" : "Normal";
            result.append(String.format("Match %d (Run Rate: %.1f): %s\n", (i + 1), runRate, tag));
        }

        return result.toString().trim();
    }

    public static void main(String[] args) {
        // Jagged 2D array: matches with varying overs bowled
        int[][] matchRuns = {
            {8, 12, 15, 6, 14},     // Match 1: Total = 55, Avg = 11.0
            {4, 5, 3, 6, 4, 8},     // Match 2: Total = 30, Avg = 5.0
            {10, 11, 9, 13},        // Match 3: Total = 43, Avg = 10.75
            {6, 7, 5}               // Match 4: Total = 18, Avg = 6.0
        };

        int threshold = 8;
        System.out.println("Match Classification (Run Rate Threshold = " + threshold + "):");
        System.out.println(classifyMatches(matchRuns, threshold));
    }
}
