package CoreProgramming.Strings.Level2;

import java.util.Scanner;

public class VotingEligibility {

    static int[] generateAges(int n) {
        int[] ages = new int[n];
        for (int i = 0; i < n; i++)
            ages[i] = (int)(Math.random() * 90) + 10;
        return ages;
    }

    static String[][] checkVoting(int[] ages) {
        String[][] res = new String[ages.length][2];
        for (int i = 0; i < ages.length; i++) {
            res[i][0] = String.valueOf(ages[i]);
            res[i][1] = ages[i] >= 18 ? "true" : "false";
        }
        return res;
    }

    static void display(String[][] arr) {
        System.out.println("Age\tCan Vote");
        for (String[] row : arr)
            System.out.println(row[0] + "\t" + row[1]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 10;
        display(checkVoting(generateAges(n)));
        sc.close();
    }
}

