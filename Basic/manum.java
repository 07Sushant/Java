import java.util.*;
public class manum {
    public static int getLatgest(int number[]){
        int largest = Integer.MIN_VALUE;
        int smalllest = Integer.MIN_VALUE;
        for(int i = 0; i<number.length; i++)
        {
            if(largest <number [i])
            {
                largest = number[i];
            }
            if(smalllest>number[i])
            {
                smalllest= number[i];
            }
        }
        System.out.println("Smallest: " + smalllest );
        return largest;




    }
    public static void main(String[] args) {
        int number[] = {1,2,3,4,5};
        System.out.println("largest: " + getLatgest(number));
        
    }
    
}
