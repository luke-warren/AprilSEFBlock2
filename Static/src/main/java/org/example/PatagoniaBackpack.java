package org.example;

public class PatagoniaBackpack {


    public static String brand = "Patagonia";
    private String color;
    private int zippers;
    private Integer buckles;

    private String stateEmbroidery;

    public PatagoniaBackpack(){
        this.color = "tan";
        this.zippers = 1;
        this.buckles = 0;
        this.stateEmbroidery = "";
    }

    public PatagoniaBackpack(String color, int zippers, Integer buckles) {
        this.color = color;
        this.zippers = zippers;
        this.buckles = buckles;
        this.stateEmbroidery = "";
    }

    public PatagoniaBackpack(String color, int zippers, Integer buckles, String stateEmbroidery) {
        this.color = color;
        this.zippers = zippers;
        this.buckles = buckles;
        this.stateEmbroidery = stateEmbroidery;
    }

    public void paintBackpack(String updatedColor){
        this.setColor(updatedColor);
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

    public String getStateEmbroidery() {
        return stateEmbroidery;
    }

    public void setStateEmbroidery(String stateEmbroidery) {
        this.stateEmbroidery = stateEmbroidery;
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
