import java.util.Scanner;

class StaffMember {
public void showDetails() {
System.out.println("Displaying staff member details");
}
}

class Professor extends StaffMember {
@Override
public void showDetails() {
Scanner scanner = new Scanner(System.in);
System.out.print("Field of expertise for the professor: ");
String fieldOfExpertise = scanner.nextLine();
System.out.println("Staff member is a professor specialized in " + fieldOfExpertise);
}
}

class AdministrativeStaff extends StaffMember {
@Override
public void showDetails() {
Scanner scanner = new Scanner(System.in);
System.out.print("Department of the administrative staff: ");
String department = scanner.nextLine();
System.out.println("Staff member works in the " + department + " department");
}
}

public class test782 {
public static void main(String[] args) {
// Creating instances of the subclasses
Professor professorInstance = new Professor();
AdministrativeStaff adminStaffInstance = new AdministrativeStaff();

// Calling showDetails() for each instance
professorInstance.showDetails();
adminStaffInstance.showDetails();
}
}
