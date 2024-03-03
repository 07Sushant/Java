import java.util.Scanner;

class Calculation {
protected int num1;
protected int num2;

public Calculation(int num1, int num2) {
this.num1 = num1;
this.num2 = num2;
}

public int subtraction() {
return num1 - num2;
}
}

class My_Calculation extends Calculation {
public My_Calculation(int num1, int num2) {
super(num1, num2);
}

public int multiplication() {
return num1 * num2;
}
}

public class test923 {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
int run1 = scanner.nextInt();
int run2 = scanner.nextInt();

My_Calculation myCalculation = new My_Calculation(run1, run2);
int diff = myCalculation.subtraction();
int product = myCalculation.multiplication();

System.out.println(diff);
System.out.println(product);

scanner.close();
}
}
