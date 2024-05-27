import java.time.LocalDate;

public class DateTimes {

    public static LocalDate plusYears(LocalDate date, long yearsToAdd) {
        return date.plusYears(yearsToAdd);
    }

    public static LocalDate plusMonths(LocalDate date, long monthsToAdd) {
        return date.plusMonths(monthsToAdd);
    }

    public static LocalDate plusWeeks(LocalDate date, long weeksToAdd) {
        return date.plusWeeks(weeksToAdd);
    }

    public static LocalDate plusDays(LocalDate date, long daysToAdd) {
        return date.plusDays(daysToAdd);
    }

    public static LocalDate minusYears(LocalDate date, long yearsToSubtract) {
        return date.minusYears(yearsToSubtract);
    }

    public static LocalDate minusMonths(LocalDate date, long monthsToSubtract) {
        return date.minusMonths(monthsToSubtract);
    }

    public static LocalDate minusWeeks(LocalDate date, long weeksToSubtract) {
        return date.minusWeeks(weeksToSubtract);
    }

    public static LocalDate minusDays(LocalDate date, long daysToSubtract) {
        return date.minusDays(daysToSubtract);
    }

    public static void main(String[] args) {
        // Example usage
        LocalDate currentDate = LocalDate.now();
        System.out.println("Current date: " + currentDate);

        LocalDate futureDate = plusYears(currentDate, 5);
        System.out.println("Date after adding 5 years: " + futureDate);

        LocalDate pastDate = minusMonths(currentDate, 3);
        System.out.println("Date 3 months ago: " + pastDate);
    }
}
