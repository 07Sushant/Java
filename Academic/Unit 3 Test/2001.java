import java.util.Scanner;

class Car {
private String make;
private String model;

public Car(String make, String model) {
this.make = make;
this.model = model;
}

public void startAutonomous() {
System.out.println("Autonomous mode activated. Enjoy your ride in the " + make + " " + model + "!");
}

public void stopAutonomous() {
System.out.println("Autonomous mode deactivated. Your " + make + " " + model + " is now under manual control.");
}
}

public class Main {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the make of the car: ");
String make = scanner.nextLine();
System.out.print("Enter the model of the car: ");
String model = scanner.nextLine();
Car myCar = new Car(make, model);
myCar.startAutonomous();
myCar.stopAutonomous();
scanner.close();
}
}
