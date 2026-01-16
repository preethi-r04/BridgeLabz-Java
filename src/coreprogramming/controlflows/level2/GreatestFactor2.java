import java.util.Scanner;

public class GreatestFactor2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num > 1){
            int great = 1;
            int i = num-1;
            while(i>=1) {
                if(num%i==0){
                    great=i;
                   
                    break;
                }
                 i--;
            }
            System.out.println("The greatest factor is: "+ great );
        }
    }
    
}

