import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class Q3 {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(14, 30);

        time = time.plusHours(2)
                    .plusMinutes(15)
                    .plusSeconds(30)
                    .plusNanos(1);
        System.out.println("Updated time: " + time);
    }
}
