package q26233;

import java.util.Scanner;

interface PrimeNumberChecker {
boolean isPrime(int number);
}

public class PrimeNumber {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.print("Enter a number: ");
int number = scanner.nextInt();

PrimeNumberChecker checker = (int num) -> {
if (num <= 1) return false;
if (num <= 3) return true;
if (num % 2 == 0 || num % 3 == 0) return false;
for (int i = 5; i * i <= num; i += 6) {
if (num % i == 0 || num % (i + 2) == 0) return false;
}
return true;
};

boolean isPrime = checker.isPrime(number);
if (isPrime) {
System.out.println(number + " is a prime number");
} else {
System.out.println(number + " is not a prime number");
}

scanner.close();
}
}