package CoreProgramming.Strings.Level2;

import java.util.Scanner;

public class ShortestLongestWord {

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
        String[][] table = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            table[i][0] = words[i];
            table[i][1] = String.valueOf(findLength(words[i]));
        }

        return table;
    }

    public static int[] findShortestLongest(String[][] table) {
        int min = Integer.parseInt(table[0][1]);
        int max = Integer.parseInt(table[0][1]);

        for (int i = 1; i < table.length; i++) {
            int len = Integer.parseInt(table[i][1]);
            if (len < min) {
                min = len;
            }
            if (len > max) {
                max = len;
            }
        }

        return new int[]{min, max};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        String[] words = splitText(text);
        String[][] table = buildWordLengthTable(words);
        int[] result = findShortestLongest(table);

        System.out.println("Shortest length: " + result[0]);
        System.out.println("Longest length: " + result[1]);

        sc.close();
    }
}

