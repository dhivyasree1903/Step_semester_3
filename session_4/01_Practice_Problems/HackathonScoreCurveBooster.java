import java.util.Arrays;

public class HackathonScoreCurveBooster {

    // Boost every team score in-place by the flat bonus amount
    public static void curveScores(int[] scores, int bonus) {
        if (scores == null) {
            return;
        }

        for (int i = 0; i < scores.length; i++) {
            scores[i] += bonus;
        }
    }

    public static void main(String[] args) {
        int[] scores = {70, 85, 60};
        int bonus = 10;

        System.out.println("Original scores: " + Arrays.toString(scores));
        curveScores(scores, bonus);
        System.out.println("Curved scores:   " + Arrays.toString(scores));

        // Additional test case
        int[] scores2 = {45, 55, 90, 88};
        System.out.println("\nOriginal scores: " + Arrays.toString(scores2));
        curveScores(scores2, 5);
        System.out.println("Curved scores:   " + Arrays.toString(scores2));
    }
}
