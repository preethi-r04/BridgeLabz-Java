package CoreProgramming.Strings.Level2;

import java.util.Scanner;

public class RockPaperScissors {

    static String computerChoice() {
        int r = (int)(Math.random() * 3);
        return r == 0 ? "Rock" : r == 1 ? "Paper" : "Scissors";
    }

    static String findWinner(String user, String comp) {
        if (user.equals(comp)) return "Draw";
        if ((user.equals("Rock") && comp.equals("Scissors")) ||
            (user.equals("Paper") && comp.equals("Rock")) ||
            (user.equals("Scissors") && comp.equals("Paper")))
            return "User";
        return "Computer";
    }

    static String[][] calculateStats(int userWins, int compWins, int games) {
        String[][] stats = new String[2][3];
        stats[0][0] = "User";
        stats[0][1] = String.valueOf(userWins);
        stats[0][2] = String.valueOf((userWins * 100.0) / games);
        stats[1][0] = "Computer";
        stats[1][1] = String.valueOf(compWins);
        stats[1][2] = String.valueOf((compWins * 100.0) / games);
        return stats;
    }

    static void display(String[][] stats) {
        System.out.println("Player\tWins\tPercentage");
        for (String[] row : stats)
            System.out.println(row[0] + "\t" + row[1] + "\t" + row[2]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int games = sc.nextInt();
        int userWins = 0, compWins = 0;

        for (int i = 0; i < games; i++) {
            String user = sc.next();
            String comp = computerChoice();
            String winner = findWinner(user, comp);
            if (winner.equals("User")) userWins++;
            else if (winner.equals("Computer")) compWins++;
        }

        display(calculateStats(userWins, compWins, games));
        sc.close();
    }
}

