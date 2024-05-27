// Create a LocalDate obj representing january 3,2007 Modify it to represent the 90th day of the same year. Print out the updated date
import java.time.LocalDate;

public class Q1 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2007, 1, 3);
        LocalDate newDate = date.withDayOfYear(90);
        System.out.println("Updated date: " + newDate);
    }
}
