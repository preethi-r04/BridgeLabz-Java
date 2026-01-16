import java.util.Scanner;
public class Bonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int salary = sc.nextInt();
        int year = sc.nextInt();
        double bonus = 0.05;
        if(year>5){
            double bonusamt = salary*bonus;
        
        System.out.println("The bonus amount: "+ bonusamt);
        }
    }
    
}
