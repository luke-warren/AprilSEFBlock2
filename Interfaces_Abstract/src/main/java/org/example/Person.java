package org.example;

public class Person implements Example{

    private String name;
    private double age;
    private String address;

    public Person(String name, double age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void walk(){
        System.out.println("Walking around");
    }


    public boolean match(String matchingName){
        return this.name.equalsIgnoreCase(matchingName);
    }

    public Double getValue(){
        return this.age;
    }
}
