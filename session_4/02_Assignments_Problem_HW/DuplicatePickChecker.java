import java.util.Arrays;

public class DuplicatePickChecker {

    // Check for duplicate drafted players using nested loops without Collections
    public static String findDuplicatePick(String[] playerNames) {
        if (playerNames == null || playerNames.length < 2) {
            return "No Duplicates";
        }

        for (int i = 0; i < playerNames.length; i++) {
            for (int j = i + 1; j < playerNames.length; j++) {
                if (playerNames[i] != null && playerNames[i].equals(playerNames[j])) {
                    return playerNames[i];
                }
            }
        }

        return "No Duplicates";
    }

    public static void main(String[] args) {
        String[] lineup1 = {"Kohli", "Dhoni", "Sharma", "Dhoni"};
        System.out.println("Lineup: " + Arrays.toString(lineup1));
        System.out.println("Duplicate Pick: " + findDuplicatePick(lineup1));

        String[] lineup2 = {"Rahul", "Bumrah", "Pant"};
        System.out.println("\nLineup: " + Arrays.toString(lineup2));
        System.out.println("Duplicate Pick: " + findDuplicatePick(lineup2));
    }
}
