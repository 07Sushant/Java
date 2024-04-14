import java.util.Scanner;

public class AccountNumberInput {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter your account number: ");
String input = scanner.nextLine();

try {
int accountNumber = Integer.parseInt(input);
System.out.println("Your account number is: " + accountNumber);
} catch (NumberFormatException e) {
System.out.println("Error: Invalid input");
}
}
}