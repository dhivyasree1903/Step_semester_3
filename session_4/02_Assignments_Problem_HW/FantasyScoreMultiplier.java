import java.util.Arrays;

public class FantasyScoreMultiplier {

    // Apply 2x to captain and 1.5x to vice-captain directly in the original array
    public static void applyMultipliers(double[] playerScores, int captainIndex, int viceCaptainIndex) {
        if (playerScores == null) {
            return;
        }

        if (captainIndex >= 0 && captainIndex < playerScores.length) {
            playerScores[captainIndex] *= 2.0;
        }

        if (viceCaptainIndex >= 0 && viceCaptainIndex < playerScores.length) {
            playerScores[viceCaptainIndex] *= 1.5;
        }
    }

    public static void main(String[] args) {
        double[] scores = {40, 55, 30, 62};
        System.out.println("Original scores: " + Arrays.toString(scores));

        applyMultipliers(scores, 1, 3);
        System.out.println("Boosted scores:  " + Arrays.toString(scores));
    }
}
