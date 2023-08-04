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

//    public static void setBrand(String brand) {
//        PatagoniaBackpack.brand = brand;
//    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getZippers() {
        return zippers;
    }

    public void setZippers(int zippers) {
        this.zippers = zippers;
    }

    public Integer getBuckles() {
        return buckles;
    }

    public void setBuckles(Integer buckles) {
        this.buckles = buckles;
    }

    @Override
    public String toString() {
        return "PatagoniaBackpack{" +
                "color='" + color + '\'' +
                ", zippers=" + zippers +
                ", buckles=" + buckles +
                '}';
    }
}
