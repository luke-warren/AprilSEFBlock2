package org.example;

public class AppointmentService {

    private final int OFFICE_CODE = 1234;
    Calendar calendar = Calendar.getInstance();

    public void requestAppoint(Patient patient, Doctor doctor, String reason){
        Appointment appointment = new Appointment(patient.getName(), doctor.getName(), reason);
        calendar.addAppointment(appointment);
        //Wanted to send to a database or to corporate or department
        // Convert to DTO and send
        AppointmentDTO appointmentDTO = convertApptToDTO(appointment);
        //Send appointmentDTO to other user/service/database
        //Sends a http request
    }

    public void receiveAppointment(AppointmentDTO appointmentDTO){
        System.out.println("Office of origin: " + appointmentDTO.getOfficeNumber());
        calendar.addAppointment(convertDTOToAppt(appointmentDTO));

    }
    private Appointment convertDTOToAppt(AppointmentDTO dto){
        Appointment appt = new Appointment();
        appt.setDoctor(dto.getDoctor());
        appt.setPatientName(dto.getPatientName());
        appt.setReasonForVisit(dto.getReasonForVisit());
        return appt;
    }

    private AppointmentDTO convertApptToDTO(Appointment appt){
        return new AppointmentDTO(appt.getPatientName(), appt.getDoctor(), appt.getReasonForVisit(), OFFICE_CODE);
    }
}
