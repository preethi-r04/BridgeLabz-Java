import java.util.Scanner;
public class CheckNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num: ");
        int num = sc.nextInt();
        for(int i =1;i<=num;i++){
            if(i%2==0){
                System.out.println("Even: "+i);
            }
            else{
                System.out.println("Odd: "+i);
            }
        }
    }
    
}
