package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class OutdoorPatagoniaBackpack extends PatagoniaBackpack{
    private Boolean waterProof;
    private String [] survivalItems;
    private Integer firstAidKit;
    private ArrayList<String> food;

    public OutdoorPatagoniaBackpack(String color, int zippers, Integer buckles, Boolean waterProof, String[] survivalItems, Integer firstAidKit, ArrayList<String> food) {
        super(color, zippers, buckles);
        this.waterProof = waterProof;
        this.survivalItems = survivalItems;
        this.firstAidKit = firstAidKit;
        this.food = food;
    }

    public boolean addFoodItem(ArrayList<String> moreFood){
        return this.food.addAll(moreFood);
    }

    public boolean addSingleFoodItem(String singleItem){
        return this.food.add(singleItem);
    }

    public Boolean getWaterProof() {
        return waterProof;
    }

    public String[] getSurvivalItems() {
        return survivalItems;
    }

    public Integer getFirstAidKit() {
        return firstAidKit;
    }

    public ArrayList<String> getFood() {
        return food;
    }

    public void setWaterProof(Boolean waterProof) {
        this.waterProof = waterProof;
    }

    public void setSurvivalItems(String[] survivalItems) {
        this.survivalItems = survivalItems;
    }

    public void setFirstAidKit(Integer firstAidKit) {
        this.firstAidKit = firstAidKit;
    }

    public void setFood(ArrayList<String> food) {
        this.food = food;
    }

    @Override
    public String toString() {
        return "OutdoorPatagoniaBackpack{" +
                " color=" + this.getColor() +
                ", zippers=" + this.getZippers() +
                ", buckles=" + this.getBuckles() +
                ", brand=" + PatagoniaBackpack.getBrand() +
                ", waterProof=" + waterProof +
                ", survivalItems=" + Arrays.toString(survivalItems) +
                ", firstAidKit=" + firstAidKit +
                ", food=" + food +
                '}';
    }
}
