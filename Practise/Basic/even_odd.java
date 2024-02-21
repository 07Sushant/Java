import java.util.*;
public class even_odd {
    public static void even_odd_func(int n){
        int bitMask = 1;
        if((n & bitMask) == 0)
        {
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
        
    }
    public static void main(String[] args) {

        even_odd_func(3);
        even_odd_func(5);
        even_odd_func(10);
        
    }
}
