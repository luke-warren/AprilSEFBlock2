package org.example;

public class Doctor {

    public Doctor() {
    }

    public void setupAppointment(){
        Appointment appt = new Appointment();
        Calendar calendar = Calendar.getInstance();
        calendar.addAppointment(appt);
        System.out.println(appt);
        System.out.println(calendar);
    }
}
