package CoreProgramming.ClassObject.Level2;

class CartItem {

    private String itemName;
    private double price;
    private int quantity;

    public CartItem(String itemName, double price) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = 0;
    }

    public void addItem(int quantity) {
        this.quantity += quantity;
    }

    public void removeItem(int quantity) {
        if (this.quantity >= quantity) {
            this.quantity -= quantity;
        } else {
            System.out.println("Cannot remove more than available quantity");
        }
    }

    public void displayTotalCost() {
        double totalCost = price * quantity;
        System.out.println("Item: " + itemName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total Price: " + totalCost);
    }
}

public class Shopping {
    public static void main(String[] args) {

        CartItem s1 = new CartItem("Pencil", 10);
        s1.addItem(6);
        s1.removeItem(2);
        s1.displayTotalCost();
    }
}

    
