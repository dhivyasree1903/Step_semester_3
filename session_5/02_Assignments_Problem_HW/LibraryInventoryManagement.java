public class LibraryInventoryManagement {

    // Model class representing a library book's inventory
    static class BookInventory {
        String title;
        String author;
        int copiesAvailable;

        // Constructor to initialize book inventory fields
        public BookInventory(String title, String author, int copiesAvailable) {
            this.title = title;
            this.author = author;
            this.copiesAvailable = copiesAvailable;
        }

        // Print formatted book details
        public void printEntry() {
            System.out.printf("%s by %s - %d copies available\n", title, author, copiesAvailable);
        }
    }

    public static void main(String[] args) {
        // Create four BookInventory objects
        BookInventory book1 = new BookInventory("Clean Code", "Robert C. Martin", 3);
        BookInventory book2 = new BookInventory("Effective Java", "Joshua Bloch", 5);
        BookInventory book3 = new BookInventory("Refactoring", "Martin Fowler", 0);
        BookInventory book4 = new BookInventory("Design Patterns", "GoF", 2);

        // Store them in an array
        BookInventory[] inventory = {book1, book2, book3, book4};

        // Print each entry using a loop
        System.out.println("--- Library Inventory ---");
        for (BookInventory item : inventory) {
            item.printEntry();
        }
    }
}
