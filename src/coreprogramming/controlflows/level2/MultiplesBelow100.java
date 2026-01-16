import java.util.Scanner;

public class MultiplesBelow100 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num>0 && num<100){
            for(int i = 1;i<=100;i++){ 
                if(num%i==0){
                    System.out.println(i);
                }      
            }
        }
    }
    
}
