package 28189;

import java.util.Scanner;

public class StringParser {

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter a string to parse: ");

try {
String input = scanner.nextLine();
double parsedNumber = Double.parseDouble(input);
System.out.println("Parsed number: " + parsedNumber);
} catch (NumberFormatException e) {
System.out.println("Error: Invalid number format");
}
}
}