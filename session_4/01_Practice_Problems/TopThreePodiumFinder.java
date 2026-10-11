import java.util.Arrays;

public class TopThreePodiumFinder {

    // Single-pass podium finder without sorting the original array
    public static int[] findTopThreeScores(int[] scores) {
        if (scores == null || scores.length < 3) {
            return new int[]{};
        }

        int first = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;

        for (int s : scores) {
            if (s >= first) {
                third = second;
                second = first;
                first = s;
            } else if (s >= second) {
                third = second;
                second = s;
            } else if (s >= third) {
                third = s;
            }
        }

        return new int[]{first, second, third};
    }

    public static void main(String[] args) {
        int[] scores1 = {45, 92, 78, 92, 88, 64};
        System.out.println("Scores: " + Arrays.toString(scores1));
        System.out.println("Top 3 Podium: " + Arrays.toString(findTopThreeScores(scores1)));

        int[] scores2 = {50, 80, 70, 90, 60, 100};
        System.out.println("\nScores: " + Arrays.toString(scores2));
        System.out.println("Top 3 Podium: " + Arrays.toString(findTopThreeScores(scores2)));
    }
}
