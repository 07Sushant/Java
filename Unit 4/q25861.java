import java.util.Scanner;

@FunctionalInterface
interface NumberSquarer {
int square(int number);
}

public class SquareNumber {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.print("Enter a number: ");
int number = scanner.nextInt();

NumberSquarer squarer = n -> n * n;
int squaredNumber = squarer.square(number);

System.out.println("Squared number: " + squaredNumber);
}
}