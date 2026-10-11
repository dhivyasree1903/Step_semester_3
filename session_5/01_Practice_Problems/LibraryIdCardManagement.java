public class LibraryIdCardManagement {

    // Model class representing a library ID card
    static class IdCard {
        String name;
        int booksIssued;

        public IdCard(String name, int booksIssued) {
            this.name = name;
            this.booksIssued = booksIssued;
        }
    }

    public static void main(String[] args) {
        // Step 1: Create initial card object
        IdCard ravi = new IdCard("Ravi", 0);

        // Step 2: Assign reference to a second variable (alias)
        IdCard duplicate = ravi;

        // Step 3: Modify field through the duplicate reference
        duplicate.booksIssued = 3;

        // Step 4: Verify mutation visible through the original reference
        System.out.println("Ravi's booksIssued (via first variable): " + ravi.booksIssued);
        System.out.println("duplicate == ravi: " + (duplicate == ravi));

        // Step 5: Create a distinct object with identical field values
        IdCard separate = new IdCard("Ravi", 3);
        System.out.println("separate == ravi: " + (separate == ravi));
    }
}
