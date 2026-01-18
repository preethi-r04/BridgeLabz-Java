package oops.encapsulation;

interface Insurable {
    double calculateInsurance();
}

abstract class Vehicle {
    private String vehicleNumber;
    protected double rentalRate;

    Vehicle(String vehicleNumber, double rate) {
        this.vehicleNumber = vehicleNumber;
        this.rentalRate = rate;
    }

    abstract double calculateRentalCost(int days);
}

class Car extends Vehicle implements Insurable {
    Car(String num, double rate) {
        super(num, rate);
    }

    double calculateRentalCost(int days) {
        return rentalRate * days;
    }

    public double calculateInsurance() {
        return 500;
    }
}
