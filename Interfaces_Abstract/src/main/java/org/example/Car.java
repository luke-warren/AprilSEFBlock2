package org.example;

public class Car implements Example, Movable{

    private String color;
    private String makeModel;
    private boolean fourWheelDrive;

    private double cost;

    @Override
    public boolean match(String matchColor){
        return this.color.equalsIgnoreCase(matchColor);
    }

    @Override
    public Double getValue(){
        return this.cost;
    }

    @Override
    public void move() {
        System.out.println("Drive forward not backward");
    }
}
