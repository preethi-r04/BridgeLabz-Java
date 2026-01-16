package CoreProgramming.Strings.Level2;

import java.util.Scanner;

public class VowelConsonantCheck {

    static String checkChar(char ch) {
        if (ch >= 'A' && ch <= 'Z') ch = (char)(ch + 32);
        if (ch >= 'a' && ch <= 'z') {
            if ("aeiou".indexOf(ch) != -1) return "Vowel";
            return "Consonant";
        }
        return "Not a Letter";
    }

    static String[][] analyzeString(String str) {
        String[][] result = new String[str.length()][2];
        for (int i = 0; i < str.length(); i++) {
            result[i][0] = String.valueOf(str.charAt(i));
            result[i][1] = checkChar(str.charAt(i));
        }
        return result;
    }

    static void display(String[][] arr) {
        System.out.println("Character\tType");
        for (String[] row : arr)
            System.out.println(row[0] + "\t\t" + row[1]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        display(analyzeString(input));
        sc.close();
    }
}

