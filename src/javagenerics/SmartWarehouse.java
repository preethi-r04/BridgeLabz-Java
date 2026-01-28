package javagenerics;

import java.util.*;

abstract class WarehouseItem {
    String name;
    WarehouseItem(String name) {
        this.name = name;
    }
    public String toString() {
        return name;
    }
}

class Electronics extends WarehouseItem {
    Electronics(String name) {
        super(name);
    }
}

class Groceries extends WarehouseItem {
    Groceries(String name) {
        super(name);
    }
}

class Furniture extends WarehouseItem {
    Furniture(String name) {
        super(name);
    }
}

class Storage<T extends WarehouseItem> {
    List<T> items = new ArrayList<>();

    void addItem(T item) {
        items.add(item);
    }

    T getItem(int index) {
        return items.get(index);
    }

    static void displayItems(List<? extends WarehouseItem> list) {
        for (WarehouseItem item : list) {
            System.out.println(item);
        }
    }
}

public class SmartWarehouse {
    public static void main(String[] args) {
        Storage<Electronics> electronics = new Storage<>();
        electronics.addItem(new Electronics("Laptop"));
        electronics.addItem(new Electronics("Mobile"));

        Storage.displayItems(electronics.items);
    }
}
