package org.example;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Catalog {
    private String storeName;
    private int inventoryTotal;
    private HashMap<String, Double> itemToPriceMap;
    private HashMap<String, ArrayList<String>> profiles;

    private HashMap<String, Item> inventory;

    public Catalog(String storeName){
        this.storeName = storeName;
        this.inventoryTotal = 0;
        this.itemToPriceMap = new HashMap<>();
        this.profiles = new HashMap<>();
        this.inventory = new HashMap<>();
    }

    public Catalog(String storeName, int inventoryTotal, HashMap<String, Double> itemToPriceMap){
        this.storeName = storeName;
        this.inventoryTotal = inventoryTotal;
        this.itemToPriceMap = itemToPriceMap;
        this.profiles = new HashMap<>();
        this.inventory = new HashMap<>();
    }

    public Catalog(String storeName, int inventoryTotal, HashMap<String, Double> itemToPriceMap, HashMap<String, ArrayList<String>> profiles, HashMap<String, Item> inventory) {
        this.storeName = storeName;
        this.inventoryTotal = inventoryTotal;
        this.itemToPriceMap = itemToPriceMap;
        this.profiles = profiles;
        this.inventory = inventory;
    }

    public HashMap<String, Double> getItemToPriceMap(){
        return this.itemToPriceMap;
    }

    public Double getPriceOfItem(String item){
        return this.itemToPriceMap.get(item);
    }

    //Pillows -> 10.0
    //Plates -> 30.0
    //Couch -> 450.0

    //loop over each entry
    //Keep track of the current price, highest price
    // Keep track of the name of highest priced item
    //Store the values in some variables
    //compare the stored values to current values
    public String getMostExpensiveItem(){
        Double highestPrice = 0.0;
        String itemName = "";
        for(Map.Entry<String, Double> entry : this.itemToPriceMap.entrySet()){
            Double currentPrice = entry.getValue();
            if(currentPrice > highestPrice){
                highestPrice = currentPrice;
                itemName = entry.getKey();
            }
        }
        return itemName + ", price: $" + highestPrice;
    }

    public ArrayList<String> getAllItemsBelowCertainAmount(Double priceBoundary){
        ArrayList<String> itemNames = new ArrayList<>();
        for(String key : this.itemToPriceMap.keySet()){
            Double price = this.itemToPriceMap.get(key);
            if(price < priceBoundary){
                itemNames.add(key);
            }
        }
        return itemNames;
    }

    public boolean updatePrice(String itemName, Double newPrice){
        Double oldPrice = this.itemToPriceMap.get(itemName);
        return this.itemToPriceMap.replace(itemName, oldPrice, newPrice);
    }

    public Double addItemToInventory(String item, Double price){
        return this.itemToPriceMap.put(item, price);
    }


    public ArrayList<String> getProfilesForUsername(String name){
        return this.profiles.get(name);
    }


    //Adds a profile to the profile list
    public void addProfileToUser(String key, String profileName){
        ArrayList<String> profileList = this.profiles.get(key);
        profileList.add(profileName);
        this.profiles.put(key, profileList);
    }

    public boolean addNewInventoryItem(Item item){
        if(!inventory.containsValue(item)){
            inventory.put(item.getSerialNumber(), item);
            return true;
        }
        return false;
    }

    public void updatePriceOfInventoryItem(String serialNumber, Double price){
        Item item = inventory.remove(serialNumber);
        item.setPrice(price);
        inventory.put(serialNumber, item);
    }






















}
