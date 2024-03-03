package q23014;
import java.util.Scanner;

class Product {
String productName;
double price;
int quantity;

public Product(String productName, double price, int quantity) {
this.productName = productName;
this.price = price;
this.quantity = quantity;
}

public void displayInfo() {
System.out.println("Product Name: " + productName);
System.out.println("$" + price);
System.out.println("Quantity: " + quantity);
}
}

class ElectronicProduct extends Product {
int warrantyPeriod;

public ElectronicProduct(String productName, double price, int quantity, int warrantyPeriod) {
super(productName, price, quantity);
this.warrantyPeriod = warrantyPeriod;
}

@Override
public void displayInfo() {
super.displayInfo();
System.out.println("Warranty Period: " + warrantyPeriod + " months");
}
}

public class ProductInventorySystem {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.println("Enter details for a product:");
System.out.print("Product Name: ");
String productName = scanner.next();
System.out.print("$");
double price = scanner.nextDouble();
System.out.print("Quantity: ");
int quantity = scanner.nextInt();

System.out.println("Enter details for an electronic product:");
System.out.print("Warranty Period (months): ");
int warrantyPeriod = scanner.nextInt();

ElectronicProduct electronicProduct = new ElectronicProduct(productName, price, quantity, warrantyPeriod);
System.out.println("Product Details:");
electronicProduct.displayInfo();

scanner.close();
}
}
