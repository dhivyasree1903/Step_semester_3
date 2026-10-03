import java.util.Random;

public class RockPaperScissors {
    public static final String[] MOVES = {"Rock", "Paper", "Scissors"};

    public static String playRound(String playerMove, String computerMove) {
        if (playerMove.equalsIgnoreCase(computerMove)) return "Draw";
        switch (playerMove.toLowerCase()) {
            case "rock": return computerMove.equalsIgnoreCase("Scissors") ? "Player Wins" : "Computer Wins";
            case "paper": return computerMove.equalsIgnoreCase("Rock") ? "Player Wins" : "Computer Wins";
            case "scissors": return computerMove.equalsIgnoreCase("Paper") ? "Player Wins" : "Computer Wins";
            default: return "Invalid Move";
        }
    }

    public static void main(String[] args) {
        int rounds = 5;
        Random random = new Random();
        String[] playerMoves = {"Rock", "Paper", "Scissors", "Rock", "Paper"};
        String[] computerMoves = new String[rounds];
        String[] results = new String[rounds];
        int wins = 0, losses = 0, draws = 0;

        for (int i = 0; i < rounds; i++) {
            computerMoves[i] = MOVES[random.nextInt(MOVES.length)];
            results[i] = playRound(playerMoves[i], computerMoves[i]);
            if (results[i].equals("Player Wins")) wins++;
            else if (results[i].equals("Computer Wins")) losses++;
            else if (results[i].equals("Draw")) draws++;
        }

        System.out.println("=================================================================");
        System.out.printf("%-10s | %-15s | %-15s | %-15s%n", "Round", "Player Move", "Computer Move", "Result");
        System.out.println("=================================================================");
        for (int i = 0; i < rounds; i++) {
            System.out.printf("Round %-4d | %-15s | %-15s | %-15s%n", (i + 1), playerMoves[i], computerMoves[i], results[i]);
        }
        System.out.println("=================================================================");
        double winPercentage = (wins * 100.0) / rounds;
        System.out.printf("Wins: %d | Losses: %d | Draws: %d | Win %% = %.1f%%%n", wins, losses, draws, winPercentage);
    }
}