package q24940;
import java.util.Scanner;

class Tool {
String toolName;
double rentalRate;

public Tool(String toolName, double rentalRate) {
this.toolName = toolName;
this.rentalRate = rentalRate;
}

public void displayInfo() {
System.out.println("Name: " + toolName);
System.out.println("Rental Rate: $" + rentalRate);
}
}

class PowerTool extends Tool {
String powerSource;

public PowerTool(String toolName, double rentalRate, String powerSource) {
super(toolName, rentalRate);
this.powerSource = powerSource;
}

@Override
public void displayInfo() {
super.displayInfo();
System.out.println("Details of a power tool:");
System.out.println("Power Source: " + powerSource);
}
}

public class ToolRentalSystem {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.println("Details for a tool:");
System.out.print("Tool Name: ");
String toolName = scanner.next();
System.out.print("Rental Rate: $");
double rentalRate = scanner.nextDouble();

System.out.println("Details for a power tool:");
System.out.print("Power Source: ");
String powerSource = scanner.next();

PowerTool powerTool = new PowerTool(toolName, rentalRate, powerSource);

System.out.println("Tool Details:");
powerTool.displayInfo();

scanner.close();
}
}
