package org.example;

public class Appointment {
    private String patientName;
    private String doctor;
    private String reasonForVisit;

    public Appointment(){
        this.patientName = "";
        this.doctor = "";
        this.reasonForVisit = "";
    }

    public Appointment(String patientName, String doctor, String reasonForVisit) {
        this.patientName = patientName;
        this.doctor = doctor;
        this.reasonForVisit = reasonForVisit;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getDoctor() {
        return doctor;
    }

    public void setDoctor(String doctor) {
        this.doctor = doctor;
    }

    public String getReasonForVisit() {
        return reasonForVisit;
    }

    public void setReasonForVisit(String reasonForVisit) {
        this.reasonForVisit = reasonForVisit;
    }
}
