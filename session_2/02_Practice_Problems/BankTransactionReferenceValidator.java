/**
 * Problem 5: Bank Transaction Reference Generator & Validator
 * Scenario: Fintech onboarding transaction reference validation and normalization
 */
public class BankTransactionReferenceValidator {

    /**
     * Normalizes the raw reference: trims leading/trailing spaces,
     * and uppercases only the first 3 characters.
     */
    public static String normalizeReference(String raw) {
        if (raw == null) {
            return null;
        }

        String trimmed = raw.trim();
        if (trimmed.length() < 3) {
            return trimmed.toUpperCase();
        }

        String bankCodeUpper = trimmed.substring(0, 3).toUpperCase();
        String remainder = trimmed.substring(3);

        return bankCodeUpper + remainder;
    }

    /**
     * Validates and formats the reference code.
     * Expected structure: exactly 14 characters:
     * - 3 letters (Bank code)
     * - 6 digits (Date ddMMyy)
     * - 5 digits (Sequence number)
     */
    public static String validateAndFormat(String reference) {
        if (reference == null || reference.length() != 14) {
            return "Invalid: reference must be exactly 14 characters";
        }

        // Validate first 3 characters are letters
        for (int i = 0; i < 3; i++) {
            if (!Character.isLetter(reference.charAt(i))) {
                return "Invalid: bank code must be 3 letters";
            }
        }

        // Validate remaining 11 characters are digits
        for (int i = 3; i < 14; i++) {
            if (!Character.isDigit(reference.charAt(i))) {
                return "Invalid: body must contain 11 digits";
            }
        }

        // Format into: [BANKCODE] DATE: dd/MM/yy | SEQ: 12345
        String bankCode = reference.substring(0, 3);
        String day = reference.substring(3, 5);
        String month = reference.substring(5, 7);
        String year = reference.substring(7, 9);
        String seq = reference.substring(9, 14);

        StringBuilder formatted = new StringBuilder();
        formatted.append("[")
                 .append(bankCode)
                 .append("] DATE: ")
                 .append(day).append("/").append(month).append("/").append(year)
                 .append(" | SEQ: ")
                 .append(seq);

        return formatted.toString();
    }

    public static void process(String raw) {
        System.out.println("Raw Input: \"" + raw + "\"");
        String normalized = normalizeReference(raw);

        if (normalized == null) {
            System.out.println("Result: Invalid Input\n");
            return;
        }

        String result = validateAndFormat(normalized);
        System.out.println("Result: " + result + "\n");
    }

    public static void main(String[] args) {
        process("  hdf03022600042  ");
        process("12F03022600042");
        process("icici01012512345"); // wrong length (16 chars)
    }
}
