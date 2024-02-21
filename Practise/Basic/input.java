import java.util.Scanner;

public class input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("Enter any number: ");
        int number  = sc.nextInt();
        if(number%2==0)
        {
            System.err.println("The number: " + number + " is Even");
        }
        else{
            System.err.println("The number: " + number + " is Odd");
        }
        
    }
}
