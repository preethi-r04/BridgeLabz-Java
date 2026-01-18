package oops.encapsulation;

import java.util.*;

interface Taxable {
    double calculateTax();
}

abstract class Product {
    private int productId;
    private String name;
    protected double price;

    Product(int id, String name, double price) {
        this.productId = id;
        this.name = name;
        this.price = price;
    }

    abstract double calculateDiscount();

    double finalPrice() {
        double tax = (this instanceof Taxable) ? ((Taxable)this).calculateTax() : 0;
        return price + tax - calculateDiscount();
    }
}

class Electronics extends Product implements Taxable {
    Electronics(int id, String name, double price) {
        super(id, name, price);
    }

    double calculateDiscount() {
        return price * 0.1;
    }

    public double calculateTax() {
        return price * 0.18;
    }
}
