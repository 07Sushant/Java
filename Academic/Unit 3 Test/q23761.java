package q23761;
import java.util.Scanner;

class Beverage {
void orderBeverage() {
System.out.println("Ordering a beverage");
}
}

class Coffee extends Beverage {
@Override
void orderBeverage() {
Scanner scanner = new Scanner(System.in);
System.out.println("Coffee type: ");
String coffeeType = scanner.nextLine();
System.out.println("Size of the coffee: ");
String size = scanner.nextLine();
System.out.println("Ordered Coffee Details:");
System.out.println("Coffee Type: " + coffeeType);
System.out.println("Size: " + size);
}
}

class Tea extends Beverage {
@Override
void orderBeverage() {
Scanner scanner = new Scanner(System.in);
System.out.println("Tea type: ");
String teaType = scanner.nextLine();
System.out.println("Sweetness level: ");
String sweetnessLevel = scanner.nextLine();
System.out.println("Ordered Tea Details:");
System.out.println("Tea Type: " + teaType);
System.out.println("Sweetness Level: " + sweetnessLevel);
}
}

public class BeverageOrder {
public static void main(String[] args) {
Beverage beverage = new Beverage();
beverage.orderBeverage();
Coffee coffee = new Coffee();
coffee.orderBeverage();
Tea tea = new Tea();
tea.orderBeverage();
}
}
