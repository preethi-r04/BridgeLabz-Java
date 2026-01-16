package CoreProgramming.Strings.Level3;

import java.util.Scanner;

public class FrequencyNestedLoop {

    static String[] frequency(String s) {
        char[] ch = s.toCharArray();
        int[] freq = new int[ch.length];

        for (int i = 0; i < ch.length; i++) {
            freq[i] = 1;
            for (int j = i + 1; j < ch.length; j++) {
                if (ch[i] == ch[j]) {
                    freq[i]++;
                    ch[j] = '0';
                }
            }
        }

        int count = 0;
        for (int i = 0; i < ch.length; i++)
            if (ch[i] != '0') count++;

        String[] res = new String[count];
        int k = 0;
        for (int i = 0; i < ch.length; i++)
            if (ch[i] != '0')
                res[k++] = ch[i] + " " + freq[i];

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] result = frequency(sc.nextLine());
        for (String r : result) System.out.println(r);
        sc.close();
    }
}
