package CoreProgramming.Strings.Level3;

import java.util.Scanner;

public class UniqueCharacters {

    static int length(String s) {
        int i = 0;
        try {
            while (true) s.charAt(i++);
        } catch (Exception e) {}
        return i;
    }

    static char[] findUnique(String s) {
        int n = length(s);
        char[] temp = new char[n];
        int k = 0;

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            boolean unique = true;
            for (int j = 0; j < i; j++)
                if (s.charAt(j) == ch) unique = false;
            if (unique) temp[k++] = ch;
        }

        char[] result = new char[k];
        for (int i = 0; i < k; i++) result[i] = temp[i];
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();
        char[] res = findUnique(text);
        for (char c : res) System.out.print(c + " ");
        sc.close();
    }
}

