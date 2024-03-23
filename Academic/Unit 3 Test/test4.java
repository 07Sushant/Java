import java.util.Scanner;

abstract class EmployeeDetails {
private String name;
private int emp_id;

public EmployeeDetails(String name, int emp_id) {
this.name = name;
this.emp_id = emp_id;
}

public void commonEmpDetails() {
System.out.println(name);
System.out.println(emp_id);
}

public abstract void confidentialDetails();
}

class HR extends EmployeeDetails {
private int salary;
private String performance;

public HR(String name, int emp_id, int salary, String performance) {
super(name, emp_id);
this.salary = salary;
this.performance = performance;
}

@Override
public void confidentialDetails() {
System.out.println(salary);
System.out.println(performance);
}
}

public class Main {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

// Taking input for Employee
System.out.println("Enter Employee Name: ");
String name = scanner.nextLine();
System.out.println("Enter Employee ID: ");
int emp_id = scanner.nextInt();

// Taking input for HR
System.out.println("Enter Salary: ");
int salary = scanner.nextInt();
scanner.nextLine(); // Consume newline character
System.out.println("Enter Performance: ");
String performance = scanner.nextLine();

// Creating HR object
HR hrEmployee = new HR(name, emp_id, salary, performance);

// Displaying Employee details
System.out.println("Employee Details:");
hrEmployee.commonEmpDetails();

// Displaying HR details
System.out.println("Confidential Details:");
hrEmployee.confidentialDetails();

scanner.close();
}
}
