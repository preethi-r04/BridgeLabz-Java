package CoreProgramming.Strings.Level3;

import java.util.Scanner;

public class FrequencyUsingUnique {

    static char[] uniqueCharacters(String s) {
        char[] temp = new char[s.length()];
        int k = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            boolean unique = true;
            for (int j = 0; j < i; j++)
                if (s.charAt(j) == ch) unique = false;
            if (unique) temp[k++] = ch;
        }

        char[] res = new char[k];
        for (int i = 0; i < k; i++) res[i] = temp[i];
        return res;
    }

    static String[][] frequency(String s) {
        int[] freq = new int[256];
        for (int i = 0; i < s.length(); i++)
            freq[s.charAt(i)]++;

        char[] unique = uniqueCharacters(s);
        String[][] res = new String[unique.length][2];

        for (int i = 0; i < unique.length; i++) {
            res[i][0] = String.valueOf(unique[i]);
            res[i][1] = String.valueOf(freq[unique[i]]);
        }
        return res;
    }

    static void display(String[][] arr) {
        for (String[] r : arr)
            System.out.println(r[0] + " " + r[1]);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        display(frequency(sc.nextLine()));
        sc.close();
    }
}

