/**
 * Problem 2: CSV Student Record Parser
 * Scenario: T&P team student registration parser
 */
public class CsvStudentRecordParser {

    public static void parseStudentRecord(String csvLine) {
        if (csvLine == null) {
            System.out.println("Invalid Record");
            return;
        }

        String[] fields = csvLine.split(",");

        // Validate that exactly 3 fields are present
        if (fields.length != 3) {
            System.out.println("Invalid Record");
            return;
        }

        String name = fields[0].trim();
        String rollNo = fields[1].trim();
        String dept = fields[2].trim();

        System.out.println("Name: " + name + " | Roll No: " + rollNo + " | Dept: " + dept);
    }

    public static void main(String[] args) {
        String test1 = "Ananya Verma,RA2211003010123,CSE";
        System.out.println("Test 1: \"" + test1 + "\"");
        parseStudentRecord(test1);

        String test2 = "Ananya Verma,CSE";
        System.out.println("\nTest 2: \"" + test2 + "\"");
        parseStudentRecord(test2);
    }
}
