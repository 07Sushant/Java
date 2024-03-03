package q24926;

import java.util.Scanner;

class Circle {
double radius;

void inputRadius() {
Scanner scr = new Scanner(System.in);
System.out.print("Enter the radius: ");
radius = scr.nextDouble();
}
}

class CircumferenceAndAreaCalc extends Circle {
void calculateCircumference() {
System.out.println("Circumference: " + (2 * Math.PI * this.radius));
}

void calculateArea() {
System.out.println("Area: " + (Math.PI * this.radius * this.radius));
}
}

public class Main {
public static void main(String[] args) {
CircumferenceAndAreaCalc circleData = new CircumferenceAndAreaCalc();
circleData.inputRadius();
circleData.calculateCircumference();
circleData.calculateArea();
}
}
