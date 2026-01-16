import java.util.Scanner;

public class GreatestFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num > 1){
            int great = 1;
            for(int i = num-1;i>=1;i--){
                if(num%i==0){
                    great=i;
                    break;
                }
            }
            System.out.println("The greatest factor is: "+ great );
        }
    }
    
}
