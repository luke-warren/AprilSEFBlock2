package org.example;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        HashMap<String, String> dictionary = new HashMap<>();
        dictionary.put("dog", "A four legged canine mammal");
        dictionary.put("Alaska", "The 49th territory to become a state");

//        System.out.println(dictionary.containsKey("dog"));
//        System.out.println(dictionary.get("dog"));
//
//        dictionary.put("dog", "A canine");
//
//        System.out.println(dictionary.get("dog"));


        //String oldValue = dictionary.replace("Alaska", "A state that starts with 'A'" );
        //System.out.println(oldValue);

        boolean didReplace = dictionary.replace("Alaska", "The 49th territory to become a state", "A state that starts with 'A'" );
//        System.out.println(didReplace);
//        System.out.println(dictionary.get("Alaska"));
//
//        System.out.println();


        HashMap<Integer, String> states = new HashMap<>();
        states.put(1, "Alabama");
        states.put(3, "Arizona");
        states.put(50, "Wyoming");

//        for(Integer key : states.keySet()){
//            System.out.println(states.get(key));
//        }
//
//        for(String state : states.values()){
//            System.out.println(state);
//        }

//        for(Map.Entry<Integer, String> entry : states.entrySet()){
//           Integer key = entry.getKey();
//            System.out.println(key);
//            String value = entry.getValue();
//            System.out.println(value);
//            System.out.println(entry);
//        }
//        System.out.println(states);

        HashMap<String, Double> itemsToPrice = new HashMap<>();
        itemsToPrice.put("Pillows", 10.0);
        itemsToPrice.put("Plates", 30.0);
        itemsToPrice.put("Shovel", 15.0);
        itemsToPrice.put("Couch", 450.75);

        Catalog catalog = new Catalog("Walmart", itemsToPrice.size(), itemsToPrice);

        System.out.println(catalog.getMostExpensiveItem());
        System.out.println(catalog.getAllItemsBelowCertainAmount(31.0));






















    }
}