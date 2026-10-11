public class NameTag {

    // Immutable fields set once at construction
    private final String firstName;
    private final String lastName;

    // Splits full name once in constructor and stores components immutably
    public NameTag(String fullName) {
        if (fullName == null || fullName.trim().isEmpty()) {
            this.firstName = "";
            this.lastName = "";
        } else {
            String[] parts = fullName.trim().split(" ");
            this.firstName = parts[0];
            this.lastName = (parts.length > 1) ? parts[1] : "";
        }
    }

    // Build and return the nickname (e.g., "Maria G.")
    public String getNickname() {
        if (firstName.isEmpty()) {
            return "";
        }
        if (lastName.isEmpty()) {
            return firstName;
        }
        return firstName + " " + lastName.charAt(0) + ".";
    }

    public static void main(String[] args) {
        System.out.println("--- Name Tag Demo ---");
        NameTag tag = new NameTag("Maria Gomez");
        System.out.println("tag.getNickname() -> " + tag.getNickname());

        NameTag tag2 = new NameTag("Rahul Dravid");
        System.out.println("tag2.getNickname() -> " + tag2.getNickname());
    }
}
