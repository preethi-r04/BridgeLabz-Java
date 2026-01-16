import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the num: ");
        int num = sc.nextInt();
        int fac = 1;
        int i = 1;
        while(num>=i){
            fac=fac*i;
            i++;
        }
        System.out.println("The factorial is: "+fac);


    }
    
}
