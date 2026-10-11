public class AttendanceSheet {

    private final String[] presentStudents;
    private int count;

    // Constructor creates a private array with maximum capacity
    public AttendanceSheet(int maxClassSize) {
        if (maxClassSize <= 0) {
            this.presentStudents = new String[0];
        } else {
            this.presentStudents = new String[maxClassSize];
        }
        this.count = 0;
    }

    // Mark a student present; ignore duplicates
    public void markPresent(String studentName) {
        if (studentName == null || studentName.trim().isEmpty()) {
            return;
        }

        // Avoid duplicate marking
        if (isPresent(studentName)) {
            return;
        }

        if (count < presentStudents.length) {
            presentStudents[count] = studentName;
            count++;
        } else {
            System.out.println("Warning: Attendance sheet is full for " + studentName);
        }
    }

    // Return the total number of distinct present students
    public int getPresentCount() {
        return count;
    }

    // Check if a specific student is marked present
    public boolean isPresent(String studentName) {
        if (studentName == null) {
            return false;
        }

        for (int i = 0; i < count; i++) {
            if (studentName.equals(presentStudents[i])) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println("--- Attendance Sheet Demo ---");
        AttendanceSheet sheet = new AttendanceSheet(30);

        sheet.markPresent("Ana");
        sheet.markPresent("Ben");
        sheet.markPresent("Ana"); // duplicate, should not increase count

        System.out.println("sheet.getPresentCount() -> " + sheet.getPresentCount());
        System.out.println("sheet.isPresent(\"Ben\") -> " + sheet.isPresent("Ben"));
        System.out.println("sheet.isPresent(\"Chen\") -> " + sheet.isPresent("Chen"));
    }
}
