package CoreProgramming.Strings.Level3;
import java.util.Scanner;

public class CharFrequency {

    static String[][] frequency(String s) {
        int[] freq = new int[256];
        for (int i = 0; i < s.length(); i++)
            freq[s.charAt(i)]++;

        int count = 0;
        for (int i = 0; i < 256; i++)
            if (freq[i] > 0) count++;

        String[][] res = new String[count][2];
        int k = 0;
        for (int i = 0; i < 256; i++)
            if (freq[i] > 0) {
                res[k][0] = String.valueOf((char)i);
                res[k][1] = String.valueOf(freq[i]);
                k++;
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

