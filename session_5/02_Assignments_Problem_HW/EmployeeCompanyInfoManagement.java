public class EmployeeCompanyInfoManagement {

    // Employee class demonstrating static members for shared company data
    static class Employee {
        String empName;
        double salary;

        // Static fields shared across all employee instances
        static String companyName = "Bright Horizon Technologies";
        static int employeeCount = 0;

        // Constructor sets instance fields and tracks total count
        public Employee(String empName, double salary) {
            this.empName = empName;
            this.salary = salary;
            employeeCount++;
        }

        // Static method operating strictly on static fields
        public static void printCompanyInfo() {
            System.out.println(companyName);
            System.out.println("Employees on record: " + employeeCount);
        }
    }

    public static void main(String[] args) {
        // Create three employee objects
        Employee emp1 = new Employee("Rajesh", 55000);
        Employee emp2 = new Employee("Meera", 62000);
        Employee emp3 = new Employee("Siddharth", 71000);

        System.out.println("3 Employee objects created\n");

        // Invoke static method using the class name
        Employee.printCompanyInfo();
    }
}
