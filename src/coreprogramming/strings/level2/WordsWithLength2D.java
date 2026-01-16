package CoreProgramming.Strings.Level2;
import java.util.Scanner;

public class WordsWithLength2D {

    public static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (RuntimeException e) {
            return count;
        }
    }

    public static String[] splitText(String text) {
        int spaces = 0;

        for (int i = 0; i < findLength(text); i++) {
            if (text.charAt(i) == ' ') {
                spaces++;
            }
        }

        String[] words = new String[spaces + 1];
        String word = "";
        int index = 0;

        for (int i = 0; i < findLength(text); i++) {
            if (text.charAt(i) == ' ') {
                words[index++] = word;
                word = "";
            } else {
                word = word + text.charAt(i);
            }
        }

        words[index] = word;
        return words;
    }

    public static String[][] buildWordLengthTable(String[] words) {
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        String[] words = splitText(text);
        String[][] table = buildWordLengthTable(words);

        System.out.println("Word\tLength");
        for (int i = 0; i < table.length; i++) {
            System.out.println(table[i][0] + "\t" + Integer.parseInt(table[i][1]));
        }

        sc.close();
    }
}
