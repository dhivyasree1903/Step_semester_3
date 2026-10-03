public class StringMethods {
    // Method accepting string parameter
    public static void printGreeting(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // Method returning modified string
    public static String formatName(String firstName, String lastName) {
        return lastName.toUpperCase() + ", " + firstName;
    }

    // Method with string array parameter
    public static void printAllNames(String[] names) {
        for (int i = 0; i < names.length; i++) {
            if (names[i] != null) {
                printGreeting(names[i]);
            }
        }
    }

    // Demonstrating pass-by-value and immutability
    public static void tryToModify(String str) {
        System.out.println("Inside method before modify: " + str);
        str = "Modified";
        System.out.println("Inside method after modify: " + str);
    }

    // Multiple parameters with StringBuilder
    public static String buildAddress(String street, String city, String state, String zip) {
        StringBuilder address = new StringBuilder();
        address.append(street).append(", ")
               .append(city).append(", ")
               .append(state).append(" ")
               .append(zip);
        return address.toString();
    }

    // Safe null handling
    public static String safeConcat(String str1, String str2) {
        if (str1 == null) str1 = "";
        if (str2 == null) str2 = "";
        return str1 + str2;
    }

    // Varargs method
    public static String joinStrings(String delimiter, String... strings) {
        if (strings == null || strings.length == 0) return "";
        StringBuilder result = new StringBuilder(strings[0]);
        for (int i = 1; i < strings.length; i++) {
            result.append(delimiter).append(strings[i]);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        printGreeting("Alice");
        String formatted = formatName("John", "Doe");
        System.out.println("Formatted: " + formatted);

        String[] team = {"Alice", "Bob", "Charlie"};
        printAllNames(team);

        String original = "Original";
        System.out.println("\nBefore tryToModify: " + original);
        tryToModify(original);
        System.out.println("After tryToModify (original still unchanged): " + original);

        String address = buildAddress("123 Main St", "Anytown", "CA", "12345");
        System.out.println("\nBuilt Address: " + address);

        String result = safeConcat("Hello", null);
        System.out.println("Safe Concat with null: '" + result + "'");

        String joined = joinStrings(" - ", "Java", "Python", "JavaScript");
        System.out.println("Joined with delimiter: " + joined);
    }
}
