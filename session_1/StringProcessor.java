public class StringProcessor {
    // Method overloading - same name, different parameters
    public static String process(String input) {
        return input == null ? "" : input.trim().toLowerCase();
    }

    public static String process(String input, boolean uppercase) {
        if (input == null) return "";
        String processed = input.trim();
        return uppercase ? processed.toUpperCase() : processed.toLowerCase();
    }

    public static String process(String input, String prefix, String suffix) {
        if (input == null) return "";
        return prefix + input.trim() + suffix;
    }

    public static void main(String[] args) {
        String text = "  Hello Java Developers!  ";
        System.out.println("Default process (trim & lowercase): " + process(text));
        System.out.println("Uppercase process: " + process(text, true));
        System.out.println("Custom wrap process: " + process(text, "[START] ", " [END]"));
    }
}
