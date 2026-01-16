import java.util.Scanner;
public class SumUntil2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num: ");
        double num = sc.nextDouble();
        double tot = 0.0;
        while (num!=0 && num>0) {
            tot = tot+num;
            System.out.println("Enter the num: ");
            num= sc.nextDouble();
            
        }
        System.out.println("The total is: "+tot);
    }
    
}
