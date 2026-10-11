import java.util.Arrays;

public class PlacementDriveRankingEngine {

    // Candidate model implementing Comparable for descending ranking
    public static class Candidate implements Comparable<Candidate> {
        private String name;
        private double cgpa;
        private int codingScore;

        public Candidate(String name, double cgpa, int codingScore) {
            this.name = name;
            this.cgpa = cgpa;
            this.codingScore = codingScore;
        }

        public String getName() {
            return name;
        }

        public double getCgpa() {
            return cgpa;
        }

        public int getCodingScore() {
            return codingScore;
        }

        // Composite score = (CGPA * 10.0) + (codingScore * 0.5)
        public double getCompositeScore() {
            return (cgpa * 10.0) + (codingScore * 0.5);
        }

        @Override
        public int compareTo(Candidate other) {
            // Descending order by composite score
            return Double.compare(other.getCompositeScore(), this.getCompositeScore());
        }

        @Override
        public String toString() {
            return String.format("%s (CGPA: %.1f, Coding: %d, Composite: %.2f)",
                    name, cgpa, codingScore, getCompositeScore());
        }
    }

    // Overloaded eligibility check: CGPA only (cutoff 7.5)
    public static boolean isEligible(double cgpa) {
        return cgpa >= 7.5;
    }

    // Overloaded eligibility check: CGPA and coding score (cutoff 6.5 and 50)
    public static boolean isEligible(double cgpa, int codingScore) {
        return cgpa >= 6.5 && codingScore >= 50;
    }

    // Filters eligible candidates and ranks them by composite score
    public static Candidate[] shortlistAndRank(Candidate[] candidates) {
        if (candidates == null || candidates.length == 0) {
            return new Candidate[]{};
        }

        // Count eligible candidates
        int count = 0;
        for (Candidate c : candidates) {
            if (isEligible(c.getCgpa(), c.getCodingScore())) {
                count++;
            }
        }

        // Populate eligible array
        Candidate[] shortlisted = new Candidate[count];
        int index = 0;
        for (Candidate c : candidates) {
            if (isEligible(c.getCgpa(), c.getCodingScore())) {
                shortlisted[index++] = c;
            }
        }

        // Sort using Comparable implementation
        Arrays.sort(shortlisted);
        return shortlisted;
    }

    public static void main(String[] args) {
        Candidate[] pool = {
            new Candidate("Aarav", 8.2, 70),   // Eligible: (82.0 + 35.0) = 117.0
            new Candidate("Bhavna", 6.2, 90),  // Ineligible (CGPA < 6.5)
            new Candidate("Chetan", 7.0, 85),  // Eligible: (70.0 + 42.5) = 112.5
            new Candidate("Divya", 9.1, 95),   // Eligible: (91.0 + 47.5) = 138.5
            new Candidate("Eshan", 6.8, 40)    // Ineligible (coding < 50)
        };

        Candidate[] ranked = shortlistAndRank(pool);

        System.out.println("Shortlisted & Ranked Candidates:");
        for (int i = 0; i < ranked.length; i++) {
            System.out.println((i + 1) + ". " + ranked[i]);
        }
    }
}
