package CoreProgramming.Methods.Level2;
import java.util.Scanner;
public class CheckNum {
    public static boolean isPostive(int num){
      return num>=0;
    }
    public static boolean isEven(int num){
        return num%2==0;
    }
    public static int compare(int num1,int num2){
        if(num1==num2){
            return 1;
        }
        else if(num1>num2){
            return 2;
        }
        else{
            return 3;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[5];
        System.out.println("Enter the 5 digit num: ");
        for(int i = 0;i< arr.length;i++){
            arr[i]=sc.nextInt();

        }
        for(int i =0;i<arr.length;i++){
        if(isPostive(arr[i])){
            if(isEven(arr[i])){
                System.out.println("It is Even number: "+arr[i]);
            }
            else{
                System.out.println("Odd Num: "+arr[i]);
            }
        }
        else{
            System.out.println("Negative Num: "+arr[i]);
        }
    }
        int res=compare(arr[0], arr[arr.length-1]);
            if(res==1){
                System.out.println("Both are same");
            }
            else if(res==2){
                System.out.println(arr[0]+" is great");
            }
            else{
                System.out.println(arr[arr.length-1]+" is great");
            }
            sc.close();
        }
        
    }
 

