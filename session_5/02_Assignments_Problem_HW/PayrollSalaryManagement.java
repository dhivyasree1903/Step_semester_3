public class PayrollSalaryManagement {

    // Encapsulated payroll account to protect salary components
    static class PayrollAccount {
        private double basicSalary;
        private double bonus;

        // Constructor with validation for opening basic salary
        public PayrollAccount(double basicSalary) {
            if (basicSalary < 0) {
                System.out.println("Warning: Basic salary cannot be negative. Initializing to 0.0.");
                this.basicSalary = 0.0;
            } else {
                this.basicSalary = basicSalary;
            }
            this.bonus = 0.0;
        }

        // Add bonus to account with validation
        public void creditBonus(double amount) {
            if (amount <= 0) {
                System.out.println("Credit rejected: Bonus amount must be positive.");
                return;
            }
            this.bonus += amount;
            System.out.println("Bonus credited: Rs " + amount);
        }

        // Deduct tax percentage from basic salary
        public void deductTax(double percent) {
            if (percent < 0 || percent > 100) {
                System.out.println("Deduction rejected: Tax percentage must be between 0 and 100.");
                return;
            }
            double taxAmount = this.basicSalary * (percent / 100.0);
            this.basicSalary -= taxAmount;
            System.out.printf("Tax deducted: %.0f%%\n", percent);
        }

        // Read-only getter calculating net salary
        public double getNetSalary() {
            return this.basicSalary + this.bonus;
        }
    }

    public static void main(String[] args) {
        System.out.println("--- Payroll Salary Test ---");
        PayrollAccount account = new PayrollAccount(50000);

        account.creditBonus(5000);
        account.deductTax(10);

        System.out.println("Net salary: Rs " + account.getNetSalary());
    }
}
