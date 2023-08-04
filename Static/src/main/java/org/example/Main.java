package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        System.out.println(PatagoniaBackpack.getBrand());
        System.out.println(States.AK.state);
        PatagoniaBackpack blueBackpack = new PatagoniaBackpack("blue", 3, 2);
        System.out.println(blueBackpack);

        String [] items = {"flashlight", "zombie spray", "compass", "pocket knife"};
        ArrayList<String> food = new ArrayList<>();
        food.add("trail mix");
        food.add("Kind bar");


        OutdoorPatagoniaBackpack outdoorBackpack = new OutdoorPatagoniaBackpack("green", 4, 3, true, items, 1, food);

        System.out.println(outdoorBackpack);
        outdoorBackpack.addSingleFoodItem("Bacon Cheese Burger");
        System.out.println(outdoorBackpack);

    }
}