import java.util.Scanner;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class TotalHoursWorked {

public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

String startTimeInput = scanner.nextLine();
LocalTime startTime = LocalTime.parse(startTimeInput);

String endTimeInput = scanner.nextLine();
LocalTime endTime = LocalTime.parse(endTimeInput);

double totalHoursWorked = calculateTotalHours(startTime, endTime);

System.out.printf("%.2f%n", totalHoursWorked);

scanner.close();
}

private static double calculateTotalHours(LocalTime startTime, LocalTime endTime) {
return (double) startTime.until(endTime, ChronoUnit.MINUTES) / 60;
}
}