package org.example;

public class Doctor {
    String name;

    public Doctor() {
        this.name = "Doc";
    }

//    public void setupAppointment(){
//        Appointment appt = new Appointment();
//        Calendar calendar = Calendar.getInstance();
//        calendar.addAppointment(appt);
//        System.out.println(appt);
//        System.out.println(calendar);
//    }

    public String getName() {
        return name;
    }
}
