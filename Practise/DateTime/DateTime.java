import java.time.LocalDate;
import java.time.Month;
import java.time.DayOfWeek;

public class DateTime {
    public static void main(String[] args) {
        
        // Getting current date
        LocalDate today = LocalDate.now();

        // Getting year
        int year = today.getYear();
        System.out.println("Year: " + year);

        // Getting day of month
        int date = today.getDayOfMonth();
        System.out.println("Date: " + date);

        // Getting month value
        int month = today.getMonthValue();
        System.out.println("Month: " + month);
        
        // Getting name of the month
        Month monthName = today.getMonth();
        System.out.println("Month Name: " + monthName);

        // Getting day of week
        DayOfWeek dayOfWeek = today.getDayOfWeek();
        System.out.println("Day of Week: " + dayOfWeek);
        
        // Getting length of month
        int lengthOfMonth = today.lengthOfMonth();
        System.out.println("Length of Month: " + lengthOfMonth);

        // Getting length of year
        int lengthOfYear = today.lengthOfYear();
        System.out.println("Length of Year: " + lengthOfYear);

        // Checking if it's a leap year
        boolean isLeapYear = today.isLeapYear();
        System.out.println("Is Leap Year: " + isLeapYear);

        // Getting day of year
        int dayOfYear = today.getDayOfYear();
        System.out.println("Day of Year: " + dayOfYear);
        
        // Getting the next day
        LocalDate nextDay = today.plusDays(1);
        System.out.println("Next Day: " + nextDay);

        // Getting the previous day
        LocalDate previousDay = today.minusDays(1);
        System.out.println("Previous Day: " + previousDay);

        // Checking if the date is before another date
        LocalDate anotherDate = LocalDate.of(2024, 3, 20);
        boolean isBefore = today.isBefore(anotherDate);
        System.out.println("Is Before: " + isBefore);

        // Checking if the date is after another date
        boolean isAfter = today.isAfter(anotherDate);
        System.out.println("Is After: " + isAfter);
    }
}
