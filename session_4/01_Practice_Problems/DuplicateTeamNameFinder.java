public class DuplicateTeamNameFinder {

    // Find the first duplicate team name using nested loops
    public static String findDuplicateTeam(String[] teamNames) {
        if (teamNames == null || teamNames.length < 2) {
            return "No Duplicates";
        }

        for (int i = 0; i < teamNames.length; i++) {
            for (int j = i + 1; j < teamNames.length; j++) {
                if (teamNames[i] != null && teamNames[i].equals(teamNames[j])) {
                    return teamNames[i]; // Early exit on first duplicate
                }
            }
        }

        return "No Duplicates";
    }

    public static void main(String[] args) {
        String[] teams1 = {"ByteBandits", "CodeCrushers", "ByteBandits", "DataDevs"};
        System.out.println("Teams: [ByteBandits, CodeCrushers, ByteBandits, DataDevs]");
        System.out.println("Duplicate Found: " + findDuplicateTeam(teams1));

        String[] teams2 = {"TeamAlpha", "TeamBeta", "TeamGamma"};
        System.out.println("\nTeams: [TeamAlpha, TeamBeta, TeamGamma]");
        System.out.println("Duplicate Found: " + findDuplicateTeam(teams2));
    }
}
