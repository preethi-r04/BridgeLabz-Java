package CoreProgramming.Strings.Level2;

import java.util.Scanner;

public class SimpleSplit {

    public static String[] splitText(String text) {
        int count = 0;

        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == ' ') {
                count++;
            }
        }

        String[] words = new String[count + 1];
        String word = "";
        int index = 0;

        for (int i = 0; i < text.length(); i++) {
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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.nextLine();

        String[] userWords = splitText(text);
        String[] builtInWords = text.split(" ");

        System.out.println(userWords.length == builtInWords.length);

        sc.close();
    }
}

