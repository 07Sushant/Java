package q22045;

import java.util.Scanner;

class Shape {
public double calculateArea() {
return 0;
}
}

class Circle extends Shape {
private double radius;

public Circle(double radius) {
this.radius = radius;
}

@Override
public double calculateArea() {
return Math.PI * radius * radius;
}
}

class Rectangle extends Shape {
private double length;
private double width;

public Rectangle(double length, double width) {
this.length = length;
this.width = width;
}

@Override
public double calculateArea() {
return length * width;
}
}

public class Main {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

double circleRadius = scanner.nextDouble();
Circle circle1 = new Circle(circleRadius);

double rectangleLength = scanner.nextDouble();
double rectangleWidth = scanner.nextDouble();
Rectangle rectangle1 = new Rectangle(rectangleLength, rectangleWidth);

double circleArea = circle1.calculateArea();
double rectangleArea = rectangle1.calculateArea();

System.out.println("Circle Area: " + circleArea);
System.out.println("Rectangle Area: " + rectangleArea);

scanner.close();
}
}