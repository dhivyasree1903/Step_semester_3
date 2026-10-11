/**
 * Problem 1: ATM PIN Length Validator
 * Scenario: An ATM application checks customer PIN length before proceeding.
 */
public class AtmPinValidator {

    /**
     * Validates whether the provided PIN is exactly 4 characters long.
     * @param pin The PIN string entered by user
     */
    public static void checkPinLength(String pin) {
        if (pin == null) {
            System.out.println("Invalid PIN — must be exactly 4 digits.");
            return;
        }

        // Basic check: length() and single if/else (no loops required)
        if (pin.length() != 4) {
            System.out.println("Invalid PIN — must be exactly 4 digits.");
        } else {
            System.out.println("PIN length OK.");
        }
    }

    public static void main(String[] args) {
        String test1 = "482";
        System.out.print("Input: \"" + test1 + "\" -> ");
        checkPinLength(test1);

        String test2 = "4820";
        System.out.print("Input: \"" + test2 + "\" -> ");
        checkPinLength(test2);

        String test3 = "12345";
        System.out.print("Input: \"" + test3 + "\" -> ");
        checkPinLength(test3);
    }
}
