package org.example;

public class Patient {


    public void requestAppointment(){
        Appointment appt = new Appointment();
        Calendar calendar = Calendar.getInstance();
        System.out.println(appt);
        System.out.println(calendar);
    }
}
