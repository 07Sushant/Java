import java.util.Scanner;

class Vehicle {
void start() {
// Base class start method
}
}

class Car extends Vehicle {
@Override
void start() {
System.out.println("Car: ignition key");
}
}

class Motorcycle extends Vehicle {
@Override
void start() {
System.out.println("Motorcycle: kickstarting");
}
}

class Truck extends Vehicle {
@Override
void start() {
System.out.println("Truck: ignition button");
}
}

public class Main {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
Vehicle[] vehicles = new Vehicle[3];

System.out.println("1. Car, 2. Motorcycle, 3. Truck: ");
for (int i = 0; i < 3; i++) {
int vehicleType = scanner.nextInt();

switch (vehicleType) {
case 1:
vehicles[i] = new Car();
break;
case 2:
vehicles[i] = new Motorcycle();
break;
case 3:
vehicles[i] = new Truck();
break;
default:
System.out.println("Invalid choice. Please enter 1, 2, or 3");
i--;
break;
}
}

for (int i = 0; i < 3; i++) {
vehicles[i].start();
}
}
}