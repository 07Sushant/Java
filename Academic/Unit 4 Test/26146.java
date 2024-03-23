import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class SalaryDay {

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.println("Enter the salary date in the format dd-MM-yyyy:");
String salaryDateInput = scanner.nextLine();
LocalDate salaryDate = parseDate(salaryDateInput);

DayOfWeek dayOfWeek = salaryDate.getDayOfWeek();

System.out.println(dayOfWeek);

scanner.close();
}

private static LocalDate parseDate(String dateInput) {
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
return LocalDate.parse(dateInput, formatter);
}
}