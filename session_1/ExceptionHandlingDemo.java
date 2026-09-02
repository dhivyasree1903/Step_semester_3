import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        System.out.println("=== 1. Unchecked Exception (ArithmeticException) ===");
        try {
            int divideByZero = 5 / 0;
            System.out.println("Result: " + divideByZero);
        } catch (ArithmeticException e) {
            System.out.println("ArithmeticException caught => " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Generic Exception caught => " + e.getMessage());
        }

        System.out.println("\n=== 2. Checked Exception (FileNotFoundException) ===");
        try {
            File file = new File("non_existent_file.txt");
            Scanner sc = new Scanner(file);
            while (sc.hasNextLine()) {
                System.out.println(sc.nextLine());
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("FileNotFoundException occurred: Target file does not exist.");
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }

        System.out.println("\n=== 3. Checked Exception Handling with IOException ===");
        try {
            File file = new File("non_existent_file_io.txt");
            Scanner sc = new Scanner(file);
            sc.close();
        } catch (IOException e) {
            System.out.println("IOException occurred: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Exception occurred: " + e.getMessage());
        }
    }
}
