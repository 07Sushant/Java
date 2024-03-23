import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class WeekdayCounter {

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

String startDateInput = scanner.nextLine();
LocalDate startDate = parseDate(startDateInput);

String endDateInput = scanner.nextLine();
LocalDate endDate = parseDate(endDateInput);

long weekdays = calculateWeekdays(startDate, endDate);

System.out.println(weekdays);

scanner.close();
}

private static LocalDate parseDate(String dateInput) {
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
return LocalDate.parse(dateInput, formatter);
}

private static long calculateWeekdays(LocalDate startDate, LocalDate endDate) {
long weekdays = 0;
LocalDate date = startDate;
while (!date.isAfter(endDate)) {
if (date.getDayOfWeek() != DayOfWeek.SATURDAY && date.getDayOfWeek() != DayOfWeek.SUNDAY) {
weekdays++;
}
date = date.plusDays(1);
}
return weekdays;
}
}