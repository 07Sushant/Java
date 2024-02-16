import java.util.*;
public class Ten_factor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Enter num: ");
            int n = sc.nextInt();
            if(n % 10 == 0){
                continue;}   // break
            System.out.println(n);}
        while(true);
    }
}

