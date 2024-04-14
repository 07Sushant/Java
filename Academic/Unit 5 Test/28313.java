import java.util.Scanner;

public class EventDurationConverter {

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

try {
int hours = Integer.parseInt(scanner.nextLine());
int minutes = Integer.parseInt(scanner.nextLine());

if (hours < 0 || minutes < 0) {
throw new IllegalArgumentException("Error: Input must be a non-negative integer");
}

int totalMinutes = hours * 60 + minutes;
System.out.println(totalMinutes);

} catch (NumberFormatException e) {
System.out.println("Error: Input must be integers");
} catch (IllegalArgumentException e) {
System.out.println(e.getMessage());
}

scanner.close();
}
}