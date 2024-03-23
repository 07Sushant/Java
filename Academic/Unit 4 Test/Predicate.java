package q27362;

import java.util.Scanner;

interface Predicate {
    boolean test(int number);
}

public class NumberTester {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        // Anonymous class implementation of Predicate interface
        Predicate predicate = new Predicate() {
            @Override
            public boolean test(int number) {
                return number % 2 == 0;
            }
        };

        // Check if the number is even or odd
        String result = predicate.test(number) ? "Even" : "Odd";
        System.out.println(number + " is " + result);

        scanner.close();
    }
}