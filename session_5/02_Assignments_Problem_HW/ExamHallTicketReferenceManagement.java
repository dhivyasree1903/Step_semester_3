public class ExamHallTicketReferenceManagement {

    // HallTicket class demonstrating object reference semantics
    static class HallTicket {
        String studentName;
        int seatNumber;

        public HallTicket(String studentName, int seatNumber) {
            this.studentName = studentName;
            this.seatNumber = seatNumber;
        }
    }

    public static void main(String[] args) {
        // Step 1: Create original hall ticket object
        HallTicket priya = new HallTicket("Priya", 0);

        // Step 2: Assign reference to copy variable (same object in heap)
        HallTicket copy = priya;

        // Step 3: Mutate state via copy reference
        copy.seatNumber = 45;

        // Step 4: Verify mutation reflected through original reference
        System.out.println("Priya's seatNumber (via first variable): " + priya.seatNumber);
        System.out.println("copy == priya: " + (copy == priya));

        // Step 5: Create a new separate object with identical values
        HallTicket separate = new HallTicket("Priya", 45);
        System.out.println("separate == priya: " + (separate == priya));
    }
}
