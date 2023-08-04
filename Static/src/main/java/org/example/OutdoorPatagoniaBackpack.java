package org.example;

import java.util.ArrayList;
import java.util.Arrays;

public class OutdoorPatagoniaBackpack extends PatagoniaBackpack{
    private Boolean waterProof;
    private SurvivalItem [] survivalItems;
    private Integer firstAidKit;
    private ArrayList<String> food;

    private ArrayList<String> additionalColors;
    private final int MAX_NUMBER_OF_COLORS = 3;

    public OutdoorPatagoniaBackpack(String color, int zippers, Integer buckles, Boolean waterProof, SurvivalItem[] survivalItems, Integer firstAidKit, ArrayList<String> food, ArrayList<String> additionalColors) {
        super(color, zippers, buckles);
        this.waterProof = waterProof;
        this.survivalItems = survivalItems;
        this.firstAidKit = firstAidKit;
        this.food = food;
        this.additionalColors = additionalColors;
    }

    public boolean addFoodItem(ArrayList<String> moreFood){
        return this.food.addAll(moreFood);
    }

    public boolean addSingleFoodItem(String singleItem){
        return this.food.add(singleItem);
    }

    public void addSurvivalItem(SurvivalItem survivalItem){
        int size = this.survivalItems.length + 1;
        SurvivalItem [] biggerSurvivalItems = new SurvivalItem[size];
        for(int i=0; i< this.survivalItems.length; i++){
            biggerSurvivalItems[i] = this.survivalItems[i];
        }
        biggerSurvivalItems[size-1] = survivalItem;
        this.survivalItems = biggerSurvivalItems;

    }

    @Override
    public void paintBackpack(String updatedColor){
        if(this.additionalColors.isEmpty()){
            this.additionalColors.add(updatedColor);
        }
        else {
            this.additionalColors.remove(0);
            this.additionalColors.add(updatedColor);
        }
    }

    public String getColors(){
        String colors;
        colors = this.getColor();
        for(String color : additionalColors){
            colors += ", " + color;
        }
        return colors;
    }
    public Boolean getWaterProof() {
        return waterProof;
    }

    public SurvivalItem[] getSurvivalItems() {
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

    public void setSurvivalItems(SurvivalItem[] survivalItems) {
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
