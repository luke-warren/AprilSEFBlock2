package org.example;

public class Calendar {

    //Private constructor
    //Some sort of getter that checks if the instance is created
    //Static final -- instance
    private static Calendar instance;

    private Calendar (){}

    public static Calendar getInstance(){
        if(instance == null){
            instance = new Calendar();
        }
        return instance;
    }

    public void addAppointment(Appointment appointment){
        //Adds appointment
    }
}
