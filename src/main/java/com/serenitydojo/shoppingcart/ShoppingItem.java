package com.serenitydojo.shoppingcart;

public class ShoppingItem {
    private final String name;
    private final String units;
    private final double price;
    private final String serialNumber;
    private final double weight;
    private final String brand;

    public ShoppingItem(String name, String units, double price, String serialNumber, double weight, String brand) {

        this.name = name;
        this.units = units;
        this.price = price;
        this.serialNumber = serialNumber;
        this.weight = weight;
        this.brand = brand;
    }

    public String getName() {
        return name;
    }

    public String getUnits() {
        return units;
    }

    public double getPrice() {
        return price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public String getBrand() {
        return brand;
    }

    public double getWeight() {
        return weight;
    }
}
