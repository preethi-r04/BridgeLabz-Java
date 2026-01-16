package CoreProgramming.Strings.Level1;
import java.util.*;
public class SubStr {
    public static String substrchar(String st, int star,int end){
        String res ="";
        for(int i = star;i<end;i++){
            res=res+st.charAt(i);
        }
        return res;
    }
        public static boolean compareStrings(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String text = sc.next();
        int startIndex = sc.nextInt();
        int endIndex = sc.nextInt();

        String userSubstring = substrchar(text, startIndex, endIndex);
        String builtInSubstring = text.substring(startIndex, endIndex);

        boolean result = compareStrings(userSubstring, builtInSubstring);

        System.out.println("Substring using charAt(): " + userSubstring);
        System.out.println("Substring using substring(): " + builtInSubstring);
        System.out.println("Both substrings are same: " + result);

        sc.close();
    }
}