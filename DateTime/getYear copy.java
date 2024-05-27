import java.util.*;
import java.time.LocalDate;


public class getYear {
    public static void main(String[] args) {
    LocalDate today = LocalDate.now();

    int year = today.getYear();
    int date = today.getDayOfMonth();
    int month = today.getMonthValue();
    
    System.out.println(year);
    System.out.println(date);
    System.out.println(month);
    //to get the name of the month
    System.out.println(today.getMonth());
    System.out.println(today.getDayOfWeek());
    


    }
    
}
