import java.util.Scanner;
public class Factorial2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num: ");
        int num = sc.nextInt();
        int fac = 1;
        for(int i=1;i<=num;i++){
            fac = fac*i;
        }
        
        System.out.println("The factorial is: "+fac);


    }
    
}
