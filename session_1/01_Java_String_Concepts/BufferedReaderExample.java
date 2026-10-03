import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;

public class BufferedReaderExample {
    public static void main(String[] args) throws IOException {
        // Demonstrating BufferedReader with sample in-memory stream
        String sampleData = "Java Programming\n21\n";
        try (BufferedReader reader = new BufferedReader(new StringReader(sampleData))) {
            System.out.println("Reading simulated input stream:");
            String sentence = reader.readLine();
            String ageStr = reader.readLine();
            int age = Integer.parseInt(ageStr);

            System.out.println("Sentence: " + sentence);
            System.out.println("Parsed Age: " + age);
        }

        System.out.println("\nStandard Console Usage Pattern:");
        System.out.println("BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in));");
        System.out.println("String line = consoleReader.readLine();");
    }
}
