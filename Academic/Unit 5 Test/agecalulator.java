import java.util.Scanner;

public class AverageCalculator {

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.println("Enter a list of numbers separated by spaces:");
String input = scanner.nextLine();

try {
String[] numbers = input.split(" ");
double sum = 0;
int count = 0;
boolean nonNumericFound = false;

for (String number : numbers) {
try {
double num = Double.parseDouble(number);
sum += num;
count++;
} catch (NumberFormatException e) {
nonNumericFound = true;
}
}

if (nonNumericFound) {
System.out.println("Error: Non-numeric values in the list");
} else {
double average = sum / count;
System.out.println("Average: " + average);
}
} catch (Exception e) {
System.out.println("Error: Something went wrong");
}
}
}