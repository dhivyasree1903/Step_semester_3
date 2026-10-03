public class StringCreationDemo {
    public static void main(String[] args) {
        // Method 1: String Literal (stored in String Pool)
        String str1 = "Hello";
        String str2 = "Hello";

        // Method 2: new keyword (stored in Heap, bypasses pool)
        String str3 = new String("Hello");

        System.out.println("--- String Pool vs Heap ---");
        System.out.println("str1 == str2 (Same reference in pool): " + (str1 == str2)); // true
        System.out.println("str1 == str3 (Different memory locations): " + (str1 == str3)); // false
        System.out.println("str1.equals(str3) (Value comparison): " + str1.equals(str3)); // true

        // Immutability demonstration
        System.out.println("\n--- Immutability ---");
        String original = "Hello";
        String modified = original.concat(" World");
        System.out.println("Original string (unchanged): " + original);
        System.out.println("Modified string (new object): " + modified);

        // Method 3: From Character Array
        System.out.println("\n--- From Character Array ---");
        char[] charArray = {'J', 'a', 'v', 'a'};
        String fromArray = new String(charArray);
        String partial = new String(charArray, 1, 3); // "ava"
        System.out.println("From char array: " + fromArray);
        System.out.println("Partial char array (offset 1, count 3): " + partial);

        // Method 4: StringBuilder (Mutable sequence)
        System.out.println("\n--- StringBuilder (Mutable) ---");
        StringBuilder sb = new StringBuilder();
        sb.append("Hello").append(" ").append("World").append("!");
        String result = sb.toString();
        System.out.println("StringBuilder result: " + result);
    }
}
