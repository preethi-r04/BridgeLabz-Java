
package CoreProgramming.Strings.Level2;
import java.util.Scanner;

public class vowelcon {

    public static int[] vowcon(String st) {
        int vow = 0;
        int con = 0;

        for (int i = 0; i < st.length(); i++) {
            char ch = st.charAt(i);

            if (ch >= 'A' && ch <= 'Z') {
                ch = (char) (ch + 32);
            }

            if (ch >= 'a' && ch <= 'z') {
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vow++;
                } else {
                    con++;
                }
            }
        }

        return new int[]{vow, con};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String st = sc.nextLine();

        int[] res = vowcon(st);
        System.out.println("Vowels: " + res[0]);
        System.out.println("Consonants: " + res[1]);

        sc.close();
    }
}
