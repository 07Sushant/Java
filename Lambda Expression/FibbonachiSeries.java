@FunctionalInterface
interface KK22GB {
    void fibbo(int n);
}

public class FibbonachiSeries {
    public static void main(String[] args) {
        KK22GB fib = (n) -> {
            int a = 0, b = 1;
            System.out.println("Fibonacci Series:");
            for (int i = 0; i < n; i++) {
                System.out.print(a + " ");
                int temp = a + b;
                a = b;
                b = temp;
            }
        };
        
        int terms = 10; 
        fib.fibbo(terms);
    }
}
