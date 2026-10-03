import java.util.Arrays;

public class StringArrayDemo {
    public static void main(String[] args) {
        String[] languages = {"Java", "Python", "C++", "JavaScript"};

        // Length of array (property, not method)
        System.out.println("Array length: " + languages.length);

        // Traditional iteration with index access
        System.out.println("\n--- Traditional For Loop ---");
        for (int i = 0; i < languages.length; i++) {
            System.out.println("Language " + (i + 1) + ": " + languages[i]);
        }

        // Enhanced for loop (for-each) - read-only
        System.out.println("\n--- Enhanced For-Each Loop ---");
        for (String lang : languages) {
            System.out.println("Programming language: " + lang);
        }

        // Array bounds checking
        System.out.println("\n--- Array Bounds Checking ---");
        try {
            System.out.println(languages[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: Index 10 out of bounds for length " + languages.length);
        }

        // Advanced Array Operations
        System.out.println("\n--- Advanced Array Operations (java.util.Arrays) ---");
        String[] original = {"A", "B", "C"};
        String[] copy = Arrays.copyOf(original, original.length);
        String[] partial = Arrays.copyOfRange(original, 1, 3);
        System.out.println("Original: " + Arrays.toString(original));
        System.out.println("Copy: " + Arrays.toString(copy));
        System.out.println("Partial Copy: " + Arrays.toString(partial));
        System.out.println("Arrays.equals(original, copy): " + Arrays.equals(original, copy));

        String[] unsorted = {"Zebra", "Apple", "Banana"};
        Arrays.sort(unsorted);
        System.out.println("Sorted array: " + Arrays.toString(unsorted));

        int index = Arrays.binarySearch(unsorted, "Banana");
        System.out.println("Binary Search index for 'Banana': " + index);
    }
}
