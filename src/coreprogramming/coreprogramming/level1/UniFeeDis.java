public class UniFeeDis {
    public static void main(String[] args) {
        int fees = 125000;
        int dis = 10;
        int disAmt = (fees*dis)/100;
        int finalAmt = fees-disAmt;
        System.out.println("The discount amount is INR "+ disAmt+
        " and final discounted fee is INR "+ finalAmt);
        
    }
    
}
