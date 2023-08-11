package org.example;

import java.util.Objects;

public class Item {
    private String name;
    private double  price;
    private String serialNumber;


    public Item(String name, double price, String serialNumber) {
        this.name = name;
        this.price = price;
        this.serialNumber = serialNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()){
            return false;
        }
        Item item = (Item) o;
        return Objects.equals(this.name, item.name) && Objects.equals(this.serialNumber, item.serialNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, serialNumber);
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", serialNumber='" + serialNumber + '\'' +
                '}';
    }
}
