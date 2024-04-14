package 928335;

import java.util.Scanner;

public class SeatNumberInput {

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
try {
int seatNumber = Integer.parseInt(scanner.nextLine());
System.out.println("Your seat number is: " + seatNumber);
} catch (NumberFormatException e) {
System.out.println("Error: Invalid input");
}
}
}