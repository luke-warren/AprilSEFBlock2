package org.example;

public class PatagoniaBackpack {


    public static String brand = "Patagonia";
    private String color;
    private int zippers;
    private Integer buckles;

    public PatagoniaBackpack(String color, int zippers, Integer buckles) {
        this.color = color;
        this.zippers = zippers;
        this.buckles = buckles;
    }

    public static String getBrand(){
        return brand;
    }

    public String getColor() {
        return this.color;
    }
}
