package CoreProgramming.ClassObject.Level1;

class ItemDetails{
    private int itemCode;
    private String itemName;
    private double itemPrice;

    public ItemDetails(int itemCode,String itemName, double itemPrice){
        this.itemCode=itemCode;
        this.itemName=itemName;
        this.itemPrice=itemPrice;
    }
    public void displayDetails(){
        System.out.println("Code: "+itemCode);
        System.out.println("Name: "+itemName);
        System.out.println("Price: "+itemPrice);
    }
    public void calCost(int quantity){
        double tot = itemPrice*quantity;
        System.out.println("Total Price: "+tot);

    }

}
public class Item {
    public static void main(String[] args) {
        ItemDetails i1 = new ItemDetails(1011, "Pencil", 10);
        i1.displayDetails();
        i1.calCost(2);
    }
    
}
