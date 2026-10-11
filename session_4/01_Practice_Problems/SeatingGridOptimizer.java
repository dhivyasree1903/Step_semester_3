public class SeatingGridOptimizer {

    // Helper method to compute average of a single row
    public static double rowAverage(int[] row) {
        if (row == null || row.length == 0) {
            return 0.0;
        }

        double total = 0.0;
        for (int score : row) {
            total += score;
        }

        return total / row.length;
    }

    // Classify each row in a jagged 2D seating array against a target threshold
    public static String classifyRows(int[][] seatingScores, int threshold) {
        if (seatingScores == null || seatingScores.length == 0) {
            return "No seating data";
        }

        StringBuilder report = new StringBuilder();

        for (int i = 0; i < seatingScores.length; i++) {
            double avg = rowAverage(seatingScores[i]);
            String status = (avg >= threshold) ? "Above Threshold" : "Below Threshold";
            report.append(String.format("Row %d (Avg: %.1f): %s\n", (i + 1), avg, status));
        }

        return report.toString().trim();
    }

    public static void main(String[] args) {
        // Jagged 2D grid (different number of seats per row)
        int[][] seatingScores = {
            {75, 80, 85},           // Row 1: Avg = 80.0
            {60, 65, 70, 62},       // Row 2: Avg = 64.25
            {90, 95},               // Row 3: Avg = 92.5
            {55, 58, 60, 64, 50}    // Row 4: Avg = 57.4
        };

        int threshold = 70;
        System.out.println("Seating Grid Classification (Threshold = " + threshold + "):");
        System.out.println(classifyRows(seatingScores, threshold));
    }
}
