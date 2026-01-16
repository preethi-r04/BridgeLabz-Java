import java.util.Scanner;

public class Power2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("num: ");
        int num = sc.nextInt();
        System.out.print("Power: ");
        int power = sc.nextInt();
        int res=1;
        int i = 1;
        while(i<=power)
        {
            res=res*num;
            i++;

        }
        
        System.out.println("Result: "+res);

    }
    
}