package CoreProgramming.ClassObject.Level2;
class PalindromeChecker{
    private String text;
    public PalindromeChecker(String text){
        this.text = text;
    }
    public void isPalindrome(){
        String reversed = new StringBuilder(text).reverse().toString();

        if (text.equals(reversed)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not Palindrome");
        }

        }
    }
       
public class Palindrome {
    public static void main(String[] args) {
        PalindromeChecker s1 = new PalindromeChecker("madam");
        s1.isPalindrome();
        
    }
    

}