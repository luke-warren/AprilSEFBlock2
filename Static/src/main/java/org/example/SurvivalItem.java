package org.example;

public class SurvivalItem {
    public static boolean helpsSurvive = true;
    public final static int MAX_USEFULNESS = 99;

    private String itemName;
    private int usefulnessIndex;

    public SurvivalItem(String itemName) {
        this.itemName = itemName;
        this.usefulnessIndex = 25;
    }

    public SurvivalItem(String itemName, int usefulnessIndex) {
        this.itemName = itemName;
        this.usefulnessIndex = usefulnessIndex;
    }

    public double getUsefulnessPercentage(){
        return ((double) this.usefulnessIndex / MAX_USEFULNESS) * 100;
    }

    public static boolean isHelpsSurvive() {
        return helpsSurvive;
    }

    public static void setHelpsSurvive(boolean helpsSurvive) {
        SurvivalItem.helpsSurvive = helpsSurvive;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getUsefulnessIndex() {
        return usefulnessIndex;
    }

    public void setUsefulnessIndex(int usefulnessIndex) {
        this.usefulnessIndex = usefulnessIndex;
    }

    @Override
    public String toString() {
        return "SurvivalItem{" +
                "itemName='" + itemName + '\'' +
                ", usefulnessIndex=" + usefulnessIndex +
                '}';
    }
}
