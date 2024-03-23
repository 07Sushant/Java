package q22006;

import java.util.Scanner;

class BankAccount {
private double balance;

public BankAccount() {
this.balance = 0.0;
}

public BankAccount(double initialBalance) {
this.balance = initialBalance;
}

public double getBalance() {
return balance;
}

public void setBalance(double newBalance) {
this.balance = newBalance;
}
}

public class BankAccount {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

BankAccount account1 = new BankAccount();
System.out.println("Default Account Initial Balance: $" + account1.getBalance());

double initialBalanceInput = scanner.nextDouble();
BankAccount account2 = new BankAccount(initialBalanceInput);
System.out.println("Second Account Initial Balance: $" + account2.getBalance());

scanner.close();
}
}