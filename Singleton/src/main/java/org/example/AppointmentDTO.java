package org.example;

public class AppointmentDTO {
    private String patientName;
    private String doctor;
    private String reasonForVisit;

    private Integer officeNumber;

    public AppointmentDTO(String patientName, String doctor, String reasonForVisit, Integer officeNumber) {
        this.patientName = patientName;
        this.doctor = doctor;
        this.reasonForVisit = reasonForVisit;
        this.officeNumber = officeNumber;
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

    public Integer getOfficeNumber() {
        return officeNumber;
    }

    public void setOfficeNumber(Integer officeNumber) {
        this.officeNumber = officeNumber;
    }
}
