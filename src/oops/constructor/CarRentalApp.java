package CoreProgramming.Constructor;

class CarRental {
    private String customerName;
    private String carModel;
    private int rentalDays;
    private double totalCost;

    public CarRental(String customerName, String carModel, int rentalDays) {
        this.customerName = customerName;
        this.carModel = carModel;
        this.rentalDays = rentalDays;
        this.totalCost = calculateCost();
    }

    private double calculateCost() {
        return rentalDays * 1500;
    }

    public void display() {
        System.out.println(customerName + " | " + carModel + " | " + totalCost);
    }
}

public class CarRentalApp {
    public static void main(String[] args) {
        CarRental c1 = new CarRental("Abi", "Swift", 4);
        c1.display();
    }
}
