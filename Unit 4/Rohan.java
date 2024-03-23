import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class AgeCalculator {

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.println("Enter friend's date of birth in the format dd-MM-yyyy:");
String dobInput = scanner.nextLine();
LocalDate dob = parseDate(dobInput);

System.out.println("Enter current date in the format dd-MM-yyyy:");
String currentDateInput = scanner.nextLine();
LocalDate currentDate = parseDate(currentDateInput);

Period period = Period.between(dob, currentDate);
int years = period.getYears();
int months = period.getMonths();
int days = period.getDays();

System.out.println("Age: " + years + " years, " + months + " months, " + days + " days");

scanner.close();
}

private static LocalDate parseDate(String dateInput) {
DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");
return LocalDate.parse(dateInput, formatter);
}
}