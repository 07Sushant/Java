import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class Main {
    public static void main(String[] args) {
        LocalDate date1 = LocalDate.of(2024, 3, 22); // Example date
        LocalTime time = LocalTime.of(10, 0); // Example time

        // Adding 2 hours to the LocalDateTime
        LocalDateTime dateTime1 = time.atDate(date1).plusHours(2);
        System.out.println("DateTime after adding 2 hours: " + dateTime1);

        // Adding 30 minutes to the LocalDateTime
        LocalDateTime dateTime2 = time.atDate(date1).plusMinutes(30);
        System.out.println("DateTime after adding 30 minutes: " + dateTime2);

        // Subtracting 1 hour from the LocalDateTime
        LocalDateTime dateTime3 = time.atDate(date1).minusHours(1);
        System.out.println("DateTime after subtracting 1 hour: " + dateTime3);

        // Additional methods you mentioned
        LocalDate date = LocalDate.of(2024, 3, 22); // Example date
        LocalTime time2 = LocalTime.of(12, 30); // Example time

        // Using the static method of(LocalDate, LocalTime) to create a LocalDateTime
        LocalDateTime dateTime4 = LocalDateTime.of(date, time2);
        System.out.println("Created DateTime using 'of' method: " + dateTime4);

        // Parsing a textual representation of date-time
        String text = "2024-03-22T12:30:00"; // Example text
        LocalDateTime dateTime5 = LocalDateTime.parse(text);
        System.out.println("Parsed DateTime using 'parse' method: " + dateTime5);
    }
}
