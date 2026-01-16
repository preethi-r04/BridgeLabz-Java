package CoreProgramming.Instance;

class Vehicle {
    private String ownerName;
    private String vehicleType;


    private static double registrationFee = 1500;

    public Vehicle(String ownerName, String vehicleType) {
        this.ownerName = ownerName;
        this.vehicleType = vehicleType;
    }

 
    public void displayVehicleDetails() {
        System.out.println("Owner: " + ownerName);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Registration Fee: " + registrationFee);
    }

   
    public static void updateRegistrationFee(double fee) {
        registrationFee = fee;
    }
}

public class VehicleApp {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Abi", "Car");
        Vehicle v2 = new Vehicle("Ravi", "Bike");

        v1.displayVehicleDetails();
        v2.displayVehicleDetails();

        Vehicle.updateRegistrationFee(2000);

        v1.displayVehicleDetails();
    }
}

