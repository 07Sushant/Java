import java.util.Scanner;

class Account {
protected String accountNumber;
protected double balance;

public void inputDetails() {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter account number: ");
accountNumber = scanner.nextLine();
}

public void displayBalance() {
System.out.println("Current balance: " + balance);
}
}

class Transaction extends Account {
private double amount;

public void inputAmount() {
Scanner scanner = new Scanner(System.in);
System.out.print("Enter transaction amount: ");
amount = scanner.nextDouble();
}

public void performTransaction() {
balance += amount;
System.out.println("Transaction Successful!");
displayBalance();
}
}

public class BankingSystem {
public static void main(String[] args) {
Transaction transaction = new Transaction();
transaction.inputDetails();
transaction.displayBalance();
transaction.inputAmount();
transaction.performTransaction();
}
}
