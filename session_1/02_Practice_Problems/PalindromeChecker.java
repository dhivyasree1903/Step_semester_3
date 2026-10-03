public class PalindromeChecker {
    public static boolean isPalindromeIterative(String text) {
        if (text == null) return false;
        int left = 0, right = text.length() - 1;
        while (left < right) {
            if (Character.toLowerCase(text.charAt(left)) != Character.toLowerCase(text.charAt(right))) return false;
            left++; right--;
        }
        return true;
    }

    public static boolean isPalindromeRecursive(String text) {
        if (text == null) return false;
        return checkRecursive(text.toLowerCase(), 0, text.length() - 1);
    }

    private static boolean checkRecursive(String text, int start, int end) {
        if (start >= end) return true;
        if (text.charAt(start) != text.charAt(end)) return false;
        return checkRecursive(text, start + 1, end - 1);
    }

    public static boolean isPalindromeArrayReversal(String text) {
        if (text == null) return false;
        char[] original = text.toLowerCase().toCharArray();
        char[] reversed = new char[original.length];
        for (int i = 0; i < original.length; i++) reversed[i] = original[original.length - 1 - i];
        return new String(original).equals(new String(reversed));
    }

    public static void test(String text) {
        System.out.println("\"" + text + "\"");
        System.out.println("Iterative: " + (isPalindromeIterative(text) ? "Palindrome" : "Not Palindrome") +
                           " | Recursive: " + (isPalindromeRecursive(text) ? "Palindrome" : "Not Palindrome") +
                           " | Array Reversal: " + (isPalindromeArrayReversal(text) ? "Palindrome" : "Not Palindrome"));
        System.out.println();
    }

    public static void main(String[] args) {
        test("madam");
        test("hello");
    }
}
    

