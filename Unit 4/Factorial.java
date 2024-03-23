package q927352;

import java.util.Scanner;

public class Main {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int input = scanner.nextInt();
FactorialCalculator factorialCalculator = new FactorialCalculator(input);
FactorialCalculator.FactorialFinder factorialFinder = factorialCalculator.new FactorialFinder();
int factorial = factorialFinder.calculateFactorial();
if (factorial == -1)
System.out.println("Enter positive number");
else
System.out.println(factorial);
scanner.close();
}
}

class FactorialCalculator {
private int number;

public FactorialCalculator(int number) {
this.number = number;
}

public class FactorialFinder {
public int calculateFactorial() {
if (number < 0) {
return -1;
} else {
int result = 1;
for (int i = 1; i <= number; i++) {
result *= i;
}
return result;
}
}
}
}