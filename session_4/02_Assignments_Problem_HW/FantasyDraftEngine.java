import java.util.Arrays;

public class FantasyDraftEngine {

    // Player model implementing Comparable for descending ranking by batting average
    public static class Player implements Comparable<Player> {
        private String name;
        private int matchesPlayed;
        private double battingAverage;
        private boolean isInjured;

        public Player(String name, int matchesPlayed, double battingAverage, boolean isInjured) {
            this.name = name;
            this.matchesPlayed = matchesPlayed;
            this.battingAverage = battingAverage;
            this.isInjured = isInjured;
        }

        public String getName() {
            return name;
        }

        public int getMatchesPlayed() {
            return matchesPlayed;
        }

        public double getBattingAverage() {
            return battingAverage;
        }

        public boolean isInjured() {
            return isInjured;
        }

        @Override
        public int compareTo(Player other) {
            // Descending order by batting average
            return Double.compare(other.getBattingAverage(), this.getBattingAverage());
        }

        @Override
        public String toString() {
            return String.format("%s (Matches: %d, Avg: %.2f, Injured: %b)",
                    name, matchesPlayed, battingAverage, isInjured);
        }
    }

    // Overloaded check: based only on match experience (minimum 10 matches)
    public static boolean isDraftable(int matchesPlayed) {
        return matchesPlayed >= 10;
    }

    // Overloaded check: considers injury status for players with at least 5 matches
    public static boolean isDraftable(int matchesPlayed, boolean isInjured) {
        return matchesPlayed >= 10 || (matchesPlayed >= 5 && !isInjured);
    }

    // Filter draftable players and rank them in descending order of batting average
    public static Player[] draftAndRank(Player[] players) {
        if (players == null || players.length == 0) {
            return new Player[]{};
        }

        // Count eligible players
        int count = 0;
        for (Player p : players) {
            if (isDraftable(p.getMatchesPlayed(), p.isInjured())) {
                count++;
            }
        }

        // Populate draftable array
        Player[] drafted = new Player[count];
        int index = 0;
        for (Player p : players) {
            if (isDraftable(p.getMatchesPlayed(), p.isInjured())) {
                drafted[index++] = p;
            }
        }

        // Sort by batting average descending
        Arrays.sort(drafted);
        return drafted;
    }

    public static void main(String[] args) {
        Player[] roster = {
            new Player("Virat", 15, 52.4, false),   // Eligible: 15 matches (>= 10)
            new Player("Rohit", 12, 48.7, true),    // Eligible: 12 matches (>= 10 even if injured)
            new Player("Rishabh", 7, 45.0, false),  // Eligible: 7 matches (>= 5 and not injured)
            new Player("Hardik", 6, 38.2, true),    // Ineligible: 6 matches but injured
            new Player("Shubman", 3, 42.0, false)   // Ineligible: only 3 matches (< 5)
        };

        Player[] draftBoard = draftAndRank(roster);

        System.out.println("Drafted & Ranked Players:");
        for (int i = 0; i < draftBoard.length; i++) {
            System.out.println((i + 1) + ". " + draftBoard[i]);
        }
    }
}
