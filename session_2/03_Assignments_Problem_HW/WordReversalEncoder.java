/**
 * Problem 2: Word Reversal Encoder
 * Scenario: Coding club "mirror text" mini-game reverses each word in a sentence
 * while preserving the word order.
 */
public class WordReversalEncoder {

    /**
     * Reverses each word individually in a sentence.
     * @param sentence Space-separated words
     * @return Transformed sentence with reversed words
     */
    public static String reverseEachWord(String sentence) {
        if (sentence == null || sentence.trim().isEmpty()) {
            return "";
        }

        String[] words = sentence.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];

            // Build reverse of each word using a loop and StringBuilder
            StringBuilder reversedWord = new StringBuilder();
            for (int j = word.length() - 1; j >= 0; j--) {
                reversedWord.append(word.charAt(j));
            }

            result.append(reversedWord);

            // Append space between words, but not after the last word
            if (i < words.length - 1) {
                result.append(" ");
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String input = "hello club";
        String output = reverseEachWord(input);
        System.out.println("Input : " + input);
        System.out.println("Output: " + output);

        String test2 = "Java strings are awesome";
        System.out.println("\nInput : " + test2);
        System.out.println("Output: " + reverseEachWord(test2));
    }
}
