import java.util.Scanner;

public class PowerCalculator {

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.println("Enter the base:");
int base = scanner.nextInt();
System.out.println("Enter the exponent:");
int exponent = scanner.nextInt();

try {
if (exponent < 0) {
throw new IllegalArgumentException("Negative exponent");
}

int result = (int) Math.pow(base, exponent);
System.out.println(result);
} catch (IllegalArgumentException e) {
System.out.println("Error: Negative exponent");
}
}
}