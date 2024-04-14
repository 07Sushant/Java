package q28182;

import java.util.Scanner;

public class DivisionCalc {

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

int numerator = scanner.nextInt();

int denominator = scanner.nextInt();

try {
double result = divide(numerator, denominator);
System.out.println(result);
} catch (ArithmeticException e) {
System.out.println("Error: Division by zero is not possible");
}
}

public static double divide(int numerator, int denominator) {
if (denominator == 0) {
throw new ArithmeticException();
}
return (double) numerator / denominator;
}
}