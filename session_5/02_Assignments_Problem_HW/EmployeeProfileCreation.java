public class EmployeeProfileCreation {

    // Employee class demonstrating constructor overloading and chaining
    static class Employee {
        String empId;
        String empName;
        double salary;
        boolean isIntern;

        // Constructor for permanent employees
        public Employee(String empId, String empName, double salary) {
            this.empId = empId;
            this.empName = empName;
            this.salary = salary;
            this.isIntern = false;
        }

        // Overloaded constructor for interns chaining to the 3-arg constructor
        public Employee(String empId, String empName) {
            this(empId, empName, 0.0);
            this.isIntern = true; // Mark specifically as intern
        }

        // Print employee profile details
        public void printProfile() {
            System.out.printf("%s | %s | Rs %.1f | Intern: %b\n", empId, empName, salary, isIntern);
        }
    }

    public static void main(String[] args) {
        // Permanent employee
        Employee permanent = new Employee("E-101", "Divya", 65000);

        // Intern
        Employee intern = new Employee("E-102", "Arjun");

        System.out.println("--- Employee Profiles ---");
        permanent.printProfile();
        intern.printProfile();
    }
}
