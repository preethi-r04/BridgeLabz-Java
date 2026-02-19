package ioprogramming.reflectionannotation.reflection.advanced.inject;

public class DITest {
    public static void main(String[] args) throws Exception {
        Car car = DIContainer.create(Car.class);
        car.drive();
    }
}
