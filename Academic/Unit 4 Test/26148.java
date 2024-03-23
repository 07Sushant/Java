import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.TemporalAdjusters;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class NearestSaturday {

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

String inputDate = scanner.nextLine();
LocalDate desiredDate = parseDate(inputDate);

LocalDate nearestSaturday = findNearestSaturday(desiredDate);

System.out.println(nearestSaturday.format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));

scanner.close();
}

private static LocalDate parseDate(String dateInput) {
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
return LocalDate.parse(dateInput, formatter);
}

private static LocalDate findNearestSaturday(LocalDate desiredDate) {
return desiredDate.with(TemporalAdjusters.nextOrSame(DayOfWeek.SATURDAY));
}
}