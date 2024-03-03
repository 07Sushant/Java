import java.util.Scanner;

class Beverage {
public void orderBeverage() {
System.out.println("Ordering a beverage");
}
}

class Coffee extends Beverage {
@Override
public void orderBeverage() {
Scanner scanner = new Scanner(System.in);
System.out.print("Coffee type: ");
String coffeeType = scanner.nextLine();
System.out.print("size of the coffee: ");
String size = scanner.nextLine();
System.out.println("Ordered Coffee Details:");
System.out.println("Coffee Type: " + coffeeType);
System.out.println("Size: " + size);
}
}

class Tea extends Beverage {
@Override
public void orderBeverage() {
Scanner scanner = new Scanner(System.in);
System.out.print("Tea type: ");
String teaType = scanner.nextLine();
System.out.print("Sweetness level: ");
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
