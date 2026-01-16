package CoreProgramming.ClassObject.Level1;
class MobileDetails{
    private String brand;
    private String model;
    private double price;

    public MobileDetails(String brand,String model,double price){
        this.brand=brand;
        this.model=model;
        this.price=price;
    }
    public void displayDetails(){
        System.out.println("Brand: "+brand);
        System.out.println("Model: "+model);
        System.out.println("Price: "+price);
    }

}
public class Mobile {
    public static void main(String[] args) {
        MobileDetails m1 = new MobileDetails("Vivo", "T3 X 5G", 15000);
        m1.displayDetails();
    }
    
}
