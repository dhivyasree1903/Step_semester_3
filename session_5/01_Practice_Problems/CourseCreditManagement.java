public class CourseCreditManagement {

    // Course class demonstrating constructor chaining with this(...)
    static class Course {
        String code;
        String title;
        int credits;
        int labCredits;

        // Master constructor setting all four fields
        public Course(String code, String title, int credits, int labCredits) {
            this.code = code;
            this.title = title;
            this.credits = credits;
            this.labCredits = labCredits;
        }

        // Overloaded constructor for theory-only courses (labCredits = 0)
        public Course(String code, String title, int credits) {
            this(code, title, credits, 0); // Chains to four-parameter constructor
        }

        // Calculate total credits
        public int totalCredits() {
            return this.credits + this.labCredits;
        }
    }

    public static void main(String[] args) {
        // Theory-only course using 3-argument constructor
        Course theoryCourse = new Course("21CSC201J", "Data Structures", 4);

        // Course with separate lab component using 4-argument constructor
        Course labCourse = new Course("21CSC205L", "DSA Lab", 3, 1);

        System.out.println(theoryCourse.code + " total credits: " + theoryCourse.totalCredits());
        System.out.println(labCourse.code + " total credits: " + labCourse.totalCredits());
    }
}
