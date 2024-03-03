package q23491;
import java.util.Scanner;

class Appointment {
public void schedule() {
System.out.println("Scheduling an appointment");
}
}

class DoctorAppointment extends Appointment {
@Override
public void schedule() {
Scanner scanner = new Scanner(System.in);
System.out.print("Specialization: ");
String specialization = scanner.nextLine();
System.out.println("Doctor appointment scheduled for " + specialization);
}
}

class DentistAppointment extends Appointment {
@Override
public void schedule() {
Scanner scanner = new Scanner(System.in);
System.out.print("Dental procedure: ");
String procedure = scanner.nextLine();
System.out.println("Dentist appointment scheduled for " + procedure);
}
}

public class AppointmentTest {
public static void main(String[] args) {
Appointment genericAppointment = new Appointment();
genericAppointment.schedule();

DoctorAppointment doctorAppointment = new DoctorAppointment();
doctorAppointment.schedule();

DentistAppointment dentistAppointment = new DentistAppointment();
dentistAppointment.schedule();
}
}
