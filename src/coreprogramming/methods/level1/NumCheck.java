package CoreProgramming.Methods.Level1;

import java.util.Scanner;

public class NumCheck {
    public static int check(int num){
        if(num>0){
            return 1;
        }
        else if(num<0){
            return -1;
        }
        else{
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num: ");
        int num = sc.nextInt();

        int res = check(num);
        if(res==-1){
            System.out.println("Num is Negative");
        }
        else if(res ==1){
            System.out.println("Nm is Positive");
        }
        else{
            System.out.println("Num is Zero");
        }
    }
    
}
