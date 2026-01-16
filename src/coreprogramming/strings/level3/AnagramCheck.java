package CoreProgramming.Strings.Level3;

import java.util.Scanner;

public class AnagramCheck {

    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) return false;

        int[] fa = new int[256];
        int[] fb = new int[256];

        for (int i = 0; i < a.length(); i++) {
            fa[a.charAt(i)]++;
            fb[b.charAt(i)]++;
        }

        for (int i = 0; i < 256; i++)
            if (fa[i] != fb[i]) return false;

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(isAnagram(sc.nextLine(), sc.nextLine()));
        sc.close();
    }
}

