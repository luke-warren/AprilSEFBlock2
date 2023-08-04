package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

//        System.out.println(PatagoniaBackpack.getBrand());
//        System.out.println(States.AK.state);
        final String ID = "Idaho";
        PatagoniaBackpack blueBackpack = new PatagoniaBackpack("blue", 3, 2);
        PatagoniaBackpack alaskaBackpack = new PatagoniaBackpack("midnight black", 4, 4, States.AK.state);
//        System.out.println(alaskaBackpack.getStateEmbroidery());
//        System.out.println(blueBackpack);
        SurvivalItem flashlight = new SurvivalItem("flashlight", 99);
        SurvivalItem zombieSpray = new SurvivalItem("zombie spray");

        SurvivalItem [] items = {flashlight, zombieSpray};
        ArrayList<String> food = new ArrayList<>();
        food.add("trail mix");
        food.add("Kind bar");

        ArrayList<String> colors = new ArrayList<>();
        colors.add("charcoal grey");
        colors.add("navy");


        OutdoorPatagoniaBackpack outdoorBackpack = new OutdoorPatagoniaBackpack("green", 4, 3, true, items, 1, food, colors);


        outdoorBackpack.addSingleFoodItem("Bacon Cheese Burger");
        outdoorBackpack.addSurvivalItem(new SurvivalItem("twine", 76));
       // System.out.println(outdoorBackpack);
        //System.out.println(outdoorBackpack.getColors());

        System.out.println(outdoorBackpack);

    }
}