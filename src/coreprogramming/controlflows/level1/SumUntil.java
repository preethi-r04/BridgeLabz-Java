import java.util.Scanner;
public class SumUntil{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double tot=0.0;

        System.out.println("Enter the num:");
        double num = sc.nextDouble();
        while(num!=0){
            tot = tot+num;
            System.out.println("Enter the num:");
            num=sc.nextDouble();
        }
        System.out.println("The total is: "+tot);

    }
}