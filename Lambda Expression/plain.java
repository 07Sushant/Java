@FunctionalInterface
interface Hello {
    void fun();
}

public class plain {
    public static void main(String[] args) {
        StringBuilder a = new StringBuilder("level");
        Hello obj = () -> {
            StringBuilder b = new StringBuilder(a);
            b.reverse();
            if (a.toString().equals(b.toString())) {
                System.out.println("Palindrome");
            } else {
                System.out.println("Not Palindrome");
            }
        };
        obj.fun();
    }
}

