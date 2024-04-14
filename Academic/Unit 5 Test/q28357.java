package 928357;

import java.util.Scanner;
import java.util.regex.Pattern;

class InvalidCreditCardException extends Exception {
public InvalidCreditCardException(String message) {
super(message);
}
}

class CreditCardValidator {
public static void validateCreditCard(String creditCardNumber) throws InvalidCreditCardException {
if (!Pattern.matches("\\d{4}-\\d{4}-\\d{4}-\\d{4}", creditCardNumber)) {
throw new InvalidCreditCardException("Invalid credit card number format");
}
}
}

public class CreditCard {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

try {
System.out.print("Credit card number: ");
String creditCardNumber = scanner.nextLine();
CreditCardValidator.validateCreditCard(creditCardNumber);
System.out.println("Credit card number is valid: " + creditCardNumber);
} catch (InvalidCreditCardException e) {
System.out.println("Error: " + e.getMessage());
} finally {
scanner.close();
}
}
}