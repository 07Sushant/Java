import java.time.LocalDate;

public class Q2 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2007, 1, 3);
        LocalDate updatedDate = date.withMonth(12); // to change the month only
        System.out.println("Updated date: " + updatedDate);
    }
}


