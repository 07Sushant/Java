public class Nested_try_catch {
    public static void main(String[] args) {
        System.out.println("Hello World");
        int a = 10, b = 0, c;
        try {
            try {
                c = a / b;
            } catch (ArithmeticException ae) {
                System.out.println("ArithmeticException caught: Division by zero");
                throw ae;
            }
        } catch (Exception e) {
            System.out.println("General exception caught: Error handling");
        }
        System.out.println(b);
        System.out.println("Bye Class");
    }
}
