package q27373;

import java.util.Scanner;

interface Calculator {
void performOperation(int a, int b);
}

public class MathOperations {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int num1 = scanner.nextInt();
int num2 = scanner.nextInt();

// Implementing Calculator interface using anonymous inner class
Calculator calculator = new Calculator() {
@Override
public void performOperation(int a, int b) {
int result = a + b;
System.out.println(result);
}
};

// Performing the operation
calculator.performOperation(num1, num2);

scanner.close();
}
}