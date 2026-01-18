package oops.encapsulation;

interface GPS {
    String getCurrentLocation();
}

abstract class Vehicle {
    protected double ratePerKm;

    abstract double calculateFare(double distance);
}

class Car extends Vehicle {
    Car() {
        ratePerKm = 15;
    }

    double calculateFare(double distance) {
        return ratePerKm * distance;
    }
}
