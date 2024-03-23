import java.util.Scanner;

// Abstract class CoffeeMachine
abstract class CoffeeMachine {
int water;

abstract void addWater(int cups);
abstract void brewCoffee(int cups);
}

// Concrete subclass BasicCoffeeMachine
class BasicCoffeeMachine extends CoffeeMachine {
@Override
void addWater(int cups) {
water += cups;
System.out.println("Added " + cups + " cups of water to the coffee machine.");
}

@Override
void brewCoffee(int cups) {
if (water >= cups) {
water -= cups;
System.out.println("Brewed " + cups + " cups of coffee.");
} else {
System.out.println("Not enough water to brew coffee.");
}
}
}

public class Main {
public static void main(String[] args) {
// Create an instance of BasicCoffeeMachine
BasicCoffeeMachine coffeeMachine = new BasicCoffeeMachine();

// Create a Scanner object to get user input
Scanner scanner = new Scanner(System.in);

// Prompt the user for the number of cups of coffee
System.out.print("Enter the number of cups of coffee: ");
int coffeeCups = scanner.nextInt();

// Prompt the user for the number of cups of water
System.out.print("Enter the number of cups of water: ");
int waterCups = scanner.nextInt();

// Add water to the coffee machine
coffeeMachine.addWater(waterCups);

// Brew a cup of coffee
coffeeMachine.brewCoffee(coffeeCups);

// Close the scanner
scanner.close();
}
}
