package q25886;
import java.util.Scanner;
interface ProductCalculator {
long calculateProduct(int[] numbers);
}

public class ProductLambda {
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);

System.out.print("Size of the array: ");
int size = scanner.nextInt();

int[] array = new int[size];
for (int i = 0; i < size; i++) {
System.out.print("Element " + (i + 1) + ": ");
array[i] = scanner.nextInt();
}

ProductCalculator calculator = (int[] numbers) -> {
long product = 1;
for (int num : numbers) {
product *= num;
}
return product;
};

long result = calculator.calculateProduct(array);
System.out.println("Product: " + result);

scanner.close();
}
}