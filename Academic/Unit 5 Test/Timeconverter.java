package q28337;

import java.util.Scanner;

public class TimeConverter {

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter the time in seconds: ");

try {
int seconds = Integer.parseInt(scanner.nextLine());

if (seconds < 0) {
System.out.println("Time cannot be negative");
} else {
double minutes = seconds / 60.0;
System.out.printf("%.2f\n", minutes);
}
} catch (NumberFormatException e) {
System.out.println("Error: Invalid input");
}
}
}