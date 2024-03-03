// File Name: q24933/Main.java
package q24933;

import java.util.Scanner;

class Vehicle {
String make, model;
}

class CarInfo extends Vehicle {
void inputCarDetails() {
Scanner scr = new Scanner(System.in);
System.out.print("Enter car make: ");
this.make = scr.nextLine();
System.out.print("Enter car model: ");
this.model = scr.nextLine();
}

void displayCarInfo() {
System.out.println("Car Make: " + this.make + "\nCar Model: " + this.model);
}
}

public class Main {
public static void main(String[] args) {
CarInfo carData = new CarInfo();
carData.inputCarDetails();
carData.displayCarInfo();
}
}
