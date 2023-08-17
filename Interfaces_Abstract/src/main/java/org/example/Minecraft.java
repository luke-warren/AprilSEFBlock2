package org.example;

import java.util.HashMap;

public class Minecraft extends Game implements Playable{

    HashMap<String, String> materialLibrary = new HashMap<>();


    @Override
    public void play() {
        System.out.println("Load up game");
        System.out.println("Interact with user");
    }
}
