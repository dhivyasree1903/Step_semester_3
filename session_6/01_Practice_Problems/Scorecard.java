public class Scorecard {

    private final boolean[] results;
    private int recordedCount;

    // Constructor fixes the total number of questions
    public Scorecard(int totalQuestions) {
        if (totalQuestions <= 0) {
            this.results = new boolean[0];
        } else {
            this.results = new boolean[totalQuestions];
        }
        this.recordedCount = 0;
    }

    // Record an answer's result one by one
    public void recordAnswer(boolean isCorrect) {
        if (recordedCount >= results.length) {
            System.out.println("Warning: All " + results.length + " questions have already been recorded.");
            return;
        }
        results[recordedCount] = isCorrect;
        recordedCount++;
    }

    // Compute and expose only the final score without exposing the internal array
    public int getScore() {
        int correctCount = 0;
        for (int i = 0; i < recordedCount; i++) {
            if (results[i]) {
                correctCount++;
            }
        }
        return correctCount;
    }

    public static void main(String[] args) {
        System.out.println("--- Quiz Scorecard Demo ---");
        Scorecard sc = new Scorecard(4);

        sc.recordAnswer(true);
        sc.recordAnswer(true);
        sc.recordAnswer(false);
        sc.recordAnswer(true);

        System.out.println("sc.getScore() -> " + sc.getScore());
    }
}
