import java.util.Scanner;

public class StringInput {
    public static void main(String[] args) {
        // Scanner with token parsing
        System.out.println("--- Scanner Token Parsing Example ---");
        Scanner parser = new Scanner("John,25,Engineer");
        parser.useDelimiter(",");
        String tokenName = parser.next();
        int tokenAge = parser.nextInt();
        String tokenJob = parser.next();
        System.out.println("Parsed Name: " + tokenName);
        System.out.println("Parsed Age: " + tokenAge);
        System.out.println("Parsed Job: " + tokenJob);
        parser.close();

        // Demonstrating input validation mechanics
        System.out.println("\n--- Interactive Input Validation Mechanics ---");
        String sampleInput = "invalid_age 25 John Doe\n";
        try (Scanner scanner = new Scanner(sampleInput)) {
            System.out.println("Simulating input: 'invalid_age 25 John Doe'");
            while (!scanner.hasNextInt() && scanner.hasNext()) {
                String invalid = scanner.next();
                System.out.println("Consumed invalid token: " + invalid);
            }
            if (scanner.hasNextInt()) {
                int age = scanner.nextInt();
                System.out.println("Successfully validated age: " + age);
            }
            String remaining = scanner.nextLine().trim();
            System.out.println("Remaining line: " + remaining);
        }
    }
}
