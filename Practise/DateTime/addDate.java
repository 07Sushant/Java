import java.time.LocalDate;

public class addDate {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(1999, 12, 31);
        System.out.println(date.plusDays(4500).getDayOfWeek());    
    
    }   
}
