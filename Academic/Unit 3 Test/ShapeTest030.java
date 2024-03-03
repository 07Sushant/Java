import java.util.Scanner;

class Shape {
public void calculateArea() {
System.out.println("Calculating area of Shape");
}
}

class Circle extends Shape {
@Override
public void calculateArea() {
Scanner scanner = new Scanner(System.in);
System.out.print("radius of circle: ");
double radius = scanner.nextDouble();
double area = Math.PI * radius * radius;
System.out.printf("Area of circle: %.2f\n", area);
}
}

class Rectangle extends Shape {
@Override
public void calculateArea() {
Scanner scanner = new Scanner(System.in);
System.out.print("length of rectangle: ");
double length = scanner.nextDouble();
System.out.print("width of rectangle: ");
double width = scanner.nextDouble();
double area = length * width;
System.out.printf("Area of rectangle: %.2f\n", area);
}
}

public class ShapeTest030 {
public static void main(String[] args) {
Shape shape = new Shape();
shape.calculateArea();

Circle circle = new Circle();
circle.calculateArea();

Rectangle rectangle = new Rectangle();
rectangle.calculateArea();
}
}
