/**
 * Problem 5: The Movie Review Word Length Profiler
 * Scenario: Movie review moderation tool word length breakdown
 */
public class MovieReviewWordProfiler {

    public static void classifyWordLengths(String review) {
        if (review == null || review.trim().isEmpty()) {
            System.out.println("Short: 0 | Medium: 0 | Long: 0");
            return;
        }

        // Split by whitespace
        String[] words = review.trim().split("\\s+");
        int shortWords = 0;   // 1–4 letters
        int mediumWords = 0;  // 5–8 letters
        int longWords = 0;    // 9+ letters

        for (String word : words) {
            // Remove punctuation to count pure letter length
            String clean = word.replaceAll("[^a-zA-Z0-9]", "");
            int len = clean.length();

            if (len >= 1 && len <= 4) {
                shortWords++;
            } else if (len >= 5 && len <= 8) {
                mediumWords++;
            } else if (len >= 9) {
                longWords++;
            }
        }

        System.out.printf("Short: %d | Medium: %d | Long: %d%n", shortWords, mediumWords, longWords);
    }

    public static void main(String[] args) {
        String review = "This movie was absolutely fantastic and thrilling";
        System.out.println("Review: \"" + review + "\"");
        classifyWordLengths(review);
    }
}
