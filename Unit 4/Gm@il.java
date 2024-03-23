package q27375;

import java.util.Scanner;

interface Validator {
boolean isValid(String input);
}

public class StringValidator {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
String inputString = scanner.nextLine();

Validator alphabeticValidator = new Validator() {
@Override
public boolean isValid(String input) {
return input.matches("[a-zA-Z]+");
}
};

if (alphabeticValidator.isValid(inputString)) {
System.out.println(inputString + " is valid");
} else {
System.out.println(inputString + " is invalid");
}

scanner.close();
}
}