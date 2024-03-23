package q26053;

import java.util.Scanner;

public class Circle {
private int radius;

public Circle(int radius) {
this.radius = radius;
}

public class AreaCalculator {
public double calculateArea() {
return Math.PI * radius * radius;
}
}

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

int userGivenRadius = scanner.nextInt();
Circle circle = new Circle(userGivenRadius);
Circle.AreaCalculator areaCalculator = circle.new AreaCalculator();
double area = areaCalculator.calculateArea();
String formattedArea = String.format("%.2f", area);
System.out.println(formattedArea);

scanner.close();
}
}