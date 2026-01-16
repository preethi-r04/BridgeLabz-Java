package CoreProgramming.Strings.Level1;
import java.util.Scanner;
public class StrCompare {
    public static boolean strcompareAtCahr(String s1, String s2){
        if(s1.length() != s2.length()){
            return false;
        }
        else{
            for(int i=0;i<s1.length();i++){
                if(s1.charAt(i)!=s2.charAt(i)){
                    return false;
                }
              
            }
        return true;

        }
    
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("S1: ");
        String s1 = sc.next();
        System.out.print("S2: ");
        String s2 = sc.next();

        boolean resCharAt = strcompareAtCahr(s1, s2);
        boolean resEqual = s1.equals(s2);

        System.out.println("Result using charAt(): " + resCharAt);
        System.out.println("Result using equals(): " + resEqual);
        System.out.println("Both results are same: " + (resCharAt == resEqual));

        sc.close();

    }
    
}
