public class HostelMessWalletManagement {

    // Encapsulated wallet class to manage hostel mess card balance
    static class MessWallet {
        private double balance;

        // Constructor with validation for opening balance
        public MessWallet(double openingBalance) {
            if (openingBalance < 0) {
                System.out.println("Warning: Opening balance cannot be negative. Setting balance to 0.0.");
                this.balance = 0.0;
            } else {
                this.balance = openingBalance;
            }
        }

        // Add funds to wallet
        public void topUp(double amount) {
            if (amount <= 0) {
                System.out.println("Top-up rejected: Amount must be greater than 0.");
                return;
            }
            this.balance += amount;
            System.out.println("Balance after top-up: " + this.balance);
        }

        // Deduct funds with balance protection
        public void deduct(double amount) {
            if (amount <= 0) {
                System.out.println("Deduct rejected: Amount must be greater than 0.");
                return;
            }
            if (amount > this.balance) {
                System.out.println("Deduct rejected: insufficient balance");
                return;
            }
            this.balance -= amount;
            System.out.println("Deduct successful: " + amount + " deducted.");
        }

        // Read-only getter for balance
        public double getBalance() {
            return this.balance;
        }
    }

    public static void main(String[] args) {
        System.out.println("--- Mess Wallet Test ---");
        MessWallet wallet = new MessWallet(500);

        wallet.topUp(200);
        wallet.deduct(1000);

        System.out.println("Final balance: " + wallet.getBalance());
    }
}
