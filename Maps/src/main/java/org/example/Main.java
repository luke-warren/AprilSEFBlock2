package org.example;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

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



//        System.out.println(catalog.getMostExpensiveItem());
//        System.out.println(catalog.getAllItemsBelowCertainAmount(31.0));


        Dog dog = new Dog();
        dog.age = 3;
        dog.name = "Spot";

        Dog sameDog = new Dog();
        sameDog.age = 3;
        sameDog.name = "Spot";


//        System.out.println(dog);
//        System.out.println(sameDog);
//        System.out.println(dog == sameDog);
//        System.out.println(dog.equals(catalog));

        Catalog catalog = new Catalog("Walmart", itemsToPrice.size(), itemsToPrice);

        Item pillows = new Item("Pillows", 20.0, "ABCD1");
        Item cups = new Item("cups", 50.0, "CUPS2");
        Item grails = new Item("GRAIL", 1000.0, "XYZ3");

        catalog.addNewInventoryItem(pillows);
        catalog.addNewInventoryItem(cups);
        catalog.addNewInventoryItem(grails);

        Item pillowsA  = new Item("PillowsA", 200.0, "ABCD1");

        System.out.println(catalog.addNewInventoryItem(pillowsA));

        Scanner scanner = new Scanner(System.in);
        boolean continueToAddItems = true;
        while(continueToAddItems){
            System.out.println("Item name?");
            String name = scanner.nextLine();
            System.out.println("Price?");
            String price = scanner.nextLine();
            System.out.println("Serial number?");
            String serialNumber = scanner.nextLine();


            Item item = new Item(name, Double.parseDouble(price), serialNumber);
            boolean itemWasAdded = catalog.addNewInventoryItem(item);
            if(itemWasAdded){
                System.out.println("Added Item");
            }

            System.out.println("Add more items? (Enter Y/N)");
            String reply = scanner.nextLine();
            if(reply.equalsIgnoreCase("N")){
                continueToAddItems = false;
            }

        }



























    }
}