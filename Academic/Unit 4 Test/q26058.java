package q26058;

import java.util.Scanner;

public class Rectangle {
private int length;
private int width;

public Rectangle(int length, int width) {
this.length = length;
this.width = width;
}

public class PerimeterCalculator {
public int calculatePerimeter() {
return 2 * (length + width);
}
}

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

// Input Length and width
System.out.print("Length: ");
int length = scanner.nextInt();
System.out.print("Width: ");
int width = scanner.nextInt();

// Create Rectangle object
Rectangle rectangle = new Rectangle(length, width);

// Create PerimeterCalculator object
PerimeterCalculator perimeterCalculator = rectangle.new PerimeterCalculator();

// Calculate perimeter
int perimeter = perimeterCalculator.calculatePerimeter();

// Print rectangle details
System.out.println("Rectangle Details:");
System.out.println("Length: " + rectangle.length);
System.out.println("Width: " + rectangle.width);
System.out.println("Perimeter: " + perimeter);

scanner.close();
}
}