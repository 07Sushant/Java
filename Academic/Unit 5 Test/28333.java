package q28333;

import java.util.Scanner;

public class AgeInput {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter your age: ");

try {
int age = Integer.parseInt(scanner.nextLine());
System.out.println("Your age is: " + age);
} catch (NumberFormatException e) {
System.out.println("Error: Invalid input");
}
}
}