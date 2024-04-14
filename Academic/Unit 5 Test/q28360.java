package q28360;

import java.util.Scanner;
import java.util.regex.Pattern;

class InvalidTimeFormatException extends Exception {
public InvalidTimeFormatException(String message) {
super(message);
}
}

class TimeValidator {
public static void validateTime(String time) throws InvalidTimeFormatException {
if (!Pattern.matches("^([01]?\\d|2[0-3]):([0-5]?\\d):([0-5]?\\d)$", time)) {
throw new InvalidTimeFormatException("Invalid time format");
}
String[] parts = time.split(":");
int hours = Integer.parseInt(parts[0]);
int minutes = Integer.parseInt(parts[1]);
int seconds = Integer.parseInt(parts[2]);
if (hours < 0 || hours > 23 || minutes < 0 || minutes > 59 || seconds < 0 || seconds > 59) {
throw new InvalidTimeFormatException("Invalid time format");
}
}
}

public class Date {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

try {
System.out.print("Time (HH:MM:SS): ");
String time = scanner.nextLine();
TimeValidator.validateTime(time);
System.out.println("Time is valid: " + time);
} catch (InvalidTimeFormatException e) {
System.out.println("Error: " + e.getMessage());
} finally {
scanner.close();
}
}
}