import java.util.Scanner;

public class userinput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float rad = scanner.nextFloat();
        float area = 3.14f * rad * rad;
        System.out.println(area);
    
    }
}