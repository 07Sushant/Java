import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DayOfWeek {

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
String inputDate = scanner.nextLine();

DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
LocalDate date = LocalDate.parse(inputDate, formatter);

String dayOfWeek = date.getDayOfWeek().toString();
dayOfWeek = dayOfWeek.substring(0, 1) + dayOfWeek.substring(1).toLowerCase();

System.out.println(dayOfWeek);

scanner.close();
}
}