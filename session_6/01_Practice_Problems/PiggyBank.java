public class PiggyBank {

    private final String id;
    private double savings;

    // Constructor initializing final ID and starting savings at 0
    public PiggyBank(String id) {
        this.id = id;
        this.savings = 0.0;
    }

    public String getId() {
        return id;
    }

    // Read-only getter for savings; no direct setter exists
    public double getSavings() {
        return savings;
    }

    // Add money to the piggy bank
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit rejected: Amount must be positive.");
            return;
        }
        savings += amount;
        System.out.println("deposit(" + amount + ") -> savings = " + savings);
    }

    // Withdraw money only if sufficient funds exist
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal rejected: Amount must be positive.");
            return;
        }
        if (amount > savings) {
            System.out.println("withdraw(" + amount + ") -> rejected, savings stays " + savings);
            return;
        }
        savings -= amount;
        System.out.println("withdraw(" + amount + ") -> savings = " + savings);
    }

    public static void main(String[] args) {
        System.out.println("--- Piggy Bank Demo ---");
        PiggyBank pb = new PiggyBank("PB-1");

        pb.deposit(100);
        pb.withdraw(30);
        pb.withdraw(500);

        System.out.println("Final savings in " + pb.getId() + ": " + pb.getSavings());
    }
}
