import java.util.*;

/**
 * Problem 5: Stop-Word-Filtered Word Frequency Report
 * Scenario: T&P feedback word-frequency analysis excluding common filler words.
 */
public class WordFrequencyReport {

    // Fixed set of stop words to ignore
    private static final Set<String> STOP_WORDS = new HashSet<>(Arrays.asList(
        "the", "was", "and", "a", "is", "of", "in"
    ));

    /**
     * Cleans text, filters stop words, counts frequencies,
     * and prints unique words sorted by frequency in descending order.
     * @param feedback The input feedback paragraph
     */
    public static void printFilteredWordFrequency(String feedback) {
        if (feedback == null || feedback.trim().isEmpty()) {
            System.out.println("No feedback data to analyze.");
            return;
        }

        // Normalize: convert to lowercase and remove punctuation
        String cleaned = feedback.toLowerCase()
                                 .replace(".", "")
                                 .replace(",", "")
                                 .replace("!", "")
                                 .replace("?", "")
                                 .replace(";", "")
                                 .replace(":", "");

        // Split into words by whitespace
        String[] words = cleaned.trim().split("\\s+");

        // Count frequency of non-stop words
        Map<String, Integer> frequencyMap = new HashMap<>();
        for (String word : words) {
            if (!word.isEmpty() && !STOP_WORDS.contains(word)) {
                frequencyMap.put(word, frequencyMap.getOrDefault(word, 0) + 1);
            }
        }

        // Sort by frequency in descending order
        List<Map.Entry<String, Integer>> sortedEntries = new ArrayList<>(frequencyMap.entrySet());
        sortedEntries.sort((e1, e2) -> e2.getValue().compareTo(e1.getValue()));

        // Display results
        for (Map.Entry<String, Integer> entry : sortedEntries) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public static void main(String[] args) {
        String sampleFeedback = "The mentor was great, the session was great and clear.";
        System.out.println("Feedback Input:");
        System.out.println("\"" + sampleFeedback + "\"\n");
        System.out.println("Filtered Word Frequency Report:");
        printFilteredWordFrequency(sampleFeedback);
    }
}
