/**
 * Problem 4: Library ISBN Normalizer & Validator
 * Scenario: Library book-intake scanner normalizes and validates 13-character ISBN-style codes:
 * 3 letters (publisher code) + 4 digits (year) + 6 digits (catalog number).
 */
public class IsbnNormalizerValidator {

    /**
     * Normalizes the raw ISBN code:
     * - Trims leading and trailing spaces
     * - Uppercases only the first 3 characters
     * @param raw The raw scanned string
     * @return Normalized string
     */
    public static String normalizeCode(String raw) {
        if (raw == null) {
            return null;
        }

        String trimmed = raw.trim();
        if (trimmed.length() < 3) {
            return trimmed.toUpperCase();
        }

        String publisherPrefix = trimmed.substring(0, 3).toUpperCase();
        String remaining = trimmed.substring(3);

        return publisherPrefix + remaining;
    }

    /**
     * Validates and formats the normalized code.
     * Rules:
     * - Exactly 13 characters
     * - First 3 characters are letters
     * - Remaining 10 characters are digits
     * Format: "[PUBCODE] YEAR: 20XX | CATALOG: 123456"
     * @param code The normalized code
     * @return Formatted string or error description
     */
    public static String validateAndFormat(String code) {
        if (code == null || code.length() != 13) {
            return "Invalid: code must be exactly 13 characters";
        }

        // Validate first 3 characters are letters (no regex)
        for (int i = 0; i < 3; i++) {
            if (!Character.isLetter(code.charAt(i))) {
                return "Invalid: publisher code must be 3 letters";
            }
        }

        // Validate remaining 10 characters are digits (no regex)
        for (int i = 3; i < 13; i++) {
            if (!Character.isDigit(code.charAt(i))) {
                return "Invalid: year and catalog body must contain 10 digits";
            }
        }

        // Extract sections
        String publisher = code.substring(0, 3);
        String year = code.substring(3, 7);
        String catalog = code.substring(7, 13);

        // Build formatted string using StringBuilder
        StringBuilder sb = new StringBuilder();
        sb.append("[").append(publisher).append("] ")
          .append("YEAR: ").append(year).append(" | ")
          .append("CATALOG: ").append(catalog);

        return sb.toString();
    }

    public static void processCode(String rawInput) {
        System.out.println("Input : \"" + rawInput + "\"");
        String normalized = normalizeCode(rawInput);
        if (normalized == null) {
            System.out.println("Output: Invalid input\n");
            return;
        }

        String result = validateAndFormat(normalized);
        System.out.println("Output: " + result + "\n");
    }

    public static void main(String[] args) {
        processCode(" pen2026004251 ");
        processCode("12N2026004251");
        processCode("abc202512"); // wrong length
    }
}
