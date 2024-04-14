package 928358;

import java.util.Scanner;
import java.util.regex.Pattern;

class InvalidipAddressException extends Exception {
public InvalidipAddressException(String message) {
super(message);
}
}

class IpAddressValidator {
public static void validateIpAddress(String ipAddress) throws InvalidipAddressException {
if (!Pattern.matches("\\b(?:\\d{1,3}\\.){3}\\d{1,3}\\b", ipAddress)) {
throw new InvalidipAddressException("Invalid IP address format");
}
String[] parts = ipAddress.split("\\.");
for (String part : parts) {
int num = Integer.parseInt(part);
if (num < 0 || num > 255) {
throw new InvalidipAddressException("Invalid IP address format");
}
}
}
}

public class IpAddress {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

try {
System.out.print("IP address (XXX.XXX.XXX.XXX): ");
String ipAddress = scanner.nextLine();
IpAddressValidator.validateIpAddress(ipAddress);
System.out.println("IP address is valid: " + ipAddress);
} catch (InvalidipAddressException e) {
System.out.println("Error: " + e.getMessage());
} finally {
scanner.close();
}
}
}