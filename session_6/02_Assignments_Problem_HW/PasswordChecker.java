public class PasswordChecker {

    private final String password;

    // Password is set once at construction and cannot be changed or retrieved
    public PasswordChecker(String password) {
        this.password = (password == null) ? "" : password;
    }

    // Evaluates password strength without exposing the raw password string
    public String getStrength() {
        int len = password.length();

        if (len < 6) {
            return "Weak";
        } else if (len <= 9) {
            return "Medium";
        } else {
            return "Strong";
        }
    }

    public static void main(String[] args) {
        System.out.println("--- Password Checker Demo ---");
        PasswordChecker pc1 = new PasswordChecker("abcd");
        System.out.println("Password ('abcd') strength: " + pc1.getStrength());

        PasswordChecker pc2 = new PasswordChecker("secret12");
        System.out.println("Password ('secret12') strength: " + pc2.getStrength());

        PasswordChecker pc3 = new PasswordChecker("abcdefghij");
        System.out.println("Password ('abcdefghij') strength: " + pc3.getStrength());
    }
}
