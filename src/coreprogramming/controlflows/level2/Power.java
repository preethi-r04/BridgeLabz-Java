import java.util.Scanner;

public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("num: ");
        int num = sc.nextInt();
        System.out.print("Power: ");
        int power = sc.nextInt();
        int res=1;

        for(int i = 1;i<=power;i++){
            res=res*num;

        }
        System.out.println("Result: "+res);

    }
    
}
