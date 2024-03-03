package q23128;

import java.util.Scanner;

class Product {
protected String productName;
protected int quantity;

public void inputProductDetails() {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter product name: ");
productName = scanner.nextLine();
quantity = 0; // Initially set quantity to 0
}

public void displayQuantity() {
System.out.println("Current Quantity: " + quantity);
}
}

class Purchase extends Product {
private int purchaseQuantity;

public void inputPurchaseDetails() {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter quantity purchased: ");
purchaseQuantity = scanner.nextInt();
}

public void updateInventory() {
quantity += purchaseQuantity;
System.out.println("Inventory Updated Successfully!");
}
}

public class InventorySystem {
public static void main(String[] args) {
Purchase purchase = new Purchase();
purchase.inputProductDetails();
purchase.displayQuantity();
purchase.inputPurchaseDetails();
purchase.updateInventory();
purchase.displayQuantity();
}
}
