/**
 * Problem 4: Masked Phone Number Formatter
 * Scenario: Student-support call center phone privacy
 */
public class MaskedPhoneNumberFormatter {

    public static String maskPhoneNumber(String phone) {
        if (phone == null || phone.length() != 10) {
            return "Invalid phone number";
        }

        // Validate all characters are digits
        for (int i = 0; i < phone.length(); i++) {
            if (!Character.isDigit(phone.charAt(i))) {
                return "Invalid phone number";
            }
        }

        // Build masked string: "XXXXXX" + last 4 digits
        StringBuilder sb = new StringBuilder("XXXXXX");
        sb.append(phone.substring(6)); // append last 4 digits

        // Insert '-' between mask and last 4 digits
        sb.insert(6, "-");

        return sb.toString();
    }

    public static void main(String[] args) {
        String phone1 = "9876543210";
        System.out.println("Input: \"" + phone1 + "\" -> Output: " + maskPhoneNumber(phone1));

        String phone2 = "98765";
        System.out.println("Input: \"" + phone2 + "\" -> Output: " + maskPhoneNumber(phone2));

        String phone3 = "987654321A";
        System.out.println("Input: \"" + phone3 + "\" -> Output: " + maskPhoneNumber(phone3));
    }
}
