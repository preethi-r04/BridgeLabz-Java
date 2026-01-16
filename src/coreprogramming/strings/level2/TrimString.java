package CoreProgramming.Strings.Level2;

import java.util.Scanner;

public class TrimString {

    static int[] findTrimPoints(String str) {
        int start = 0, end = str.length() - 1;
        while (start <= end && str.charAt(start) == ' ') start++;
        while (end >= start && str.charAt(end) == ' ') end--;
        return new int[]{start, end};
    }

    static String substringCharAt(String str, int start, int end) {
        String res = "";
        for (int i = start; i <= end; i++)
            res += str.charAt(i);
        return res;
    }

    static boolean compareStrings(String a, String b) {
        if (a.length() != b.length()) return false;
        for (int i = 0; i < a.length(); i++)
            if (a.charAt(i) != b.charAt(i)) return false;
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        int[] points = findTrimPoints(input);
        String trimmedManual = substringCharAt(input, points[0], points[1]);
        String trimmedBuiltIn = input.trim();

        System.out.println(trimmedManual);
        System.out.println(compareStrings(trimmedManual, trimmedBuiltIn));
        sc.close();
    }
}

