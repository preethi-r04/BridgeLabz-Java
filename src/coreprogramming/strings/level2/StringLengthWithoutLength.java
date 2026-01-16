package CoreProgramming.Strings.Level2;

import java.util.Scanner;

public class StringLengthWithoutLength {

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

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.next();

        int userLength = findLength(text);
        int builtInLength = text.length();

        System.out.println("Length without length(): " + userLength);
        System.out.println("Length using length(): " + builtInLength);

        sc.close();
    }
}
