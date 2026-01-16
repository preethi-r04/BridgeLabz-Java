import java.util.Scanner;

public class SumofN2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num: ");
        int num = sc.nextInt();
        if (num>0){
        int formula= num*(num+1)/2;
        int sum = 0;
        for(int i = 1;i<=num;i++){
            sum = sum+i;
        }
    
        if(formula==sum){
            System.out.println("Both the sum are equal!!");
        } 


        
    }

    }
    
}