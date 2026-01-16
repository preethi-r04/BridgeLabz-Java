import java.util.Scanner;

public class MutiplesBelow1002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        if(num>0 && num<100){
            int i = 1;
            while(i<=100){
            
                if(num%i==0){
                    System.out.println(i);
                }    
                i++;  
            }
        }
    }
    
}