public class StudentPlacementRecordManagement {

    // Model class representing a single student's placement record
    static class PlacementRecord {
        String studentName;
        String company;
        double packageLpa;

        // Constructor to initialize all fields
        public PlacementRecord(String studentName, String company, double packageLpa) {
            this.studentName = studentName;
            this.company = company;
            this.packageLpa = packageLpa;
        }

        // Print one formatted record line
        public void printRecord() {
            System.out.printf("%s -> %s @ %.1f LPA\n", studentName, company, packageLpa);
        }
    }

    public static void main(String[] args) {
        // Create three placement records
        PlacementRecord record1 = new PlacementRecord("Ravi", "TCS", 4.5);
        PlacementRecord record2 = new PlacementRecord("Anitha", "Zoho", 6.2);
        PlacementRecord record3 = new PlacementRecord("Karthik", "Infosys", 4.0);

        // Store them in an array of PlacementRecord objects
        PlacementRecord[] placements = {record1, record2, record3};

        // Print each record using a loop
        System.out.println("--- Student Placement Records ---");
        for (PlacementRecord record : placements) {
            record.printRecord();
        }
    }
}
