public class StringBasicsDemo {
    public static void main(String[] args) {
        System.out.println("=== Topic 1: String Pool & Immutability ===");

        // Two identical literals share ONE object in the String Pool
        String a = "Java";
        String b = "Java";
        System.out.println("a == b (Same pool reference): " + (a == b)); // true

        // 'new' explicitly creates a separate object in Heap memory
        String c = new String("Java");
        System.out.println("a == c (Different memory objects): " + (a == c)); // false

        // .equals() compares the actual text content
        System.out.println("a.equals(c) (Content comparison): " + a.equals(c)); // true

        // Strings are immutable: original "Hello" is never modified
        String greeting = "Hello";
        greeting = greeting + " World"; // Creates a brand-new String object
        System.out.println("Updated greeting: " + greeting); // Hello World
    }
}
