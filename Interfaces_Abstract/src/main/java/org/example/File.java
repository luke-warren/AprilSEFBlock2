package org.example;

public abstract class File {

    private int memory;
    private String name;


    //Only be called as super() in child classes.
    public File(int memory, String name) {
        this.memory = memory;
        this.name = name;
    }

    public int getMemory(){
        return this.memory;
    }

    public abstract void read();

    public abstract boolean save();

    public abstract boolean saveAs(String fileName);
}
