import java.util.Scanner;
public class DoubleOperation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("a: ");
        double a = sc.nextDouble();
         System.out.print("b: ");
        double b = sc.nextDouble();
         System.out.print("c: ");
        double c = sc.nextDouble();

        double res1= a+b*c;
        double res2 = a*b+c;
        double res3 = c+a/b;
        double res4 = a%b+c;
        System.out.println("The results of the Int Operations are: "+res1+", "+res2+", "+res3+", "+res4);

    }
    
}
