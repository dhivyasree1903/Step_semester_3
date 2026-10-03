/**
 * Problem 2: The Typing Speed Test Accuracy Checker
 * Scenario: Online typing-practice accuracy reporting
 */
public class TypingAccuracyChecker {

    public static void checkTypingAccuracy(String original, String typed) {
        if (original == null || typed == null) {
            System.out.println("Invalid input text.");
            return;
        }

        int totalChars = original.length();
        int matched = 0;
        int firstMismatchPos = -1;
        char originalChar = ' ';
        char typedChar = ' ';

        int compareLength = Math.min(original.length(), typed.length());

        for (int i = 0; i < compareLength; i++) {
            if (original.charAt(i) == typed.charAt(i)) {
                matched++;
            } else if (firstMismatchPos == -1) {
                firstMismatchPos = i + 1; // 1-based position
                originalChar = original.charAt(i);
                typedChar = typed.charAt(i);
            }
        }

        double accuracy = (matched * 100.0) / totalChars;

        if (firstMismatchPos != -1) {
            System.out.printf("Matched: %d/%d | Accuracy: %.2f%% | First Mismatch at position %d ('%c' vs '%c')%n",
                    matched, totalChars, accuracy, firstMismatchPos, originalChar, typedChar);
        } else {
            System.out.printf("Matched: %d/%d | Accuracy: %.2f%% | No Mismatches%n",
                    matched, totalChars, accuracy);
        }
    }

    public static void main(String[] args) {
        System.out.println("Test Case 1:");
        checkTypingAccuracy("hello world", "hello worlt");

        System.out.println("\nTest Case 2:");
        checkTypingAccuracy("coding", "coding");
    }
}
