public class FirstNonRepeatingCharacter {
    public static char findFirstNonRepeatingChar(String text) {
        if (text == null || text.isEmpty()) return '\0';
        int[] freq = new int[256];
        for (int i = 0; i < text.length(); i++) freq[text.charAt(i)]++;
        for (int i = 0; i < text.length(); i++) {
            if (freq[text.charAt(i)] == 1) return text.charAt(i);
        }
        return '\0';
    }

    public static void check(String text) {
        char result = findFirstNonRepeatingChar(text);
        System.out.println("Input: \"" + text + "\"");
        if (result != '\0') System.out.println("First Non-Repeating Character: '" + result + "'");
        else System.out.println("No Non-Repeating Character Found");
        System.out.println();
    }

    public static void main(String[] args) {
        check("swiss");
        check("aabbcc");
    }
}
