import java.time.LocalDate;

public class Q4 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.parse(args[0]);
        int years = Integer.parseInt(System.console().readLine("years to add: "));
        int month = Integer.parseInt(System.console().readLine("months to add: "));
        int day = Integer.parseInt(System.console().readLine("days to add: "));
        LocalDate updatedDate = date.plusYears(years).plusMonths(month).plusDays(day);
        System.out.println("Updated date: " + updatedDate);
    }
}
