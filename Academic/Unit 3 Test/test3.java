// File Name: q24937/Main.java
package q24937;

import java.util.Scanner;

class MathOperation {
int number1, number2;
}

class ArithmeticOperations extends MathOperation {
void inputNumbers() {
Scanner scr = new Scanner(System.in);
System.out.print("Enter first number: ");
this.number1 = scr.nextInt();
System.out.print("Enter second number: ");
this.number2 = scr.nextInt();
}

void displaySum() {
System.out.println("Sum: " + (this.number1 + this.number2));
}

void displayDifference() {
System.out.println("Difference: " + (this.number1 - this.number2));
}

void displayProduct() {
System.out.println("Product: " + (this.number1 * this.number2));
}

void displayQuotient() {
if (number2 == 0)
System.out.println("Cannot divide by zero. Quotient is undefined.");
else {
double q = (double) this.number1 / this.number2;
System.out.println("Quotient: " + q);
}
}
}

public class Main {
public static void main(String[] args) {
ArithmeticOperations mathOps = new ArithmeticOperations();
mathOps.inputNumbers();
mathOps.displaySum();
mathOps.displayDifference();
mathOps.displayProduct();
mathOps.displayQuotient();
}
}
