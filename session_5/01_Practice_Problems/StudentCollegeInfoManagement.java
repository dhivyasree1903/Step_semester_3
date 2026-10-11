public class StudentCollegeInfoManagement {

    // Student class demonstrating static fields and static methods
    static class Student {
        String name;
        double attendance;

        // Static fields shared across all student instances
        static String collegeName = "SRM Institute of Science and Technology";
        static int studentCount = 0;

        // Constructor increments static studentCount upon every instantiation
        public Student(String name, double attendance) {
            this.name = name;
            this.attendance = attendance;
            studentCount++;
        }

        // Static method accessing only static context
        public static void printCollegeInfo() {
            System.out.println("College: " + collegeName);
            System.out.println("Total Students Enrolled: " + studentCount);
        }
    }

    public static void main(String[] args) {
        // Create two student objects
        Student s1 = new Student("Pooja", 88.5);
        Student s2 = new Student("Varun", 92.0);

        System.out.println("2 Student objects created.\n");

        // Call static method via class name directly
        Student.printCollegeInfo();
    }
}
