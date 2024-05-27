import java.util.*;
@FunctionalInterface
interface KK22GB {
    void palindrome(int n);
}

public class palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        KK22GB pal = (n) -> {
            int x = n;
            int reversedNum = 0;
            while (x != 0) {
                int remainder = x % 10;
                reversedNum = reversedNum * 10 + remainder;
                x /= 10;
            }
            if (n == reversedNum)
                System.out.println(n + " is a palindrome.");
            else
                System.out.println(n + " is not a palindrome.");
        };
        pal.palindrome(num);
    }
}
