// package q23488;

import java.util.Scanner;

class Order {
public void placeOrder() {
System.out.println("Placing an order");
}
}

class FoodOrder extends Order {
@Override
public void placeOrder() {
Scanner scanner = new Scanner(System.in);
System.out.print("Type of food: ");
String foodType = scanner.nextLine();
System.out.print("Delivery address: ");
String deliveryAddress = scanner.nextLine();
System.out.println("Food order placed");
}
}

class ElectronicsOrder extends Order {
@Override
public void placeOrder() {
Scanner scanner = new Scanner(System.in);
System.out.print("Type of electronics: ");
String electronicsType = scanner.nextLine();
System.out.print("Shipping address: ");
String shippingAddress = scanner.nextLine();
System.out.println("Electronics order placed");
}
}

public class pizza488 {public static void main(String[] args) {
Order genericOrder = new Order();
genericOrder.placeOrder();

FoodOrder foodOrder = new FoodOrder();
foodOrder.placeOrder();

ElectronicsOrder electronicsOrder = new ElectronicsOrder();
electronicsOrder.placeOrder();
}
}