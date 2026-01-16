package CoreProgramming.Methods.Level1;
import java.util.Scanner;
public class SumN {
    public static int sumofN(int n){
        int sum = 0;
        for(int i = 0; i<=n;i++){
            sum = sum + i;
            
        }
        return sum;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num: ");
        int n = sc.nextInt();
        int res = sumofN(n);
        System.out.println("The total: "+res);

        
    }
    
}
