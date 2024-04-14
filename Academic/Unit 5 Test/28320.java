import java.util.Scanner;

public class CookingTimeConverter {

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.println("Enter the cooking time (hours:minutes):");
String input = scanner.nextLine();

try {
String[] timeParts = input.split(":");
if (timeParts.length != 2) {
throw new IllegalArgumentException("Invalid input");
}

int hours = Integer.parseInt(timeParts[0]);
int minutes = Integer.parseInt(timeParts[1]);

if (hours < 0 || minutes < 0) {
throw new IllegalArgumentException("Invalid input");
}

System.out.println(input);
System.out.println(hours + " hours and " + minutes + " minutes");

} catch (NumberFormatException e) {
System.out.println("Error: Invalid input");
} catch (IllegalArgumentException e) {
System.out.println("Error: Invalid input");
}

scanner.close();
}
}