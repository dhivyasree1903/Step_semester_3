public class Locker {

    private final int lockerNumber;
    private String combinationCode;

    // Constructor initializes fixed locker number and initial code
    public Locker(int lockerNumber, String initialCode) {
        this.lockerNumber = lockerNumber;
        this.combinationCode = initialCode;
    }

    public int getLockerNumber() {
        return lockerNumber;
    }

    // Change combination code with verification; no getter exists for the code
    public boolean changeCode(String currentCode, String newCode) {
        if (combinationCode != null && combinationCode.equals(currentCode)) {
            this.combinationCode = newCode;
            System.out.println("changeCode(" + currentCode + ", " + newCode + ") -> success");
            return true;
        } else {
            System.out.println("changeCode(" + currentCode + ", " + newCode + ") -> rejected, code is unchanged");
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println("--- Gym Locker Demo ---");
        Locker l = new Locker(101, "1234");

        l.changeCode("1234", "5678");
        l.changeCode("0000", "9999");
    }
}
