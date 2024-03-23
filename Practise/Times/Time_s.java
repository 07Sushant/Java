import java.time.LocalDate;
import java.time.LocalTime;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeParseException;

public class Time_s {
    public static void main(String[] args) {
        // Current time
        LocalTime currentTime = LocalTime.now();
        System.out.println("Current time: " + currentTime);

        // Current time in New York
        LocalTime currentTimeInNewYork = LocalTime.now(ZoneId.of("Asia/Kolkata"));
        System.out.println("Current time in New York: " + currentTimeInNewYork);

        // Creating LocalTime objects
        LocalTime time1 = LocalTime.of(10, 30);
        System.out.println("Time 1: " + time1);

        LocalTime time2 = LocalTime.of(14, 45, 30);
        System.out.println("Time 2: " + time2);

        LocalTime time3 = LocalTime.of(16, 20, 15, 500000000);
        System.out.println("Time 3: " + time3);

        try {
            LocalTime parsedTime = LocalTime.parse("18:55:45");
            System.out.println("Parsed time: " + parsedTime);
        } catch (DateTimeParseException e) {
            System.out.println("Error parsing time: " + e.getMessage());
        }

        // Working with a LocalTime object
        LocalTime time = LocalTime.of(14, 30, 15, 500000000);
        System.out.println("Time: " + time);

        // Accessing components of a LocalTime object
        int hour = time.getHour();
        int minute = time.getMinute();
        int second = time.getSecond();
        int nano = time.getNano();

        System.out.println("Hour: " + hour);
        System.out.println("Minute: " + minute);
        System.out.println("Second: " + second);
        System.out.println("Nanosecond: " + nano);

        // Comparing LocalTime objects
        LocalTime anotherTime1 = LocalTime.of(12, 0);
        System.out.println("Is " + time + " after " + anotherTime1 + "? " + time.isAfter(anotherTime1));

        LocalTime anotherTime2 = LocalTime.of(16, 0);
        System.out.println("Is " + time + " before " + anotherTime2 + "? " + time.isBefore(anotherTime2));

        // Combining LocalTime with LocalDate to create LocalDateTime
        LocalDate date1 = LocalDate.of(2022, 3, 18);
        LocalDateTime dateTime = time.atDate(date1);
        System.out.println("DateTime: " + dateTime);

        // Modifying components of a LocalTime object
        LocalTime newTime1 = time.withHour(10);
        System.out.println("Time with hour set to 10: " + newTime1);

        LocalTime newTime2 = time.withMinute(45);
        System.out.println("Time with minute set to 45: " + newTime2);

        LocalTime newTime3 = time.withSecond(20);
        System.out.println("Time with second set to 20: " + newTime3);

        LocalTime newTime4 = time.withNano(999999999);
        System.out.println("Time with nanosecond set to 999999999: " + newTime4);

        // Adding and subtracting time
        LocalTime newTime5 = time.plusHours(2);
        System.out.println("Time plus 2 hours: " + newTime5);

        LocalTime newTime6 = time.plusMinutes(15);
        System.out.println("Time plus 15 minutes: " + newTime6);

        LocalTime newTime7 = time.plusSeconds(30);
        System.out.println("Time plus 30 seconds: " + newTime7);

        LocalTime newTime8 = time.plusNanos(1000000000);
        System.out.println("Time plus 1 second (in nanoseconds): " + newTime8);

        LocalTime newTime9 = time.minusHours(1);
        System.out.println("Time minus 1 hour: " + newTime9);

        LocalTime newTime10 = time.minusMinutes(10);
        System.out.println("Time minus 10 minutes: " + newTime10);

        LocalTime newTime11 = time.minusSeconds(5);
        System.out.println("Time minus 5 seconds: " + newTime11);

        LocalTime newTime12 = time.minusNanos(200000000);
        System.out.println("Time minus 200 milliseconds (in nanoseconds): " + newTime12);

        // Additional operations
        int hour1 = time.getHour();
        int minute1 = time.getMinute();
        int second1 = time.getSecond();

        System.out.println("Hour: " + hour1);
        System.out.println("Minute: " + minute1);
        System.out.println("Second: " + second1);

        LocalDateTime dateTime1 = time.atDate(date1).plusHours(2);
        System.out.println("DateTime after adding 2 hours: " + dateTime1);

        LocalDateTime dateTime2 = time.atDate(date1).plusMinutes(30);
        System.out.println("DateTime after adding 30 minutes: " + dateTime2);

        LocalDateTime dateTime3 = time.atDate(date1).minusHours(1);
        System.out.println("DateTime after subtracting 1 hour: " + dateTime3);
    }
}
