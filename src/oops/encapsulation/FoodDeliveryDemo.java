package oops.encapsulation;

interface Discountable {
    double applyDiscount();
}

abstract class FoodItem {
    protected double price;
    protected int quantity;

    abstract double calculateTotalPrice();
}

class VegItem extends FoodItem {
    double calculateTotalPrice() {
        return price * quantity;
    }
}
